package com.company;

class ConfigGame{
    private int level;
    private int numPlayers;

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public int getNumPlayers() {
        return numPlayers;
    }

    public void setNumPlayers(int numPlayers) {
        this.numPlayers = numPlayers;
    }

    public ConfigGame(Player[] playersList){
        level = 1;
        numPlayers = 1;
    }
}