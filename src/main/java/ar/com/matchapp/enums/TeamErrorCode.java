package ar.com.matchapp.enums;

public enum TeamErrorCode {
    NOT_FOUND(500);

    private int code;

    TeamErrorCode(int code){
        this.code = code;
    }

    public int getCode(){
        return code;
    }
}
