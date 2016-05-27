package pers.crazymouse.exercises;

public class Ex7_22 {
    public static int columnQueen[] = new int[8];

    public static void main(String[] args) {
        eightQueen(0);
    }

    public static boolean isValid(int column, int row) {
        for (int i = 0; i < column; i++) {
            if (row == columnQueen[i])
                return false;
            if ((i + columnQueen[i]) == (column + row))
                return false;
            if ((i - columnQueen[i]) == (column - row))
                return false;
        }
        return true;
    }

    public static void eightQueen(int column) {
        for (int row = 0; row < 8; row++) {
            if (isValid(column, row)) {
                columnQueen[column] = row;
                if (column == 7) {
                    displayEightQueen();
                    columnQueen[column] = 0;
                    return;
                }
                eightQueen(column + 1);
                columnQueen[column] = 0;
            }
        }
    }

    public static void displayEightQueen() {
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                System.out.print("|");
                if (columnQueen[j] == i)
                    System.out.print("Q");
                else
                    System.out.print(" ");
            }
            System.out.print("|\n");
        }
        System.out.println();
    }
}
