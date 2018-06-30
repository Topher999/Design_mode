package observer;

/**
 * @Author:LiangTao
 * @Description:
 * @Date: Created in 11:45 2018/6/18.
 */
public class ConcreteEntity extends Observable implements IEntity {
    @Override
    public void doSomething() {
        notifyAllObserver("沉默的世界");
    }
}
