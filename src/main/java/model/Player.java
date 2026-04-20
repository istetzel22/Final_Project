package model;

public class Player {
    private String name;
    
    private int score;
    private int roundsPlayed;
    
    public Player(String name) {
        this.name = name;
        score = 0;
        roundsPlayed = 0;

    }
    
    public String getName() {
        return name;
    }
    
    public void setName(String name) {
        this.name = name;
    }
    
    public int getScore() {
        return score;
    }
    
    public int getRoundsPlayed() {
        return roundsPlayed;
    }

    public void updateScore(int scoreToAdd) {
        score += scoreToAdd;

    }

    public double getAverageGuesses() {
        return score / (double) roundsPlayed;

    }
    
    
}
