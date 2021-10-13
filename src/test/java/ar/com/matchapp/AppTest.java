package ar.com.matchapp;

import ar.com.matchapp.error.PlayerException;
import org.junit.Assert;
import org.junit.Test;
import ar.com.matchapp.model.Player;
import ar.com.matchapp.model.PlayerDAO;
import ar.com.matchapp.model.TeamDAO;
import ar.com.matchapp.model.TeamRepository;
import static org.mockito.BDDMockito.*;

import java.util.List;

public class AppTest {
    private TeamRepository teamR = mock(TeamRepository.class);

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
