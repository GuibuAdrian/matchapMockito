package ar.com.matchapp.model;

import ar.com.matchapp.interfaces.BetTypeI;

public class BetHomeWinner implements BetTypeI {
    @Override
    public boolean win(Bet bet) {
        return bet.getMatch().getScore().getHomeGoals().size() > bet.getMatch().getScore().getAwayGoals().size();
    }
}
