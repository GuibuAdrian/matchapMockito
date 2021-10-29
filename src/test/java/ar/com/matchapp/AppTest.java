package ar.com.matchapp;

import ar.com.matchapp.error.PlayerException;
import ar.com.matchapp.model.*;
import ar.com.matchapp.service.MatchService;
import org.junit.Assert;
import org.junit.Test;

import static org.mockito.BDDMockito.*;

import java.util.List;

public class AppTest {
    private TeamRepository teamR = mock(TeamRepository.class);
    private Score scoreM = mock(Score.class);
    private Bet bet = mock(Bet.class);
	@Test
    public void testTeamSize(){
        List<Player> playerTeam = PlayerDAO.getPlayerDAO().findByTeam(TeamDAO.getTeamDAO().read(1));
        Assert.assertEquals(11, playerTeam.size());
    }

	@Test
	public void testGoalKeeperRiverTeam() {
		when(teamR.getTeamPlayers()).thenReturn(PlayerDAO.getPlayerDAO().findByTeam(TeamDAO.getTeamDAO().read(1)));
	    Assert.assertEquals( teamR.getTeamPlayers().get(0).getName(), "Armani" );
	}

    @Test
    public void testBetHomeWinner() {
        when(scoreM.getHomeGoals().size()).thenReturn(4);
        when(scoreM.getAwayGoals().size()).thenReturn(1);
        BetHomeWinner betHomeWinner = new BetHomeWinner();
        Assert.assertEquals( betHomeWinner, 100 );
    }

    @Test(expected = PlayerException.class)
    public void playerNotFoundError_byId(){
        PlayerDAO playerDAO = PlayerDAO.getPlayerDAO();

        playerDAO.read(90);
    }

    @Test(expected = PlayerException.class)
    public void playerNotFoundError_byName(){
        PlayerDAO playerDAO = PlayerDAO.getPlayerDAO();

        playerDAO.read("Messi");
    }
}
