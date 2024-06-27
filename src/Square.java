/*
 * Name: Pakawat Panklang
 * Student ID: 6510450763
 */

public class Square {
    private String name;
    private int money;
    private String owner;

    public Square(String name, int money) {
        this.name = name;
        this.money = money;
        this.owner = "";
    }

    public String getName() {
        return name;
    }

    public int getMoney() {
        return money;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }
}
