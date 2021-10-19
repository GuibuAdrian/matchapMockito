package ar.com.matchapp.model;

import ar.com.matchapp.interfaces.BetTypeI;
import ar.com.matchapp.service.MatchService;

public class BetHomeWinner implements BetTypeI {
    @Override
    public boolean win(MatchService match) {
        return match.getScore().getHomeGoals().size() > match.getScore().getAwayGoals().size();
    }
}
