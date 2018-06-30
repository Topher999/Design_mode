package memorandum.standard;

/**
 * @Author:LiangTao
 * @Description:
 * @Date: Created in 13:49 2018/6/19.
 */
public class Memo{
    public String getState() {
        return state;
    }


    public Memo(String state) {
        this.state = state;
    }

    public void setState(String state) {
        this.state = state;
    }

    private String state="";

}
