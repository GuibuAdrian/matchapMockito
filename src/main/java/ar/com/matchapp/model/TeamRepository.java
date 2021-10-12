package ar.com.matchapp.model;

import java.util.List;

import ar.com.matchapp.interfaces.TeamRepositoryI;

public class TeamRepository implements TeamRepositoryI {
	private Team team;

	public TeamRepository(Team team) {
		super();
		this.team = team;
	}

	@Override
	public List<Player> getTeamPlayers() {
		Team team = TeamDAO.getTeamDAO().read(this.team.getId());
		
		return PlayerDAO.getPlayerDAO().findByTeam(team);
	}

	@Override
	public Player findByName(String name) {
		Player player = PlayerDAO.getPlayerDAO().read(name);
		return player;
	}

	public void printTeam() {
		List<Player> teamPlayersList = this.getTeamPlayers();
		System.out.println( "Team: " + this.getTeam().getName());
		for (int i=0; i < teamPlayersList.size() ; i++) {
			System.out.println(PlayerDAO.getPlayerDAO().read(teamPlayersList.get(i).getId()));
		}
	}

	public Team getTeam() {
		return team;
	}

	public void setTeam(Team team) {
		this.team = team;
	}

}
