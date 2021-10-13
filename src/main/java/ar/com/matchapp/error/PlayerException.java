package ar.com.matchapp.error;

import ar.com.matchapp.enums.PlayerErrorCode;

public class PlayerException extends RuntimeException {
    public PlayerException(PlayerErrorCode errorCode) { super( "[" + errorCode.getCode() + "]"); }
}
