package LLD.ticTacToe.exception;

public abstract class GlobalException extends RuntimeException {
    public GlobalException(String message) {
        super(message);
    }
}
