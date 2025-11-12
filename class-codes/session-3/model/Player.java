package model;

public class Player {
    private String username;
    private  int kills = 0;
    private int deaths = 0;
    private int score = 0;

    public Player(String usernameParam) {
        if (usernameParam == null || usernameParam.trim().isEmpty()) {
            // error username validation
        }
        username = usernameParam;
    }

    public void addKill() {
        kills++;
        updateScore();
    }

    public void addDeath() {
        deaths++;
        updateScore();
    }

    private void updateScore() {
        score = (kills * 3) - (deaths * 2);
    }

    public String getUsername() {
        return username;
    }

    public int getScore() {
        return score;
    }

    public double getKDRatio() {
        return deaths == 0 ? kills : kills / deaths;
    }
}
