package visitor.doubleDispatch;

/**
 * @Author:LiangTao
 * @Description:
 * @Date: Created in 17:54 2018/6/19.
 */
public class OlderActor extends AbstractActor {


    @Override
    public void act(IdiotRole idiotRole) {
        System.out.println("老演员，可以很好的演傻子");
    }

    @Override
    public void act(KungFuRole kungFuRole) {
        System.out.println("老演员，演不动功夫角色了");
    }
}
