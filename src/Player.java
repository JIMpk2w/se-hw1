import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Player {
    private final String name;
    private Die dice1;
    private Die dice2;
    private Piece piece;
    private Board board;

    public Player(String name, String pieceColor) {
        dice1 = new Die();
        dice2 = new Die();
        board = new Board();
        piece = new Piece(pieceColor, board.getSquares().get(0));

        this.name = name;
    }

    public void takeTurn() throws IOException {
        boolean check = true;
        while (check) {
            System.out.print("\n(R)oll or (P)iece Color or (L)ocation: ");

            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            String action = reader.readLine().toUpperCase();

            if (action.equals("R")) {
                dice1.roll();
                dice2.roll();

                System.out.println("Player: " + name);
                System.out.print("dice 1: " + dice1.getFaceValue() + "\n" + "dice 2: " + dice2.getFaceValue() + "\n");

                int fv1 = dice1.getFaceValue();
                int fv2 = dice2.getFaceValue();

                Square oldLoc = piece.getLocation();
                Square newLoc = board.getSquares(oldLoc, fv1 + fv2);

                piece.setLocation(newLoc);
                System.out.println(oldLoc.getName() + " to " + newLoc.getName() + "\n-------------------------------------");

                check = false;

            } else if (action.equals("P")) {
                System.out.println(piece.getColor());
            } else if (action.equals("L")) {
                System.out.println(piece.getLocation().getName());
            } else {
            System.out.println("Invalid Input!");
            }
        }
    }

    public String getName() {
        return name;
    }
}
