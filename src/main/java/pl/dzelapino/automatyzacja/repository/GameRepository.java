package pl.dzelapino.automatyzacja.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import pl.dzelapino.automatyzacja.model.Game;

@Repository
public interface GameRepository extends CrudRepository<Game, Long> {
}
