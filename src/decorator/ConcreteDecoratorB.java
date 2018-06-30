package decorator;

/**
 * @Author:LiangTao
 * @Description:
 * @Date: Created in 16:19 2018/6/6.
 */
public class ConcreteDecoratorB extends Decorator{



    public ConcreteDecoratorB(Component _component) {
        super(_component);
    }

    @Override
    public void operate() {
        super.operate();
        this.decorativeMethod();
    }

    private void decorativeMethod(){
        System.out.println("ConcreteDecoratorB----------decorativeMethod");
    }
}
