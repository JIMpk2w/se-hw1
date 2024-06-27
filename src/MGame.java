/*
 * Name: Pakawat Panklang
 * Student ID: 6510450763
 */

import java.io.IOException;
import java.util.ArrayList;

public class MGame {
    private int roundCnt;
    private ArrayList<Player> players;
    private Die dice1;
    private Die dice2;
    private Board board;

    public MGame() {
        roundCnt = 0;
        players = new ArrayList<>();
        dice1 = new Die();
        dice2 = new Die();
        board = new Board();
    }

    public void addPlayer(String name, String pieceColor) {
        name = name.trim();
        if (!name.equals("")) {
           players.add(new Player(name, pieceColor));
        }
    }

    public void playGame(int round) throws IOException {
        while (roundCnt < round) {
            playRound();
            roundCnt++;
        }
    }

    private void playRound() throws IOException {
        for (Player player : players) {
            System.out.print("player: " + player.getName());
            player.takeTurn();
        }
    }
}
