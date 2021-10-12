package ar.com.matchapp;

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
		initialize();
        List<Player> playerTeam = PlayerDAO.getPlayerDAO().findByTeam(TeamDAO.getTeamDAO().read(1));
        Assert.assertEquals(11, playerTeam.size());
    }

	@Test
	public void testGoalKeeperRiverTeam() {
		when(teamR.getTeamPlayers()).thenReturn(PlayerDAO.getPlayerDAO().findByTeam(TeamDAO.getTeamDAO().read(1)));
	    Assert.assertEquals( teamR.getTeamPlayers().get(0).getName(), "Armani" );
	}

	private void initialize() {
    	TeamDAO teamDB = new TeamDAO();

        Player arqueroN = new Player("Aguerre", 1, 1111111, "arquero", teamDB.read(2));
        Player defN = new Player("Compagnucci", 27, 27272727, "defensor", teamDB.read(2));
        Player def2N = new Player("Lema", 2, 2222222, "defensor", teamDB.read(2));
        Player def3N = new Player("Z. F. Mansilla", 19, 19191919, "defensor", teamDB.read(2));
        Player def4N = new Player("Bittolo", 28, 28282828, "defensor", teamDB.read(2));
        Player medioCN = new Player("P. Perez", 8, 8888888, "medio C", teamDB.read(2));
        Player medioC2N = new Player("J. Fernandez", 20, 2020202020, "medio C", teamDB.read(2));
        Player medioC3N = new Player("Comba", 33, 33333333, "medio C", teamDB.read(2));
        Player medioC4N = new Player("Castro", 36, 36363636, "medio C", teamDB.read(2));
        Player medioC5N = new Player("Sordo", 26, 26262626, "medio C", teamDB.read(2));
        Player delanteroN = new Player("Scocco", 32, 32323232, "delantero", teamDB.read(2));

        Player arqueroR = new Player("Armani", 1, 1111221, "arquero", teamDB.read(1));
        Player defR = new Player("Angileri", 3, 333333, "defensor", teamDB.read(1));
        Player def2R = new Player("P. Diaz", 17, 17171717, "defensor", teamDB.read(1));
        Player def3R = new Player("Rojas", 2, 2122222, "defensor", teamDB.read(1));
        Player def4R = new Player("Vigo", 16, 1616162, "defensor", teamDB.read(1));
        Player medioCR = new Player("Carrascal", 10, 1010101010, "medio C", teamDB.read(1));
        Player medioC2R = new Player("E. Perez", 24, 242424242, "medio C", teamDB.read(1));
        Player medioC3R = new Player("Zuculini", 5, 5555555, "medio C", teamDB.read(1));
        Player medioC4R = new Player("De La Cruz", 11, 112111, "medio C", teamDB.read(1));
        Player delantero1R = new Player("Alvarez", 9, 9999999, "delantero", teamDB.read(1));
        Player delantero2R = new Player("Romero", 19, 19193232, "delantero", teamDB.read(1));

        loadPlayerDB(arqueroN, defN, def2N, def3N, def4N, medioCN, medioC2N, medioC3N, medioC4N, medioC5N, delanteroN,
				arqueroR, defR, def2R, def3R, def4R, medioCR, medioC2R, medioC3R, medioC4R, delantero1R, delantero2R,
				PlayerDAO.getPlayerDAO());
        
	}

	private static void loadPlayerDB(Player arqueroN, Player defN, Player def2N, Player def3N, Player def4N,
			Player medioCN, Player medioC2N, Player medioC3N, Player medioC4N, Player medioC5N, Player delanteroN,
			Player arqueroR, Player defR, Player def2R, Player def3R, Player def4R, Player medioCR, Player medioC2R,
			Player medioC3R, Player medioC4R, Player delantero1R, Player delantero2R, PlayerDAO playerDB) {
		playerDB.create(arqueroN);
        playerDB.create(defN);
        playerDB.create(def2N);
        playerDB.create(def3N);
        playerDB.create(def4N);
        playerDB.create(medioCN);
        playerDB.create(medioC2N);
        playerDB.create(medioC3N);
        playerDB.create(medioC4N);
        playerDB.create(medioC5N);
        playerDB.create(delanteroN);
        playerDB.create(arqueroR);
        playerDB.create(defR);
        playerDB.create(def2R);
        playerDB.create(def3R);
        playerDB.create(def4R);
        playerDB.create(medioCR);
        playerDB.create(medioC2R);
        playerDB.create(medioC3R);
        playerDB.create(medioC4R);
        playerDB.create(delantero1R);
        playerDB.create(delantero2R);
	}
}
