package main.model;

public class Table {
    private final char EMPTY = '_';
    private final char[][] table;

    public Table() {
        table = new char[3][3];
    }

    public void initTable() {
        for (int row = 0; row < 3; row++)
            for (int col = 0; col < 3; col++)
                table[row][col] = EMPTY;
    }

    public void printTable() {
        for (int row = 0; row < 3; row++) {
            for (int col = 0; col < 3; col++)
                System.out.print(table[row][col] + " ");
            System.out.println();
        }
    }

    public boolean isTableFull() {
        for (int row = 0; row < 3; row++)
            for (int col = 0; col < 3; col++)
                if (table[row][col] == EMPTY)
                    return false;
        return true;
    }

    public char[][] getTable() {
        return table;
    }
}
