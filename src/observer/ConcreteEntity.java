package observer;

/**
 * @Author:LiangTao
 * @Description:
 * @Date: Created in 11:45 2018/6/18.
 */
public class ConcreteEntity extends Observable implements IEntity {
    @Override
    public void doSomething() {
        //fixme 这样对代码有入侵，破坏逻辑代码
        this.notifyAllObserver("沉默的世界");
    }
}
