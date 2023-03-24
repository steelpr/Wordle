package pu.fmi.wordle.logic;

import java.util.Collection;

import pu.fmi.wordle.model.Game;

public interface GameService {

	Collection<Game> listLast10();
	
	Collection<Game> listLast10ByHour();
	
	Game startNewGame();

	Game getGame(String id);

	Game makeGuess(String id, String word);
}
