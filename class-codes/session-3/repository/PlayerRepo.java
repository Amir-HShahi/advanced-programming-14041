package repository;

import model.Player;

public class PlayerRepo {
    private int playerCount = 0;
    private static final int MAX_PLAYERS = 10;
    private Player[] players = new Player[MAX_PLAYERS];

    public void addPlayer(Player player) {
        if (playerCount == MAX_PLAYERS) {
            // error max player reached
        }
        players[playerCount++] = player;
    }

    public Player findPlayer(String username) {
        Player player = null;
        for (int i = 0; i < players.length; i++) {
            player = players[i];
            if (player != null && player.getUsername().equals(username)) {
                return player;
            }
        }
        return player;
    }
}
