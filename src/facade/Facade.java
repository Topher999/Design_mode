package facade;

/**
 * @Author:LiangTao
 * @Description:
 * @Date: Created in 23:09 2018/6/1.
 */
public class Facade {
    ClassA classA=new ClassA();
    ClassB classB=new ClassB();

    public void methodA(){
        this.classA.doSomethingA();
    }

    public void methodB(){
        this.classB.doSomethingB();
    }
}
