package main;

import main.model.HumanGame;
import main.model.AIGame;
import main.model.Table;

import java.util.Scanner;

public class TicTacToe {

    public void game() {
        System.out.println("Choose the type of Game: \n 1 - Human vs AI \n 2 - Human vs Human");
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        if (x > 0 && x < 3) {
            if (x == 1) {
                AIGame aiGame = new AIGame();
                aiGame.initTable();
                System.out.println("You choose Human vs AI");
                while (true) {
                    aiGame.turnHuman();
                    if (aiGame.checkWin('X')) {
                        System.out.println("YOU WIN!");
                        break;
                    }
                    if (aiGame.isTableFull()) {
                        System.out.println("DRAW!");
                        break;
                    }
                    aiGame.turnAI();
                    aiGame.printTable();
                    if (aiGame.checkWin('O')) {
                        System.out.println("AI WIN!");
                        break;
                    }
                    if (aiGame.isTableFull()) {
                        System.out.println("DRAW!");
                        break;
                    }
                }
                System.out.println("GAME OVER.");
                aiGame.printTable();
            } else {
                System.out.println("You choose Human vs Human");
                HumanGame humanGame = new HumanGame();
                humanGame.initTable();
                while (true) {
                    humanGame.turnHumanX();
                    humanGame.printTable();
                    if (humanGame.checkWin('X')) {
                        System.out.println("Player X WIN!");
                        break;
                    }
                    if (humanGame.isTableFull()) {
                        System.out.println("DRAW!");
                        break;
                    }
                    humanGame.turnHumanO();
                    humanGame.printTable();
                    if (humanGame.checkWin('O')) {
                        System.out.println("Player O WIN!");
                        break;
                    }
                    if (humanGame.isTableFull()) {
                        System.out.println("DRAW!");
                        break;
                    }
                }
                System.out.println("GAME OVER.");
                humanGame.printTable();
            }
        } else {
            System.out.println("There is no such option. You must choose 1 or 2. Try again");
        }
    }
}