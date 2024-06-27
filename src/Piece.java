/*
 * Name: Pakawat Panklang
 * Student ID: 6510450763
 */

public class Piece {
    private String color;
    private Square location;

    public Piece(String pieceColor, Square square) {
        color = checkColor(pieceColor);
        location = square;
    }

    public String checkColor(String color) {
        return switch (color) {
            case "R" -> "Red";
            case "Y" -> "Yellow";
            case "B" -> "Blue";
            case "G" -> "Green";
            case "P" -> "Pink";
            case "O" -> "Orange";
            case "BL" -> "Black";
            case "W" -> "White";
            default -> null;
        };
    }

    public String getColor() {
        return color;
    }

    public Square getLocation() {
        return location;
    }

    public void setLocation(Square location) {
        this.location = location;
    }
}
