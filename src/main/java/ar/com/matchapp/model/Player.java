package ar.com.matchapp.model;

public class Player {
	private String name;
	private int number;
	private int id;
	private String position;
	private Team team;

	public Player(String name, int number, int i, String position, Team team) {
		super();
		this.name = name;
		this.number = number;
		this.id = i;
		this.setPosition(position);
		this.team = team;
	}

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getNumber() {
		return number;
	}
	public void setNumber(int number) {
		this.number = number;
	}

	public int getId() {
		return id;
	}

	public String getPosition() {
		return position;
	}

	public void setPosition(String position) {
		this.position = position;
	}

	public Team getTeam() {
		return team;
	}

	public void setTeam(Team team) {
		this.team = team;
	}

	@Override
	public String toString() {
		return "Player [name=" + name + ", number=" + number + ", id=" + id + ", position=" + position + "]";
	}
}
