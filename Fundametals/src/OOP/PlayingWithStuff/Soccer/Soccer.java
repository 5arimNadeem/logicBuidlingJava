package OOP.PlayingWithStuff.Soccer;

import OOP.PlayingWithStuff.PlayWithStuff;

public abstract class Soccer extends PlayWithStuff {

    private String PlayerName;
    private String ageGroup;

    public Soccer(String playerName, String ageGroup) {
        PlayerName = playerName;
        this.ageGroup = ageGroup;
    }

    public Soccer() {
        System.out.println("We Play Soccer");
    }


    public abstract void play();

    public String getPlayerName() {
        return PlayerName;
    }

    public void setPlayerName(String playerName) {
        PlayerName = playerName;
    }

    public String getAgeGroup() {
        return ageGroup;
    }

    public void setAgeGroup(String ageGroup) {
        this.ageGroup = ageGroup;
    }
}
