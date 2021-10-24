package ar.com.matchapp.model;

public class Goal {
    private int minute;
    private Player player;

    public Goal(Builder builder) {
        this.minute = builder.minute;
        this.player = builder.player;
    }

    public static class Builder {
        private int minute;
        private Player player;

        public static Builder newInstance(){
            return new Builder();
        }

        public Builder minute(int minute) {
            this.minute = minute;
            return this;
        }

        public Builder player(Player player) {
            this.player = player;
            return this;
        }

        public Goal build(){
            return new Goal(this);
        }
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
