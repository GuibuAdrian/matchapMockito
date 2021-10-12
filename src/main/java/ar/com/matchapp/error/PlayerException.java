package ar.com.matchapp.error;

public class PlayerException extends RuntimeException {
    public PlayerException(PlayerErrorCode errorCode) { super( "[" + errorCode.getCode() + "]"); }
}
