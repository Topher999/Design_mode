package observer.and_template;


import observer.ConcreteObserverA;
import observer.ConcreteObserverB;

/**
 * @Author:LiangTao
 * @Description:观察者模式----------（订阅发布模式）
 *  结合模版模式，逻辑处理那部分代码没有被污染
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
