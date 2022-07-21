package model;


import lombok.Getter;
import lombok.Setter;

import java.util.Objects;

public class Player {
    @Setter @Getter
    private int position;
    @Getter @Setter
    private final String playerName;




    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Player)) return false;
        Player player = (Player) o;
        return position == player.position &&
                Objects.equals(playerName, player.playerName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(position, playerName);
    }

    public Player(int position, String playerName) {
        this.position = position;
        this.playerName = playerName;
    }

    @Override
    public String toString() {
        return "Player :" + playerName;
    }

}
