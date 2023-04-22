package pl.dzelapino.automatyzacja.service;

import pl.dzelapino.automatyzacja.model.Game;

import java.util.List;

public interface IGameService {
    List<Game> findAll();
}
