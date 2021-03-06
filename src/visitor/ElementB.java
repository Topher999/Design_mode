package visitor;

/**
 * @Author:LiangTao
 * @Description:
 * @Date: Created in 16:10 2018/6/19.
 */
public class ElementB extends AbstractElement {
    @Override
    public void accept(IVisitor visitor) {
        visitor.visit(this);
    }

    @Override
    public void doSomething() {
        System.out.println("ElementB--doSomething()");
    }
}
