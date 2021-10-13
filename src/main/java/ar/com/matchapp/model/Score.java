package ar.com.matchapp.model;

public class Score{
	private Team home;
	private Team away;
	public Team getAwayTeam() {
		return away;
	}
	public void setAwayTeam(Team away) {
		this.away = away;
	}
	public Team getHome() {
		return home;
	}
	public void setHomeTeam(Team local) {
		this.home = home;
	}
}