package visitor;

/**
 * @Author:LiangTao
 * @Description:
 * @Date: Created in 16:10 2018/6/19.
 */
public abstract class AbstractElement {

    public abstract void accept(IVisitor visitor);

    public abstract void doSomething();

}
