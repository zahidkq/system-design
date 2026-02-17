package LLD.ticTacToe.strategy;

import LLD.ticTacToe.model.Board;
import LLD.ticTacToe.model.Move;

public interface WinningStrategy {
    boolean checkWin(Board board, Move move);
}
