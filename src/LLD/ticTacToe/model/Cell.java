package LLD.ticTacToe.model;

import LLD.ticTacToe.enums.Symbol;

public class Cell {
    private Symbol symbol = Symbol.EMPTY;

    public boolean isEmpty(){
        return this.symbol == Symbol.EMPTY;
    }
    public Symbol getSymbol(){
        return this.symbol;
    }
    public void setSymbol(Symbol symbol) {
        this.symbol = symbol;
    }
}
