package mediator;


/**
 * @Author:LiangTao
 * @Description:
 * @Date: Created in 21:55 2018/6/1.
 */
public class ConcreteMediator extends Mediator{

    @Override
    public void doSomethingAB(){
        System.out.println("depMethodA---------中介者处理的逻辑--start");
        super.concreteColleagueA.selfMethodA();
        super.concreteColleagueB.selfMethodB();
        System.out.println("depMethodA---------中介者处理的逻辑---end");
    }

    @Override
    public void doSomethingBC() {
        //调用多个同事类的方法，进行逻辑处理
    }

    @Override
    public void doSomethingAC(){

    }
}
