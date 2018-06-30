package command;

/**
 * @Author:LiangTao
 * @Description:
 * @Date: Created in 11:10 2018/6/6.
 */
public class ConcreteReceiverB extends Receiver {
    @Override
    public void doSomething() {
        System.out.println("ConcreteReceiverB----doSomething()");
    }
}
