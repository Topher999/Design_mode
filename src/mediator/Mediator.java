package mediator;

/**
 * @Author:LiangTao
 * @Description:
 * @Date: Created in 21:55 2018/6/1.
 */
public abstract class Mediator {

    //因为这些类是属于同事类，类之间是协作关系，不是兄弟关系，没有相同的血缘，所以Colleague中并没有定义方法，只是将中介者交由同事类持有
    //所以这边得用同事类的实现类，才能调用具体的方法
    protected ConcreteColleagueA concreteColleagueA;
    protected ConcreteColleagueB concreteColleagueB;
    protected ConcreteColleagueC concreteColleagueC;

    public Mediator() {
    }



    public ConcreteColleagueA getConcreteColleagueA() {
        return concreteColleagueA;
    }

    public void setConcreteColleagueA(ConcreteColleagueA concreteColleagueA) {
        this.concreteColleagueA = concreteColleagueA;
    }

    public ConcreteColleagueB getConcreteColleagueB() {
        return concreteColleagueB;
    }

    public void setConcreteColleagueB(ConcreteColleagueB concreteColleagueB) {
        this.concreteColleagueB = concreteColleagueB;
    }

    public ConcreteColleagueC getConcreteColleagueC() {
        return concreteColleagueC;
    }

    public void setConcreteColleagueC(ConcreteColleagueC concreteColleagueC) {
        this.concreteColleagueC = concreteColleagueC;
    }

    public abstract  void doSomethingAB();
    public abstract  void doSomethingBC();
    public abstract  void doSomethingAC();

}
