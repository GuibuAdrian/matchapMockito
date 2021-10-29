package ar.com.matchapp.model;

import ar.com.matchapp.interfaces.BetTypeI;
import ar.com.matchapp.service.MatchService;

public class Bet {
    private int amountGamble;
    private BetTypeI betTypeI;
    private Gambler gambler;
    private MatchService match;
    private Player playerThatScoreFirstGoal;//optional
    private int numberOfGoals;

    public Bet(BetBuilder builder) {
        this.amountGamble = builder.amountGamble;
        this.betTypeI = builder.betTypeI;
        this.gambler = builder.gambler;
        this.match = builder.match;
        this.playerThatScoreFirstGoal = builder.playerThatScoreFirstGoal;
        this.numberOfGoals = builder.numberOfGoals;
    }


    public static class BetBuilder {
        private int amountGamble;
        private BetTypeI betTypeI;
        private Gambler gambler;
        private MatchService match;
        private Player playerThatScoreFirstGoal;
        private int numberOfGoals;

        public BetBuilder (int amountGamble, BetTypeI betType, Gambler gambler, MatchService match) {
            this.amountGamble = amountGamble;
            this.betTypeI = betType;
            this.gambler = gambler;
            this.match = match;
        }

        public BetBuilder withPlayerThatScoreFirstGoal(Player playerThatScoreFirstGoal){
            this.playerThatScoreFirstGoal = playerThatScoreFirstGoal;
            return this;
        }

        public BetBuilder withNumberOfGoals(int numberOfGoals) {
            this.numberOfGoals = numberOfGoals;
            return this;
        }

        public Bet build(){
            return new Bet(this);
        }
    }

    public int gamble(){
        return betTypeI.win(this) ? this.amountGamble : 0;
    }

    public int getMinAmount() { return amountGamble; }

    public BetTypeI getBetTypeI() { return betTypeI; }

    public Gambler getGambler() { return gambler; }

    public MatchService getMatch() { return match; }

    public Player getPlayerThatScoreFirstGoal() { return playerThatScoreFirstGoal; }

    public int getNumberOfGoals() { return this.numberOfGoals; }
}
