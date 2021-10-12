package ar.com.matchapp.model;

import java.util.ArrayList;
import java.util.List;

import ar.com.matchapp.interfaces.TeamDAOI;

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
	public void update(Team team) {
		// TODO Auto-generated method stub

	}

	@Override
	public void delete(Team name) {
		// TODO Auto-generated method stub

	}

}
