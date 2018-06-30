package visitor.doubleDispatch;

/**
 * @Author:LiangTao
 * @Description:
 * @Date: Created in 17:44 2018/6/19.
 */
public abstract class AbstractActor {

    public void act(AbstractRole abstractRole){
        System.out.println("未知的角色");
    }
    public abstract void act(IdiotRole idiotRole);
    public abstract void act(KungFuRole kungFuRole);
}
