package LLD.ticTacToe.model;

import LLD.ticTacToe.enums.Symbol;

public class Player {
    private String playerName;
    private Symbol symbol;
    public Player(String name, Symbol symbol){
        this.playerName = name;
        this.symbol = symbol;
    }
    public String getPlayerName(){
        return this.playerName;
    }
    public Symbol getSymbol() {
        return symbol;
    }
}
