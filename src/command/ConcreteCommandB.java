package command;

/**
 * @Author:LiangTao
 * @Description:
 * @Date: Created in 11:00 2018/6/6.
 */
public class ConcreteCommandB extends Command{

    private Receiver receiver;



    @Override
    public void execute() {
        System.out.println("ConcreteCommandB----execute()");
        this.cReceiver.doSomething();
    }
}
