package com.company;

import java.util.Scanner;

public class Menu {
    private Scanner scanner = new Scanner(System.in);
    Game game;
    ConfigGame configGame;

    public Menu(Game game, ConfigGame configGame) {
        this.game = game;
        this.configGame = configGame;
    }

    public void show() {
        menuPrincipal();
    }

    private void menuPrincipal(){
        int opcio;
        do {
            System.out.println("\n\033[1;32m1. Jugar");
            System.out.println("\n\033[1;32m2. Eines");
            System.out.println("\n\033[1;31m3. Sortir");
            System.out.println();

            System.out.print("\n\033[1;34mQue vols fer? ");
            opcio = scanner.nextInt();
            switch (opcio) {
                case 1:
                    playMenu();
                    break;
                case 2:
                    settingsMenu();
                    break;
                case 3:
                    break;
                default:
                    System.out.println("\n\033[1;31Has d'escollir una opció");
            }
        } while (opcio != 3);
    }

    private void playMenu() {
        int opcio;
        do {
            System.out.println("\n\033[1;32m1. Daus");
            System.out.println("\n\033[1;32m2. Parxis");
            System.out.println("\n\033[1;32m3. Tic Tac Toe");
            System.out.println("\n\033[1;31m Tornar");
            System.out.println();

            System.out.print("\n\033[1;34mQue vols fer? ");
            opcio = scanner.nextInt();
            switch (opcio) {
                case 1:
                    game.play();
                    break;
                case 2:
                    System.out.println("\n\033[1;31mDisponible en properes actualitzacions!");
                    break;
                case 3:
                    System.out.println("\n\033[1;31mPaquet Tic Tac Toe requerit, buscar a botiga per comprar.");
                    break;
                case 4:
                    break;
                default:
                    System.out.println("\n\033[1;31mTria una opció.");
            }
        } while (opcio != 4);
    }

    private void settingsMenu() {
        int opcio;
        do {
            System.out.println("\n\033[1;32m1. Joc");
            System.out.println("\n\033[1;32m2. Jugadors");
            System.out.println("\n\033[1;31m3.Tornar");
            System.out.println();

            System.out.print("\n\033[1;34mQue vols fer? ");
            opcio = scanner.nextInt();
            switch (opcio) {
                case 1:
                    gameSettings();
                    break;
                case 2:
                    playerSettings();
                    break;
                case 3:
                    break;
                default:
                    System.out.println("\n\033[1;31mEs obligatori triar una opció.");
            }
        } while (opcio != 3);
    }

    private void gameSettings() {
        int level;
        System.out.println("\n\033[1;34mSelecciona nivell, 1 a 5.");
        level = scanner.nextInt();
        configGame.setLevel(level);
    }

    private void playerSettings(){
        int njug;
        System.out.println("\n\033[1;34mQuants jugadors?" + "(Máxim " + Game.MAX_PLAYERS + ")?");
        njug = scanner.nextInt();
        configGame.setNumPlayers(njug);
    }
}
