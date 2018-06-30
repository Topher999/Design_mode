package prototype;

/**
 * @Author:LiangTao
 * @Description:原型模式：通过拷贝原型创建新的对象
 *
 * Cloneable接口 标记接口
 *
 * 重写Object clone()方法   是内存二进制流的拷贝，比直接new一个对象要效率高的多，(因为直接在内存中执行,所以不会执行构造器)
 *
 * 浅拷贝，深拷贝
 *
 * 对象的克隆和对象的内final关键字冲突
 *
 *
 * @Date: Created in 22:20 2018/6/5.
 */
public class Client implements Cloneable{
    public static void main(String[] args) {
        PrototypeClass prototypeClass=new PrototypeClass();
        prototypeClass.setAge(1);
        prototypeClass.setName("name");
        PrototypeClass prototypeClassClone = prototypeClass.clone();
        prototypeClass.setName("various_name");
        System.out.println(prototypeClass.toString());
        System.out.println(prototypeClassClone.toString());
    }


}


