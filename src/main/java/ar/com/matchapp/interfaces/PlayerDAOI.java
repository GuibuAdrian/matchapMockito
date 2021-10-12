package ar.com.matchapp.interfaces;

import java.util.List;

import ar.com.matchapp.model.Player;
import ar.com.matchapp.model.Team;

public interface PlayerDAOI {
	void create(Player player);
	Player read(int id);
	void update(Player player);
	void delete(String name);
	List<Player> findByTeam(Team team);
}
