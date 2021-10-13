package ar.com.matchapp.model;

import ar.com.matchapp.enums.TeamErrorCode;
import ar.com.matchapp.error.TeamException;
import ar.com.matchapp.interfaces.TeamDAOI;

import java.util.ArrayList;
import java.util.List;

public class TeamDAO implements TeamDAOI {
	private static TeamDAO teamDao;
	private List<Team> teamList;

	public static TeamDAO getTeamDAO() {
		if(teamDao == null) {
			teamDao = new TeamDAO();
			teamDao.teamList = new ArrayList<Team>();
	        Team newells = new Team("Newells", 2);
	        Team river = new Team("River", 1);
	        teamDao.teamList.add(river);
	        teamDao.teamList.add(newells);
		}
		return teamDao;
	}

	@Override
	public void create(Team team) {
		teamDao.teamList.add(team);
	}

	@Override
	public Team read(int id) {
		return (Team) getTeamDAO().teamList.stream().filter(team -> team.getId() == id).findFirst().get();
	}

	@Override
	public Team read(String name) {
		return (Team) getTeamDAO().teamList.stream().filter(team -> team.getName().equals(name)).findFirst().orElseThrow( () -> new TeamException(TeamErrorCode.NOT_FOUND));
	}

	@Override
	public void update(Team team) {
		// TODO Auto-generated method stub

	}

	@Override
	public void delete(Team name) {
		// TODO Auto-generated method stub

	}

}
