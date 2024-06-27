/*
 * Name: Pakawat Panklang
 * Student ID: 6510450763
 */

import java.util.ArrayList;

public class Board {
    private ArrayList<Square> squares;

    public Board() {
        squares = new ArrayList<>();
        makeBoard(squares);
    }

    public void addSquare(ArrayList<Square> square, String name, int money) {
        name = name.trim();

        if (!name.equals("")) {
            square.add(new Square(name, money));
        }
    }

    public Square getSquares(Square oldLoc, int fv) {

        int currentLocation = 0;
        for (int i = 0; i < squares.size(); i++) {
            if (squares.get(i).getName().equals(oldLoc.getName())) {
                currentLocation = i;
                break;
            }
        }

        int newLocation = (currentLocation + fv) % squares.size();

        return squares.get(newLocation);
    }

    public ArrayList<Square> getSquares() {
        return squares;
    }

    public void makeBoard(ArrayList<Square> squares) {
        addSquare(squares, "Zero Start", 0);
        addSquare(squares, "First Street", 60);
        addSquare(squares, "Second Avenue", 60);
        addSquare(squares, "Third Boulevard", 140);
        addSquare(squares, "Fourth Lane", 120);
        addSquare(squares, "Fifth Plaza", 160);
        addSquare(squares, "Sixth Square", 100);
        addSquare(squares, "Seventh Park", 120);
        addSquare(squares, "Eighth Court", 170);
        addSquare(squares, "Ninth Circle", 110);
        addSquare(squares, "Tenth Road", 0);
        addSquare(squares, "Eleventh Drive", 140);
        addSquare(squares, "Twelfth Terrace", 160);
        addSquare(squares, "Thirteenth Place", 200);
        addSquare(squares, "Fourteenth Garden", 180);
        addSquare(squares, "Fifteenth View", 180);
        addSquare(squares, "Sixteenth Way", 200);
        addSquare(squares, "Seventeenth Point", 220);
        addSquare(squares, "Eighteenth Walk", 220);
        addSquare(squares, "Nineteenth Promenade", 240);
        addSquare(squares, "Twentieth Crossing", 0);
        addSquare(squares, "Twenty-First Highway", 260);
        addSquare(squares, "Twenty-Second Path", 260);
        addSquare(squares, "Twenty-Third Ridge", 150);
        addSquare(squares, "Twenty-Fourth Heights", 280);
        addSquare(squares, "Twenty-Fifth Hollow", 300);
        addSquare(squares, "Twenty-Sixth Isle", 300);
        addSquare(squares, "Twenty-Seventh Meadow", 320);
        addSquare(squares, "Twenty-Eighth Estate", 200);
        addSquare(squares, "Twenty-Ninth Field", 350);
        addSquare(squares, "Thirtieth Grove", -75);
        addSquare(squares, "Thirty-First Hill", 400);
        addSquare(squares, "Thirty-Second Parkland", 370);
        addSquare(squares, "Thirty-Third Shore", 320);
        addSquare(squares, "Thirty-Fourth Valley", 310);
        addSquare(squares, "Thirty-Fifth Bay", 500);
        addSquare(squares, "Thirty-Sixth Cove", 410);
        addSquare(squares, "Thirty-Seventh Harbor", 440);
        addSquare(squares, "Thirty-Eighth Pond", 510);
        addSquare(squares, "Thirty-Ninth Forest", 550);
    }
}
