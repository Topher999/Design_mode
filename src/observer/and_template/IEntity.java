package observer.and_template;


import observer.Observable;

/**
 * @Author:LiangTao
 * @Description:被观察者自身活动接口
 * @Date: Created in 11:43 2018/6/18.
 */
public abstract class IEntity extends Observable {
    public abstract void process();

    public void doSomething(){
        this.process();
        this.notifyAllObserver("沉默的世界");
    }

}
