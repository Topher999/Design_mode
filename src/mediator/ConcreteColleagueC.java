package mediator;

/**
 * @Author:LiangTao
 * @Description:
 * @Date: Created in 21:56 2018/6/1.
 */
public class ConcreteColleagueC extends Colleague{

    public ConcreteColleagueC(Mediator mediator) {
        super(mediator);
    }

    public void selfMethodC(){
        //C可以自己做的，不依赖于别的类
    }

    public void depMethodC(){
        //处理自己的业务逻辑
        //自己处理不了得，需要依赖于别的类做的,委托给中介者处理
        super.mediator.doSomethingAC();
    }
}
