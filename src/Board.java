import java.util.ArrayList;

public class Board {
    private ArrayList<Square> squares;

    public Board() {
        squares = new ArrayList<>();
        makeBoard(squares);
    }

    public void addSquareName(ArrayList<Square> square, String name) {
        name = name.trim();

        if (!name.equals("")) {
            square.add(new Square(name));
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
        addSquareName(squares, "Zero Start");
        addSquareName(squares, "First Street");
        addSquareName(squares, "Second Avenue");
        addSquareName(squares, "Third Boulevard");
        addSquareName(squares, "Fourth Lane");
        addSquareName(squares, "Fifth Plaza");
        addSquareName(squares, "Sixth Square");
        addSquareName(squares, "Seventh Park");
        addSquareName(squares, "Eighth Court");
        addSquareName(squares, "Ninth Circle");
        addSquareName(squares, "Tenth Road");
        addSquareName(squares, "Eleventh Drive");
        addSquareName(squares, "Twelfth Terrace");
        addSquareName(squares, "Thirteenth Place");
        addSquareName(squares, "Fourteenth Garden");
        addSquareName(squares, "Fifteenth View");
        addSquareName(squares, "Sixteenth Way");
        addSquareName(squares, "Seventeenth Point");
        addSquareName(squares, "Eighteenth Walk");
        addSquareName(squares, "Nineteenth Promenade");
        addSquareName(squares, "Twentieth Crossing");
        addSquareName(squares, "Twenty-First Highway");
        addSquareName(squares, "Twenty-Second Path");
        addSquareName(squares, "Twenty-Third Ridge");
        addSquareName(squares, "Twenty-Fourth Heights");
        addSquareName(squares, "Twenty-Fifth Hollow");
        addSquareName(squares, "Twenty-Sixth Isle");
        addSquareName(squares, "Twenty-Seventh Meadow");
        addSquareName(squares, "Twenty-Eighth Estate");
        addSquareName(squares, "Twenty-Ninth Field");
        addSquareName(squares, "Thirtieth Grove");
        addSquareName(squares, "Thirty-First Hill");
        addSquareName(squares, "Thirty-Second Parkland");
        addSquareName(squares, "Thirty-Third Shore");
        addSquareName(squares, "Thirty-Fourth Valley");
        addSquareName(squares, "Thirty-Fifth Bay");
        addSquareName(squares, "Thirty-Sixth Cove");
        addSquareName(squares, "Thirty-Seventh Harbor");
        addSquareName(squares, "Thirty-Eighth Pond");
        addSquareName(squares, "Thirty-Ninth Forest");
        addSquareName(squares, "Fortieth Ridge");
    }
}
