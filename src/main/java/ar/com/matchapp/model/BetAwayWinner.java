package ar.com.matchapp.model;

import ar.com.matchapp.interfaces.BetTypeI;
import ar.com.matchapp.service.MatchService;

public class BetAwayWinner implements BetTypeI {
    @Override
    public boolean win(MatchService match) {
        return match.getScore().getAwayGoals().size() > match.getScore().getHomeGoals().size();
    }
}
