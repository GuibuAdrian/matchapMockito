package ar.com.matchapp.model;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Score {
	private List<Goal> homeGoals;
	private List<Goal> awayGoals;

	public Score() {
		this.homeGoals = new ArrayList<Goal>();
		this.awayGoals = new ArrayList<Goal>();
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

	public Score addHomeGoal(Goal goal) {
		this.getHomeGoals().add(goal);
		return this;
	}

	public Score addAwayGoal(Goal goal) {
		this.getAwayGoals().add(goal);
		return this;
	}

	public List<Goal> getHomeGoals() { return homeGoals; }
	public List<Goal> getAwayGoals() { return awayGoals; }

	public List<Player> getGoalsPlayer() {
		return Stream.concat(this.homeGoals.stream(), this.awayGoals.stream()).sorted(Comparator.comparing(Goal::getMinute)).map(Goal -> Goal.getPlayer()).collect(Collectors.toList());
	}
}