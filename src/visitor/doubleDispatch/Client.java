package visitor.doubleDispatch;

/**
 * @Author:LiangTao
 * @Description:双分派的访问者模式
 *
 *
 * 一次分派通过方法重载，静态绑定
 * 一次分派通过方法重写/多态，动态绑定
 *
 * 所谓的双分派，则是希望a.foo(b)能够①按照a的实际类型绑定其override的方法体，而且能够②按照b的实际类型绑定其重载的方法即foo(Y)、foo(Y1)、foo(Y2)中的适当方法体
 *
 *
 *
 *
 * @Date: Created in 17:42 2018/6/19.
 */
public class Client {

    public static void main(String[] args) {
        AbstractRole kungFuRole=new KungFuRole();
        AbstractActor youngActor=new YoungActor();
        kungFuRole.accept(youngActor);

        AbstractRole idiotRole = new IdiotRole();
        AbstractActor olderActor=new OlderActor();
        idiotRole.accept(olderActor);
    }
}
