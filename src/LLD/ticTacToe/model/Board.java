package LLD.ticTacToe.model;

import LLD.ticTacToe.enums.Symbol;

public class Board {
    private Cell grid[][];
    private int size;

    public Board(int size){
        this.size = size;
        this.grid = new Cell[size][size];
        initializeGrid();
    }

    public boolean isCellEmpty(int row, int col){
        return grid[row][col].isEmpty();
    }

    public void setSymbol(Symbol symbol, int row, int col){
        grid[row][col].setSymbol(symbol);
    }

    public int getSize(){
        return this.size;
    }

    public Cell[][] getGrid(){
        return this.grid;
    }

    private void initializeGrid(){
        for(int i = 0; i < size; i++){
            for(int j = 0; j < size; j++){
                grid[i][j] = new Cell();
            }
        }
    }
}
