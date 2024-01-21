package packages;

import java.util.Scanner;

public class Game {
    public static boolean isOver = false;
    public static String player = "X";

    public static void gameRunning(){
        Scanner scanner = new Scanner(System.in);
        while (!isOver) {
            move(scanner);
        }
        scanner.close();
    }

    public static void move(Scanner scanner) {
        System.out.print("Player "+ player + " enter your move (1 - 9): ");
        Integer field = scanner.nextInt();
        if (Grid.played.get(field-1).equals("X") || Grid.played.get(field-1).equals("O")) {
            System.out.println("Field already taken!");
            move(scanner);
            return;
        }

        Grid.printGrid(player, field);
        if (Checkwinner.winner()) {
            System.out.println("Player " + player + " won!");
            isOver = true;
            return;
        }
        player = player.equals("X") ? "O" : "X";
    }

}
