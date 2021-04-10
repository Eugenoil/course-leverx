package main.model;

import java.util.Random;
import java.util.Scanner;

public class HumanGame {
    private final char EMPTY = '_';
    Random random;
    Scanner scanner;
    Table table;

    public HumanGame() {
        random = new Random();
        scanner = new Scanner(System.in);
        table = new Table();
    }

    public void turnHumanX() {
        System.out.println("Mister X - Your turn \nEnter X and Y (1..3):");
        int x = scanner.nextInt() - 1;
        int y = scanner.nextInt() - 1;
        commonTurn(x, y, 'X');
    }

    public void turnHumanO() {
        System.out.println("Mister O - Your turn \nEnter X and Y (1..3):");
        int x = scanner.nextInt() - 1;
        int y = scanner.nextInt() - 1;
        commonTurn(x, y, 'O');
    }

    public void commonTurn(int x, int y, char sign) {
        if (isCellValid(x, y)) {
            if (table.getTable()[y][x] == EMPTY) {
                table.getTable()[y][x] = sign;
            } else {
                System.out.println("Cell is busy. Try the other");
            }
        } else {
            System.out.println("Coordinates must be in interval 1..3, try to write valid numbers");
        }
    }

    public boolean isCellValid(int x, int y) {
        if (x < 0 || y < 0 || x >= 3 || y >= 3)
            return false;
        return table.getTable()[y][x] == EMPTY;
    }


    public boolean checkWin(char dot) {
        for (int i = 0; i < 3; i++)
            if ((table.getTable()[i][0] == dot && table.getTable()[i][1] == dot &&
                    table.getTable()[i][2] == dot) ||
                    (table.getTable()[0][i] == dot && table.getTable()[1][i] == dot &&
                            table.getTable()[2][i] == dot))
                return true;
        return (table.getTable()[0][0] == dot && table.getTable()[1][1] == dot &&
                table.getTable()[2][2] == dot) ||
                (table.getTable()[2][0] == dot && table.getTable()[1][1] == dot &&
                        table.getTable()[0][2] == dot);
    }

    public void initTable() {
        table.initTable();
    }

    public void printTable() {
        table.printTable();
    }

    public boolean isTableFull() {
        return table.isTableFull();
    }
}
