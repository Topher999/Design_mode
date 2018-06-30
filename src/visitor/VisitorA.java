package visitor;

/**
 * @Author:LiangTao
 * @Description:
 * @Date: Created in 16:10 2018/6/19.
 */
public class VisitorA implements  IVisitor {


    @Override
    public void visit(ElementA _elementA) {
        System.out.println("VisitorA--visit---ElementA"+_elementA.toString());
        _elementA.doSomething();
    }

    @Override
    public void visit(ElementB _elementB) {
        System.out.println("VisitorA--visit---ElementB"+_elementB.toString());
        _elementB.doSomething();
    }




}
