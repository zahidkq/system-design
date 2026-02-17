package LLD.ticTacToe.model;

public class Move {
    private int row;
    private int col;
    private Player player;

    public Move(int row, int col, Player player){
        this.col = col;
        this.row = row;
        this.player = player;
    }
    public int getCol() {
        return col;
    }

    public int getRow() {
        return row;
    }

    public Player getPlayer() {
        return player;
    }
}
