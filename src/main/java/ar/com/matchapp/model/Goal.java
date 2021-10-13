package ar.com.matchapp.model;

public class Goal {
    private int minute;
    private Player player;

    public Goal(int minute, Player player) {
        this.minute = minute;
        this.player = player;
    }

    public int getMinute() { return minute; }

    public Player getPlayer() { return player; }

    @Override
    public String toString() {
        return "Goal { " +
                "minute=" + minute+"'"+
                ", player=" + player.getName() +
                " }";
    }
}
