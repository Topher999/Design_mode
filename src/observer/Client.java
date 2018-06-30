package observer;

/**
 * @Author:LiangTao
 * @Description:观察者模式----------（订阅发布模式）
 *
 * 优点：
 *
 * 缺点：
 * 注意开发效率和运行效率
 * 一个被观察者，多个观察者，开发和调试都比较复杂，，
 * 一个消息通知的卡壳，会影响整体的执行效率
 * 多级触发的效率更得让人担忧
 *
 * 应用场景：
 * 可拆分的关联行为
 * 事件多级触发
 * 跨系统的信息交换，例：消息队列中的处理机制
 *
 * java自带的观察者模式
 * java.util.Observable
 * java.util.Observer
 *
 *
 * 观察者与被观察者之间的消息传输，
 * DTO (Data Transfer Object) 传输对象，一般是一个纯洁的javabean ,由被观察者产生，由观察者消费
 * 如果考虑到远程传输，一般消息是以XML格式传输
 *
 * 观察者来不及响应，会把被观察者的执行时间拉长，
 * 让观察者快速响应：1.多线程  2.缓存技术
 *
 *
 * 被观察者不一定非要通知观察者，判断的逻辑最好写在被观察者，以免加重观察者的逻辑（看具体情况吧）
 *
 *
 * 观察者模式和责任链模式最大的区别在于观察者广播链在传播过程中消息是随时更改的，他是有相邻两个节点协商的消息结构，
 * 而责任链模式在传播过程中基本保持消息不可变，如果要改变，也只是在原有消息上进行修正
 *
 * @Date: Created in 11:27 2018/6/18.
 */
public class Client {


    public static void main(String[] args) {
        ConcreteEntity concreteEntity=new ConcreteEntity();
        concreteEntity.addObserver(new ConcreteObserverA());
        concreteEntity.addObserver(new ConcreteObserverB());

        concreteEntity.doSomething();
    }
}
