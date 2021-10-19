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
        TeamRepository newells = new TeamRepository(TeamDAO.getTeamDAO().read("Newells"));

        TeamRepository river = new TeamRepository(TeamDAO.getTeamDAO().read("River"));
 
        MatchService fecha11 = new MatchService();

        Goal goal = new Goal(5, river.findByName("De la Cruz"));
        Goal goal2 = new Goal(35, newells.findById(32323232));
        Goal goal3 = new Goal(61, river.findById(9999999));
        Goal goal4 = new Goal(77, river.findById(9999999));
        Goal goal5 = new Goal(72, river.findById(1010101010));
        List<Goal> homeGoals = new ArrayList<Goal>();
        List<Goal> awayGoals = new ArrayList<Goal>();
        homeGoals.add(goal2);
        awayGoals.add(goal);
        awayGoals.add(goal5);
        awayGoals.add(goal3);
        awayGoals.add(goal4);
        Score scoreFecha11 = new Score(homeGoals, awayGoals);

        fecha11.registerTeams(newells, river, 11, "15/09/2021 20:30:00", scoreFecha11);
        fecha11.printMatchDay();

        Gambler gambler = new Gambler("Han Solo", 1);
        BetHomeWinner bhw = new BetHomeWinner();
        BetAwayWinner baw = new BetAwayWinner();

        Bet betHan = new Bet(1000, baw, gambler, fecha11);

        System.out.println( betHan.gamble());
    }
}
