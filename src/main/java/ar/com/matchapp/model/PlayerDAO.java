package ar.com.matchapp.model;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import ar.com.matchapp.enums.PlayerErrorCode;
import ar.com.matchapp.error.PlayerException;
import ar.com.matchapp.interfaces.PlayerDAOI;

public class PlayerDAO implements PlayerDAOI {
	private static PlayerDAO playerDAO;
	private List<Player> playerList;

	public static PlayerDAO getPlayerDAO() {
		if(playerDAO == null) {
			playerDAO = new PlayerDAO();
			playerDAO.playerList = new ArrayList<Player>();

			initialize();
		}
		return playerDAO;
	}

	@Override
	public void create(Player player) {
		playerDAO.playerList.add(player);
	}

	@Override
	public Player read(int id) {
		return (Player) playerDAO.playerList.stream().filter(player -> player.getId() == id).findFirst().orElseThrow( () -> new PlayerException(PlayerErrorCode.NOT_FOUND));
	}

	public Player read(String name) {
		return (Player) playerDAO.playerList.stream().filter(player -> player.getName().equals(name)).findFirst().orElseThrow( () -> new PlayerException(PlayerErrorCode.NOT_FOUND));
	}

	@Override
	public void update(Player player) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(String name) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<Player> findByTeam(Team team) {
		return playerDAO.playerList.stream().filter(player -> player.getTeam() == team).collect(Collectors.toList());
	}

	private static void initialize() {
		Player arqueroR = new Player("Armani", 1, 1111221, "arquero", TeamDAO.getTeamDAO().read(1));
		Player defR = new Player("Angileri", 3, 333333, "defensor", TeamDAO.getTeamDAO().read(1));
		Player def2R = new Player("P. Diaz", 17, 17171717, "defensor", TeamDAO.getTeamDAO().read(1));
		Player def3R = new Player("Rojas", 2, 2122222, "defensor", TeamDAO.getTeamDAO().read(1));
		Player def4R = new Player("Vigo", 16, 1616162, "defensor", TeamDAO.getTeamDAO().read(1));
		Player medioCR = new Player("Carrascal", 10, 1010101010, "medio C", TeamDAO.getTeamDAO().read(1));
		Player medioC2R = new Player("E. Perez", 24, 242424242, "medio C", TeamDAO.getTeamDAO().read(1));
		Player medioC3R = new Player("Zuculini", 5, 5555555, "medio C", TeamDAO.getTeamDAO().read(1));
		Player medioC4R = new Player("De la Cruz", 11, 112111, "medio C", TeamDAO.getTeamDAO().read(1));
		Player delantero1R = new Player("Alvarez", 9, 9999999, "delantero", TeamDAO.getTeamDAO().read(1));
		Player delantero2R = new Player("Romero", 19, 19193232, "delantero", TeamDAO.getTeamDAO().read(1));
		Player arqueroN = new Player("Aguerre", 1, 1111111, "arquero", TeamDAO.getTeamDAO().read(2));
		Player defN = new Player("Compagnucci", 27, 27272727, "defensor", TeamDAO.getTeamDAO().read(2));
		Player def2N = new Player("Lema", 2, 2222222, "defensor", TeamDAO.getTeamDAO().read(2));
		Player def3N = new Player("Z. F. Mansilla", 19, 19191919, "defensor", TeamDAO.getTeamDAO().read(2));
		Player def4N = new Player("Bittolo", 28, 28282828, "defensor", TeamDAO.getTeamDAO().read(2));
		Player medioCN = new Player("P. Perez", 8, 8888888, "medio C", TeamDAO.getTeamDAO().read(2));
		Player medioC2N = new Player("J. Fernandez", 20, 2020202020, "medio C", TeamDAO.getTeamDAO().read(2));
		Player medioC3N = new Player("Comba", 33, 33333333, "medio C", TeamDAO.getTeamDAO().read(2));
		Player medioC4N = new Player("Castro", 36, 36363636, "medio C", TeamDAO.getTeamDAO().read(2));
		Player medioC5N = new Player("Sordo", 26, 26262626, "medio C", TeamDAO.getTeamDAO().read(2));
		Player delanteroN = new Player("Scocco", 32, 32323232, "delantero", TeamDAO.getTeamDAO().read(2));

		getPlayerDAO().create(arqueroR);
		getPlayerDAO().create(defR);
		getPlayerDAO().create(def2R);
		getPlayerDAO().create(def3R);
		getPlayerDAO().create(def4R);
		getPlayerDAO().create(medioCR);
		getPlayerDAO().create(medioC2R);
		getPlayerDAO().create(medioC3R);
		getPlayerDAO().create(medioC4R);
		getPlayerDAO().create(delantero1R);
		getPlayerDAO().create(delantero2R);
		getPlayerDAO().create(arqueroN);
		getPlayerDAO().create(defN);
		getPlayerDAO().create(def2N);
		getPlayerDAO().create(def3N);
		getPlayerDAO().create(def4N);
		getPlayerDAO().create(medioCN);
		getPlayerDAO().create(medioC2N);
		getPlayerDAO().create(medioC3N);
		getPlayerDAO().create(medioC4N);
		getPlayerDAO().create(medioC5N);
		getPlayerDAO().create(delanteroN);
	}

}
