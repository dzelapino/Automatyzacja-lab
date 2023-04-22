CREATE USER keycloak WITH ENCRYPTED PASSWORD 'password';
CREATE DATABASE keycloak;
GRANT ALL PRIVILEGES ON DATABASE keycloak TO keycloak;

DROP TABLE IF EXISTS games;
CREATE TABLE games(id serial PRIMARY KEY, name VARCHAR(255));
INSERT INTO games(name) VALUES('Halo');
INSERT INTO games(name) VALUES('Halo 2');
INSERT INTO games(name) VALUES('Halo 3');
INSERT INTO games(name) VALUES('Halo Reach');
INSERT INTO games(name) VALUES('Call of Duty 2');
INSERT INTO games(name) VALUES('Call of Duty 2 Big Red One');
INSERT INTO games(name) VALUES('Gears of War 3');
INSERT INTO games(name) VALUES('Star Wars Jedi Knight Dark Forces 2');