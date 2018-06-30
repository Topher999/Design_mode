package command;

/**
 * @Author:LiangTao
 * @Description:命令对象
 * @Date: Created in 10:59 2018/6/6.
 */
public abstract class Command {

    //默认ConcreteReceiverA
    protected Receiver receiver=new ConcreteReceiverA();
    protected Receiver cReceiver=new ConcreteReceiverC();

    public void  setReceiver(Receiver receiver){
        this.receiver=receiver;
    }

    //命令干活的方法
    public abstract void execute();
}
