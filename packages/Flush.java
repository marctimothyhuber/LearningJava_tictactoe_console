package packages;

public class Flush {
    public static void flush() {
        System.out.print("\033[H\033[2J");
    }
}
