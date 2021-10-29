package ar.com.matchapp.model;

import ar.com.matchapp.interfaces.BetTypeI;

public class BetMoreThanNGoals implements BetTypeI {
    @Override
    public boolean win(Bet bet) {
        return bet.getMatch().getHomeotalGoals() > bet.getNumberOfGoals() || bet.getMatch().getAwayTotalGoals() > bet.getNumberOfGoals();
    }
}
