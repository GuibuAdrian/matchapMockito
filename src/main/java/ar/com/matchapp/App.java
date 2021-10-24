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
        Score scoreFecha11 = new Score();
        scoreFecha11.addHomeGoal(goal2);
        scoreFecha11.addAwayGoal(goal).addAwayGoal(goal5).addAwayGoal(goal3).addAwayGoal(goal4);

        fecha11.registerTeams(newells, river, 11, "15/09/2021 20:30:00", scoreFecha11);
        fecha11.printMatchDay();

        Gambler gambler = new Gambler("Han Solo", 1);
        BetHomeWinner bhw = new BetHomeWinner();
        BetAwayWinner baw = new BetAwayWinner();
        BetPlayerScoreFirstGoal bpsfg = new BetPlayerScoreFirstGoal();

        Bet betHan = new Bet(1000, bpsfg, gambler, fecha11, PlayerDAO.getPlayerDAO().read(112111));

        System.out.println( betHan.gamble());
    }
}
