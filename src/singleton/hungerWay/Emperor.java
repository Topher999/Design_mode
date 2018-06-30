package singleton.hungerWay;

/**
 * Created by liangtao  on 2018-03-02.
 */
//皇帝只能有一个，
public class Emperor {
    private String name;
    private static final Emperor emperor=new Emperor();
    private Emperor(){
        this.name="唐太宗";
    }
    public static Emperor getInstance(){
        return emperor;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
