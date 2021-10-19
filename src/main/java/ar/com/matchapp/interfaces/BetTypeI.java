package ar.com.matchapp.interfaces;

import ar.com.matchapp.service.MatchService;

public interface BetTypeI {
    boolean win(MatchService match);
}
