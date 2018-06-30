package memorandum.standard;

/**
 * @Author:LiangTao
 * @Description:
 * @Date: Created in 13:49 2018/6/19.
 */
public class Originator {

    private String state;


    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    @Override
    public String toString() {
        return "Originator{" +
                "state='" + state + '\'' +
                '}';
    }

    public Memo createMemo(){
        return new Memo(this.state);
    }

    public void restoreMemo(Memo memo){
        this.state=memo.getState();
    }
}
