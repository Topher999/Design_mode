package command;

/**
 * @Author:LiangTao
 * @Description:
 * @Date: Created in 11:10 2018/6/6.
 */
public class ConcreteReceiverA extends Receiver {
    @Override
    public void doSomething() {
        System.out.println("ConcreteReceiverA----doSomething()");
    }
}
