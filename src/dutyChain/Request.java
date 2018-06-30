package dutyChain;

/**
 * @Author:LiangTao
 * @Description:
 * @Date: Created in 11:44 2018/6/6.
 */
public  class Request {

    private Level level;
    private String message;

    public Level getLevel() {
        return level;
    }

    public void setLevel(Level level) {
        this.level = level;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Request(Level level,String message) {
        this.level=level;
        this.message=message;
    }
}
