package ar.com.matchapp.model;

import java.util.List;

public class Score {
	private List<Goal> homeGoals;
	private List<Goal> awayGoals;

	public Score(List<Goal> homeGoals, List<Goal> awayGoal) {
		this.homeGoals = homeGoals;
		this.awayGoals = awayGoal;
	}

	public void printScore(String home, String away){
		System.out.println("Home: " + home);
		homeGoals.forEach(goal -> {
			System.out.println(goal);
		});

		System.out.println("Away: " + away);
		awayGoals.forEach(goal -> {
			System.out.println(goal);
		});
	}

	public List<Goal> getHomeGoals() { return homeGoals; }
	public List<Goal> getAwayGoals() { return awayGoals; }
}