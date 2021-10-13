package ar.com.matchapp.error;

import ar.com.matchapp.enums.TeamErrorCode;

public class TeamException extends RuntimeException {
    public TeamException(TeamErrorCode errorCode) { super( "[" + errorCode.getCode() + "]"); }
}
