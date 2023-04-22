pipeline {
    agent any

    environment {
        DOCKERHUB_CREDENTIALS=credentials('dockerhub-kkolodziejski')
    }

    options {
        timeout(5)
        gitLabConnection('GitLab')
    }
    triggers {
        gitlab(
        triggerOnPush: true,
        triggerOnMergeRequest: true,
        branchFilterType: 'All',
        addVoteOnMergeRequest: true)
    }

    stages {
        stage('Hello') {
            steps {
                echo 'Hello World'
            }
        }
        stage('Unit Tests') {
            steps {
                echo 'Running tests!'
                sh 'mvn test'
            }
        }
        stage('Build') {
            steps {
                echo 'Running build!'
                sh 'docker build -t kkolodziejski/automatyzacja .'
            }
        }
        stage('Login') {
            steps {
                echo 'Logging in!'
                sh 'echo $DOCKERHUB_CREDENTIALS_PSW | docker login -u $DOCKERHUB_CREDENTIALS_USR --password-stdin'
            }
        }
        stage('Push') {
            steps {
                echo 'Pushing!'
                sh 'docker push kkolodziejski/automatyzacja'
            }
        }
    }

    post {
        always {
           script {
                  if (getContext(hudson.FilePath)) {
                      sh 'docker logout'
                  }
              }
//     		sh 'docker logout'
    	}
    }
}