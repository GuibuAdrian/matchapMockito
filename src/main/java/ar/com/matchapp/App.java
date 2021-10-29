package ar.com.matchapp;

import ar.com.matchapp.model.*;
import ar.com.matchapp.service.MatchService;

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

        Gambler gamblerHan = new Gambler("Han Solo", 1);
        Gambler gamblerLando = new Gambler("Lando", 2);
        Gambler gamblerCreed = new Gambler("Clearwater", 3);
        BetHomeWinner bhw = new BetHomeWinner();
        BetAwayWinner baw = new BetAwayWinner();

        Bet betHan = new Bet.BetBuilder(1000, new BetPlayerScoreFirstGoal(), gamblerHan, fecha11)
                        .withPlayerThatScoreFirstGoal(PlayerDAO.getPlayerDAO().read(112111))
                        .build();
        Bet betLando = new Bet.BetBuilder(2000, new BetPlayerScoreFirstGoal(), gamblerLando, fecha11)
                        .withPlayerThatScoreFirstGoal(PlayerDAO.getPlayerDAO().read(27272727))
                        .build();
        Bet betCreed = new Bet.BetBuilder(1000, new BetMoreThanNGoals(), gamblerCreed, fecha11)
                        .withNumberOfGoals(4)
                        .build();

        System.out.println( betHan.gamble());
        System.out.println( betLando.gamble());
        System.out.println( betCreed.gamble());
    }
}
