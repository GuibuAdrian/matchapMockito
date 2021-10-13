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

}
