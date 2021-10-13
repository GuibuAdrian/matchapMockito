package ar.com.matchapp.service;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import ar.com.matchapp.model.Score;
import ar.com.matchapp.model.TeamRepository;

public class MatchService {
	private TeamRepository home;
	private TeamRepository away;
	private int matchDay;
	private Date dateMatch;
	private Score score;

	public void registerTeams(TeamRepository team1, TeamRepository team2, int matchDay, String dateS, Score scoreMatch) {
		this.home = team1;
		this.away = team2;
		this.matchDay = matchDay;
		this.score = scoreMatch;

	    SimpleDateFormat formatter1=new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
	    try {
			this.dateMatch = formatter1.parse(dateS);
		} catch (ParseException e) {
			e.printStackTrace();
		}
	}

	public void printMatchDay() {
		System.out.println("Match Day: "+this.getMatchDay()+" Date: "+this.getDateMatch());
		score.printScore();
	}

	public TeamRepository getHome() {
		return home;
	}

	public TeamRepository getAway() {
		return away;
	}

	public int getMatchDay() {
		return matchDay;
	}

	public Date getDateMatch() {
		return dateMatch;
	}
}
