package memorandum.improved;

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

    public IMemo createMemo(){
        return new Memo(this.state);
    }

    public void restoreMemo(IMemo memo) throws Exception {
        if(!(memo instanceof Memo)){
            throw new Exception("备忘录类型错误");
        }
        this.state=((Memo)memo).getState();
    }

    //备忘录
     class Memo implements IMemo{
         private String state;

        private String getState() {
            return state;
        }


        private Memo(String state) {
            this.state = state;
        }

        private void setState(String state) {
            this.state = state;
        }



    }
}
