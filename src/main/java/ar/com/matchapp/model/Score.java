package ar.com.matchapp.model;

import java.util.List;

public class Score {
	private TeamRepository home;
	private TeamRepository away;
	private List<Goal> homeGoals;
	private List<Goal> awayGoals;

	public Score(TeamRepository home, TeamRepository away, List<Goal> homeGoals, List<Goal> awayGoal) {
		this.home = home;
		this.away = away;
		this.homeGoals = homeGoals;
		this.awayGoals = awayGoal;
	}

	public void printScore(){
		System.out.println(home.getTeam().getName());
		homeGoals.forEach(goal -> {
			System.out.println(goal);
		});

		System.out.println(away.getTeam().getName());
		awayGoals.forEach(goal -> {
			System.out.println(goal);
		});
	}
	public TeamRepository getAwayTeam() {
		return away;
	}
	public TeamRepository getHome() {
		return home;
	}
}