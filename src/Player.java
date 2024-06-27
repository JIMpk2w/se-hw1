/*
 * Name: Pakawat Panklang
 * Student ID: 6510450763
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Player {
    private final String name;
    private Die dice1;
    private Die dice2;
    private Piece piece;
    private Board board;
    private int money;

    public Player(String name, String pieceColor) {
        dice1 = new Die();
        dice2 = new Die();
        board = new Board();
        piece = new Piece(pieceColor, board.getSquares().get(0));
        money = 2500;
        this.name = name;
    }

    public void takeTurn() throws IOException {
        boolean check = true;
        while (check) {
            System.out.print("\n(R)oll or (P)iece Color or (L)ocation or (M)oney: ");

            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            String action = reader.readLine().toUpperCase();

            if (action.equals("R")) {
                dice1.roll();
                dice2.roll();

                System.out.println("\nPlayer: " + name);
                System.out.print("dice 1: " + dice1.getFaceValue() + "\n" + "dice 2: " + dice2.getFaceValue() + "\n");

                int fv1 = dice1.getFaceValue();
                int fv2 = dice2.getFaceValue();

                Square oldLoc = piece.getLocation();
                Square newLoc = board.getSquares(oldLoc, fv1 + fv2);

                piece.setLocation(newLoc);
                System.out.println(oldLoc.getName() + " to " + newLoc.getName() + "\n");
                System.out.println("Location name: " + piece.getLocation().getName());
                System.out.println("Money on this location: " + piece.getLocation().getMoney());
                System.out.println("Owner: " + piece.getLocation().getOwner() + "\n");

                if (!piece.getLocation().getOwner().equals(name) && !piece.getLocation().getOwner().equals("")) {
                    decreaseMoney(piece.getLocation().getMoney());
                    System.out.println("You step on " + piece.getLocation().getOwner() + "'s location");
                    if (money - piece.getLocation().getMoney() < 0) {
                        System.out.println("\nGame Over!\n");
                        System.exit(0);
                    }
                } else if (board.getSquares().get(0).getName().equals(newLoc.getName()) || board.getSquares().get(10).getName().equals(newLoc.getName()) ||
                        board.getSquares().get(20).getName().equals(newLoc.getName()) || board.getSquares().get(30).getName().equals(newLoc.getName())) {
                    System.out.println("You step on free location");
                } else {
                    if (piece.getLocation().getOwner().equals("")) {

                        boolean checkBuy = true;
                        while (checkBuy) {
                            System.out.print("This location doesn't have the owner. Do you want to buy it? (Y)es or (N)o: ");
                            String own = reader.readLine().toUpperCase();
                            if (own.equals("Y")) {
                                if (money - piece.getLocation().getMoney() < 0) {
                                    System.out.println("Not enough money!");
                                } else {
                                    decreaseMoney(piece.getLocation().getMoney());
                                    piece.getLocation().setOwner(name);
                                    System.out.println("Location purchased!");

                                }
                                checkBuy = false;
                            } else if (own.equals("N")) {
                                System.out.println("Next!");
                                checkBuy = false;
                            } else {
                                System.out.println("Invalid Input!\n");
                            }
                        }

                    } else if (piece.getLocation().getOwner().equals(name)) {
                        System.out.println("You already buy it");
                    }else {
                        System.out.println("Already have the owner");
                    }
                }
                System.out.println("------------------------------------\n");
                check = false;

            } else if (action.equals("P")) {
                System.out.println(piece.getColor());
            } else if (action.equals("L")) {
                System.out.println("Location name: " + piece.getLocation().getName());
                System.out.println("Money on this location: " + piece.getLocation().getMoney());
                System.out.println("Owner: " + piece.getLocation().getOwner());
            } else if (action.equals("M")) {
                System.out.println("Money: " + money);
            } else {
                System.out.println("Invalid Input!");
            }
        }
    }

    public String getName() {
        return name;
    }

    public void decreaseMoney(int value) {
        money = money - value;
    }
}
