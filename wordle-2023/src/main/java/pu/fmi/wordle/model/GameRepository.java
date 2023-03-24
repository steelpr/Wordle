package pu.fmi.wordle.model;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Collection;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import pu.fmi.wordle.model.Game.GameState;

public interface GameRepository extends JpaRepository<Game, String> {
	Collection<Game> queryFirst10ByStateNotOrderByStartedOnDesc(GameState state);
	  
	@Query("select a from Game a where a.startedOn < :gamesAfter24Hour and a.state = :state")
	Collection<Game> findFirst10ByStartedOnBeforeAndStateOrderByAsc(GameState state, LocalDateTime gamesAfter24Hour);
	  
}
