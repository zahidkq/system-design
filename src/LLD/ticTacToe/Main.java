package LLD.ticTacToe;

import LLD.ticTacToe.enums.Symbol;
import LLD.ticTacToe.model.Board;
import LLD.ticTacToe.model.Player;
import LLD.ticTacToe.service.GameService;
import LLD.ticTacToe.strategy.DefaultWinningStrategy;

import java.util.List;

public class Main {
    public static void main(String[] args){
        Board board = new Board(3);
        Player p1 = new Player("Alice", Symbol.O);
        Player p2 = new Player("Bob", Symbol.X);
        GameService game = new GameService(board, List.of(p1, p2), new DefaultWinningStrategy());
        game.makeMove(0, 0);
        game.makeMove(1, 0);
        game.makeMove(0, 1);
        game.makeMove(1, 1);
        game.makeMove(0, 2);
    }
}
