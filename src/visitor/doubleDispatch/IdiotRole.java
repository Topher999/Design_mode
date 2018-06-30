package visitor.doubleDispatch;

/**
 * @Author:LiangTao
 * @Description:
 * @Date: Created in 17:47 2018/6/19.
 */
public class IdiotRole extends AbstractRole{


    @Override
    public void accept(AbstractActor abstractActor) {
        abstractActor.act(this);
    }
}
