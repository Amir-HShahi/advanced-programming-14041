package service;

import model.Player;
import repository.PlayerRepo;

public class GameService {
    private final PlayerRepo playerRepo = new PlayerRepo();

    public void addPlayer(Player player) {
        playerRepo.addPlayer(player);
    }

    public void recordKill(String username) {
        Player player = playerRepo.findPlayer(username);
        if (player != null) {
            player.addKill();
        }
    }

    public void recordDeath(String username) {
        Player player = playerRepo.findPlayer(username);
        if (player != null) {
            player.addDeath();
        }
    }
}