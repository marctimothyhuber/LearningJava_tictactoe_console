package packages;

import java.util.ArrayList;

public class Grid {
    public static ArrayList<String> played = new ArrayList<String>();

    public static void initiateGrid() {
        Flush.flush();
        System.out.println("  TicTacToe");
        System.out.println("-------------");
        System.out.println("| 1 | 2 | 3 |");
        System.out.println("-------------");
        System.out.println("| 4 | 5 | 6 |");
        System.out.println("-------------");
        System.out.println("| 7 | 8 | 9 |");
        System.out.println("-------------");

        for (int i = 0; i < 9; i++) {
            played.add(String.valueOf(i + 1));
        }
    }

    public static void printGrid(String player, Integer field) {
        played.set(field - 1, player);
        Flush.flush();
        System.out.println("  TicTacToe");
        System.out.println("-------------");
        System.out.println("| " + played.get(0) + " | " + played.get(1) + " | " + played.get(2) + " |");
        System.out.println("-------------");
        System.out.println("| " + played.get(3) + " | " + played.get(4) + " | " + played.get(5) + " |");
        System.out.println("-------------");
        System.out.println("| " + played.get(6) + " | " + played.get(7) + " | " + played.get(8) + " |");
        System.out.println("-------------");
    }
}


