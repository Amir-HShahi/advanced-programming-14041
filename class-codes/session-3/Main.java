import model.Player;
import service.GameService;

public class Main {
    public static void main(String[] args) {
        GameService game = new GameService();

        // Valid player creation
        Player player1 = new Player("Alice");
        Player player2 = new Player("Bob");
        Player player3 = new Player("Charlie");
        
        
        // player1.kills = 999;  
        // player1.score = 5000; 
        
        // Must use public methods:
        game.addPlayer(player1);
        game.addPlayer(player2);
        game.addPlayer(player3);
        
        // Alice gets 5 kills, 1 death
        for (int i = 0; i < 5; i++) {
            game.recordKill("Alice");
        }
        game.recordDeath("Alice");
        
        // Bob gets 3 kills, 3 deaths
        for (int i = 0; i < 3; i++) {
            game.recordKill("Bob");
            game.recordDeath("Bob");
        }
        
        // Charlie gets 2 kills, 0 deaths
        game.recordKill("Charlie");
        game.recordKill("Charlie");
        
        
        displayPlayerStats(player1);
        displayPlayerStats(player2);
        displayPlayerStats(player3);
        
    }

    private static void displayPlayerStats(Player player) {
        System.out.printf("%-20s | Score: %4d | K/D: %.2f%n",
            player.getUsername(),
            player.getScore(),
            player.getKDRatio()
        );
    }
}
