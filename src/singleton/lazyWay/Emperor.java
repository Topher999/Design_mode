package singleton.lazyWay;

/**
 * Created by liangtao  on 2018-03-02.
 */
//皇帝只能有一个，
public class Emperor {
    private String name;
    private static  Emperor emperor=null;
    private Emperor(){
        this.name="唐太宗";
    }
    //加锁保证线程安全
    public synchronized  static Emperor getInstance(){
        if(emperor==null){
            emperor=new Emperor();
        }
        return emperor;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
