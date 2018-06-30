package singleton.singleEnum;

/**
 * Created by liangtao on 2018-03-02.
 * 对于传统的单例构造（私有构造方法，私有静态实例（懒实例化/直接实例化），公有静态获取方法）
 * 涉及到线程安全问题，即使加多重锁也可以通过反射破坏单例
 *
 *
 */
public class Emperor {

    private Emperor(){}//私有化构造器
    public static Emperor getInstance(){
        return Singleton.INSTANCE.getInstance();
    }

    private String name="唐太宗--枚举";

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    private static enum Singleton{

        INSTANCE;
        private Emperor emperor;
        //枚举类型构造器必须为private修饰
        //jvm会保证此方法绝对只调用一次（实例化INSTANCE时）
        private Singleton(){
            emperor=new Emperor();
        }

        public Emperor getInstance(){
            return emperor;
        }
    }
}
