package visitor.doubleDispatch;

/**
 * @Author:LiangTao
 * @Description:
 * @Date: Created in 17:52 2018/6/19.
 */
public class YoungActor extends AbstractActor{


    @Override
    public void act(IdiotRole idiotRole) {
        System.out.println("年青演员，可以演傻子");
    }

    @Override
    public void act(KungFuRole kungFuRole) {
        System.out.println("年青演员，可以演功夫角色");
    }
}
