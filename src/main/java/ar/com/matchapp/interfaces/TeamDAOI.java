package ar.com.matchapp.interfaces;

import ar.com.matchapp.model.Team;

public interface TeamDAOI {
	void create(Team team);
	Team read(int id);
	void update(Team team);
	void delete(Team name);

}
