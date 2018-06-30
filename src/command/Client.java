package command;

/**
 * @Author:LiangTao
 * @Description:命令模式
 *
 * 常用命令
 *
 * 将请求封装成一个对象
 *
 * Command子类的扩展非常容易，
 * 命令模式结合责任链模式，实现命令族解析任务
 * 结合模板方法可以，减少Command子类膨胀的问题？？？？怎么回事
 *
 * 缺点
 * Command的子类可能有N个，造成子类膨胀的特别大？？
 *
 *
 * @Date: Created in 0:00 2018/6/6.
 */
public class Client {

    public static void main(String[] args) {
        Invoker invoker = new Invoker();
        Command commandA=new ConcreteCommandA();
        commandA.setReceiver(new ConcreteReceiverB());
        invoker.invoke(commandA);

        Command commandB=new ConcreteCommandB();
        invoker.invoke(commandB);
    }
}
