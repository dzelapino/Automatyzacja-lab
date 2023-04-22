package pl.dzelapino.automatyzacja.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pl.dzelapino.automatyzacja.model.Game;
import pl.dzelapino.automatyzacja.repository.GameRepository;

import java.util.List;

@Service
public class GameService implements IGameService {

    @Autowired
    private GameRepository repository;

    @Override
    public List<Game> findAll() {
        return (List<Game>) repository.findAll();
    }
}
