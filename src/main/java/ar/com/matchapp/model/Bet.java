package ar.com.matchapp.model;

import ar.com.matchapp.interfaces.BetTypeI;
import ar.com.matchapp.service.MatchService;

public class Bet {
    private int amountGamble;
    private BetTypeI betTypeI;
    private Gambler gambler;
    private MatchService match;

    public Bet(int amountGamble, BetTypeI betTypeI, Gambler gambler, MatchService matchS) {
        this.amountGamble = amountGamble;
        this.betTypeI = betTypeI;
        this.gambler = gambler;
        this.match = matchS;
    }

    public int gamble(){
        return betTypeI.win(this.match) ? this.amountGamble : 0;
    }

    public int getMinAmount() { return amountGamble; }

    public BetTypeI getBetTypeI() { return betTypeI; }

    public Gambler getGambler() { return gambler; }

    public void setBetTypeI(BetTypeI betTypeI) { this.betTypeI = betTypeI; }

    public void setAmountGamble(int i) { this.amountGamble = i; }
}
