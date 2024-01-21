package packages;

public class Checkwinner {
    public static boolean winner() {
        for (int i = 0; i < 6; i+=3) {
            if (Grid.played.get(i).equals(Grid.played.get(i+1)) && Grid.played.get(i).equals(Grid.played.get(i+2))) {
                return true;
            }
        }
        for (int j = 0; j < 2; j++) {
            if (Grid.played.get(j).equals(Grid.played.get(j+3)) && Grid.played.get(j).equals(Grid.played.get(j+6))) {
                return true;
            }
        if (Grid.played.get(0).equals(Grid.played.get(4)) && Grid.played.get(0).equals(Grid.played.get(8))) {
            return true;
        }
        if (Grid.played.get(2).equals(Grid.played.get(4)) && Grid.played.get(2).equals(Grid.played.get(6))) {
            return true;
        }
    }
    return false;
}
}
