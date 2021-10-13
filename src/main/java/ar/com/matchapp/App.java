package ar.com.matchapp;

import ar.com.matchapp.model.*;
import ar.com.matchapp.service.MatchService;

import java.util.ArrayList;
import java.util.List;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        TeamRepository newells = new TeamRepository(TeamDAO.getTeamDAO().read(2));

        TeamRepository river = new TeamRepository(TeamDAO.getTeamDAO().read(1));
 
        MatchService fecha11 = new MatchService();

        Goal goal = new Goal(5, PlayerDAO.getPlayerDAO().read(112111));
        Goal goal2 = new Goal(35, PlayerDAO.getPlayerDAO().read(32323232));
        Goal goal3 = new Goal(61, PlayerDAO.getPlayerDAO().read(9999999));
        Goal goal4 = new Goal(77, PlayerDAO.getPlayerDAO().read(9999999));
        Goal goal5 = new Goal(72, PlayerDAO.getPlayerDAO().read(1010101010));
        List<Goal> homeGoals = new ArrayList<Goal>();
        List<Goal> awayGoals = new ArrayList<Goal>();
        homeGoals.add(goal2);
        awayGoals.add(goal);
        awayGoals.add(goal5);
        awayGoals.add(goal3);
        awayGoals.add(goal4);
        Score scoreFecha11 = new Score(newells, river, homeGoals, awayGoals);

        fecha11.registerTeams(newells, river, 11, "15/09/2021 20:30:00", scoreFecha11);
        fecha11.printMatchDay();
    }
}
