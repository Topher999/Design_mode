package observer;

import java.util.Vector;

/**
 * @Author:LiangTao
 * @Description:
 * @Date: Created in 11:33 2018/6/18.
 */
public abstract class Observable {
    private Vector<IObserver> observers=new Vector<>();

    public void addObserver(IObserver observer){
        this.observers.add(observer);
    };

    public void delObserver(IObserver observer){
        this.observers.remove(observer);
    }

    public void notifyAllObserver(String msg){
        for(IObserver observer:observers){
            observer.update(msg);
        }
    }
}
