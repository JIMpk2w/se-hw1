import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) throws IOException {
        MGame master = new MGame();
        System.out.print("Hello and welcome!\n\n");

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        Set<String> usedColors = new HashSet<>();

        int player;
        while (true) {
            try {
                System.out.print("Enter number of players (2-8): ");
                player = Integer.parseInt(reader.readLine());
                if (player >= 2 && player <= 8) {
                    break;
                } else {
                    System.out.println("Invalid number of players.");
                }
            } catch (NumberFormatException e) {
                System.out.println("Invalid input!");
            }
        }

        for (int i = 1; i <= player; i++) {
            System.out.print("p" + i + " name: ");
            String s = reader.readLine();

            boolean check = true;
            String piece = null;

            while (check) {
                System.out.print("piece color (R)ed (Y)ellow (B)lue (G)reen (P)ink (O)range (BL)ack (W)hite: ");
                piece = reader.readLine().toUpperCase();

                if (piece.equals("R") || piece.equals("Y") || piece.equals("B") || piece.equals("G") ||
                piece.equals("P") || piece.equals("O") || piece.equals("BL") || piece.equals("W")) {
                    if (!usedColors.contains(piece)) {
                        usedColors.add(piece);
                        check = false;
                    } else {
                        System.out.println("Another player is using the same color!");
                    }
                } else {
                    System.out.println("Invalid Input!");
                }
            }

            master.addPlayer(s, piece);
            System.out.println();
        }

        int turnNum;
        while (true) {
            try {
                System.out.print("How many turns?: ");
                turnNum = Integer.parseInt(reader.readLine());
                break;
            } catch (NumberFormatException e) {
                System.out.println("Invalid input!");
            }
        }

        System.out.println("\nGame Start!\n");
        master.playGame(turnNum);
        System.out.println("\nThank you for playing!\n");
    }
}