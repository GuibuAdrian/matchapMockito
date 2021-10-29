package ar.com.matchapp.model;

import ar.com.matchapp.interfaces.BetTypeI;

public class BetAwayWinner implements BetTypeI {
    @Override
    public boolean win(Bet bet) {
        return bet.getMatch().getScore().getAwayGoals().size() > bet.getMatch().getScore().getHomeGoals().size();
    }
}
