package LLD.ticTacToe.service;

import LLD.ticTacToe.enums.GameStatus;
import LLD.ticTacToe.exception.InvalidMoveException;
import LLD.ticTacToe.model.Board;
import LLD.ticTacToe.model.Move;
import LLD.ticTacToe.model.Player;
import LLD.ticTacToe.strategy.WinningStrategy;

import java.util.List;

public class GameService {
    private Board board;
    private List<Player> playerList;
    private WinningStrategy strategy;
    int moveCount = 0;
    int currentPlayerInd = 0;
    private GameStatus status;

    public GameService(Board board, List<Player> list, WinningStrategy strategy){
        this.board = board;
        this.playerList = list;
        this.strategy = strategy;
        status = GameStatus.IN_PROGRESS;
    }

    public void makeMove(int row, int col){
        if(board.isCellEmpty(row, col) == false){
            throw new InvalidMoveException("Symbol present already! Choose another Cell...");
        }
        Player player = playerList.get(currentPlayerInd);
        Move move = new Move(row, col, player);
        board.setSymbol(player.getSymbol(), row, col);
        moveCount++;

        if(strategy.checkWin(board, move)){
            status = GameStatus.WIN;
            System.out.println(player.getPlayerName() + " wins!");
            return;
        }
        if(moveCount == board.getSize() * board.getSize()){
            status = GameStatus.DRAW;
            System.out.println("Draw!");
            return;
        }
        currentPlayerInd = (currentPlayerInd + 1) % playerList.size();
    }

}
