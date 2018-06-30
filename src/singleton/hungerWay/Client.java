package singleton.hungerWay;

/**
 * Created by bcc on 2018-03-02.
 */
public class Client {
    public static void main(String[] args) {
        //四天了 皇帝还是那个皇帝  唐太宗
        for(int i=0;i<4;i++){
            Emperor emperor=Emperor.getInstance();
            System.out.println(emperor.getName());
        }

        //对象默认是不可以复制的，
        //实现Cloneable接口，并实现改了clone()方法，就可以直接通过复制方式创建一个新对象
        //对象复制不是调用类的构造函数，所以即使是私有的构造函数依然可以被复制
        //一般只要不是先 Cloneable接口就好

        //单例模式应用场景
        //创建一个对象需要消耗的资源过多时，如要访问IO和数据库等的资源
    }
}
