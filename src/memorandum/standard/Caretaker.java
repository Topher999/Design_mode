package memorandum.standard;

import java.util.HashMap;
import java.util.Map;

/**
 * @Author:LiangTao
 * @Description:
 * @Date: Created in 13:51 2018/6/19.
 */
public  class Caretaker {

    private Map<String,Memo> memoMap=new HashMap<>();

    public void addMemo(String name,Memo memo){
        memoMap.put(name,memo);
    }

    public void delMemo(String name){
        memoMap.remove(name);
    }

    public  Memo getMemo(String name ){
        return memoMap.get(name);
    }
}
