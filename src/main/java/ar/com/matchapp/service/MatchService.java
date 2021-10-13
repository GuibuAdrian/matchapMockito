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

	public void registerTeams(TeamRepository team1, TeamRepository team2, int matchDay, String dateS) {
		this.setHome(team1);
		this.setAway(team2);
		this.setMatchDay(matchDay);

	    SimpleDateFormat formatter1=new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
	    try {
			this.dateMatch = formatter1.parse(dateS);
		} catch (ParseException e) {
			e.printStackTrace();
		}
	}

	public void printMatchDay() {
		System.out.println("Match Day: "+this.getMatchDay()+" Date: "+this.getDateMatch());
		home.printTeam();
		away.printTeam();
	}

	public TeamRepository getHome() {
		return home;
	}

	public void setHome(TeamRepository local) {
		this.home = home;
	}

	public TeamRepository getAway() {
		return away;
	}

	public void setAway(TeamRepository away) {
		this.away = away;
	}

	public int getMatchDay() {
		return matchDay;
	}
	
	private void setMatchDay(int matchDay) {
		this.matchDay = matchDay;
	}

	public Date getDateMatch() {
		return dateMatch;
	}

	public void setDateMatch(Date dateMatch) {
		this.dateMatch = dateMatch;
	}
}
