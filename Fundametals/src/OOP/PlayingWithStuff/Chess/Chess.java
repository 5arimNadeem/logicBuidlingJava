package OOP.PlayingWithStuff.Chess;

import OOP.PlayingWithStuff.PlayWithStuff;

public abstract class Chess extends PlayWithStuff {

    private String playerName;
    private String ageGroup;

    public Chess(String playerName, String ageGroup) {
        this.playerName = playerName;
        this.ageGroup = ageGroup;
    }

    public Chess() {
        System.out.println("We play chess");
    }

    public abstract void play();

    public String getPlayerName() {
        return playerName;
    }

    public void setPlayerName(String playerName) {
        this.playerName = playerName;
    }

    public String getAgeGroup() {
        return ageGroup;
    }

    public void setAgeGroup(String ageGroup) {
        this.ageGroup = ageGroup;
    }
}
