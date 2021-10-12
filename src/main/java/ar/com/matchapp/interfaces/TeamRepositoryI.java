package ar.com.matchapp.interfaces;

import java.util.List;

import ar.com.matchapp.model.Player;

public interface TeamRepositoryI {
	List<Player> getTeamPlayers();
	Player findByName(String name);
}
