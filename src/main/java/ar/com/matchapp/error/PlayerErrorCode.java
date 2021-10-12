package ar.com.matchapp.error;

public enum PlayerErrorCode {
    NOT_FOUND(500);

    private int code;

    PlayerErrorCode(int code){
        this.code = code;
    }

    public int getCode(){
        return code;
    }
}
