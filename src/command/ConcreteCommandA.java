package command;

/**
 * @Author:LiangTao
 * @Description:
 * @Date: Created in 11:00 2018/6/6.
 */
public class ConcreteCommandA extends Command{
    @Override
    public void execute() {
        System.out.println("ConcreteCommandA----execute()");
        this.receiver.doSomething();
        this.cReceiver.doSomething();
    }
}
