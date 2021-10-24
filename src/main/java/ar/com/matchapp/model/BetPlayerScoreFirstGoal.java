package ar.com.matchapp.model;

import ar.com.matchapp.interfaces.BetTypeI;

public class BetPlayerScoreFirstGoal implements BetTypeI {
    @Override
    public boolean win(Bet bet) {
        return bet.getMatch().getScore().getGoalsPlayer().get(0).getId() == bet.getPlayerThatScoreFirstGoal().getId();
    }
}
