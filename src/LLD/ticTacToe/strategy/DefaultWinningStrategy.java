package LLD.ticTacToe.strategy;

import LLD.ticTacToe.enums.Symbol;
import LLD.ticTacToe.model.Board;
import LLD.ticTacToe.model.Cell;
import LLD.ticTacToe.model.Move;

public class DefaultWinningStrategy implements WinningStrategy{
    @Override
    public boolean checkWin(Board board, Move move) {
       boolean win = false;
        int row = move.getRow();
        int col = move.getCol();
        Symbol symbol = move.getPlayer().getSymbol();
        int size = board.getSize();
        Cell[][] grid = board.getGrid();

       //check row
        for(int i = 0; i < size; i++){
            if(grid[row][i].getSymbol() == symbol) {
                win = true;
            } else {
                win = false;
                break;
            }
        }
        if(win) return win;
        //check col
        for(int j = 0; j < size; j++){
            if(grid[j][col].getSymbol() == symbol) {
                win = true;
            } else {
                win = false;
                break;
            }
        }
        if(win) return win;
        //check diagonal
        for(int k = 0; k < size; k++){
            if(grid[k][k].getSymbol() == symbol){
                win = true;
            } else {
                win = false;
                break;
            }
        }

       return win;
    }
}
