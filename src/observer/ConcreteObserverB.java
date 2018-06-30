package observer;

/**
 * @Author:LiangTao
 * @Description:
 * @Date: Created in 11:39 2018/6/18.
 */
public class ConcreteObserverB implements IObserver {

    @Override
    public void update(String msg) {
        System.out.println("ConcreteObserverB------update()--start");
        System.out.println("收到信息："+msg);
        System.out.println("ConcreteObserverB------update()-----end");
    }
}
