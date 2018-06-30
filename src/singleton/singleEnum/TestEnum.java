package singleton.singleEnum;

/**
 * Created by liangtao on 2018-03-02.
 * 可以吧TestEnum看成一个继承了Enum的类，A,B 看做是TestEnum的实例
 * 一个enum的构造方法是私有的
 *
 */
public enum TestEnum {
    A{
        @Override
        public String getType() {
            System.out.println("A----------getType()");

            return null;
        }
    },B{
        @Override
        public String getType() {
            return null;
        }
    };
    //定义抽象方法让子类继承
    public abstract String getType();

    //静态成员
    public static int staticValue=1;
    public static int getStaticValue(){
        return  staticValue;
    }

    //实例成员
    public int value=10;
    public  int getValue(){
        return value;
    }

}
class Test{
    public static void main(String[] args) {
        //访问静态成员
        System.out.println(TestEnum.staticValue);
        System.out.println(TestEnum.getStaticValue());
//        TestEnum.A.staticValue;
        System.out.println(TestEnum.A.getStaticValue());

        // 访问实例成员
        System.out.println(TestEnum.A.value);
        System.out.println(TestEnum.A.getValue());

        TestEnum.A.getType();

    }
}

