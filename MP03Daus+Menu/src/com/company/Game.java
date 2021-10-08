package com.company;

import jdk.swing.interop.SwingInterOpUtils;

import java.util.Scanner;

public class Game {
    public final static int MAX_PLAYERS = 4;

    private Menu menu;
    private ConfigGame configGame;
    private Player[] playersList;

    public Game() {
        playersList = new Player[MAX_PLAYERS];
        configGame = new ConfigGame(playersList);
        menu = new Menu(this, configGame);
    }

    public void start() {
        menu.show();
    }

    public void play() {
        System.out.println("\n\033[1;34mNivell del joc: " + configGame.getLevel());
        System.out.println("\n\033[1;34mJugant...");
        System.out.println("\n\033[1;34mHi ha " + configGame.getNumPlayers() + " jugadors");
        JocDaus jocDaus = new JocDaus();
        jocDaus.jugar();
    }
}
