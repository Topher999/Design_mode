package singleton.singleEnum;


/**
 * Created by liangtao on 2018-03-02.
 */
public class Client {
    public static void main(String[] args) {
        //四天了 皇帝还是那个皇帝  唐太宗
        for(int i=0;i<4;i++){
            Emperor emperor=Emperor.getInstance();
            System.out.println(emperor.getName());
        }

    }
}
