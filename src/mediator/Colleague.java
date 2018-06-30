package mediator;

/**
 * @Author:LiangTao
 * @Description:
 * @Date: Created in 21:56 2018/6/1.
 */
public abstract class Colleague {

    protected Mediator mediator;

    public Colleague(Mediator mediator) {
        this.mediator=mediator;
    }
}
