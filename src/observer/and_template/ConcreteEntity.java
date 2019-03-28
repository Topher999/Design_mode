package observer.and_template;

import javafx.beans.InvalidationListener;
/**
 * @Author:LiangTao
 * @Description:
 * @Date: Created in 11:45 2018/6/18.
 */
public class ConcreteEntity  extends IEntity {
    @Override
    public void process() {
        System.out.println("ConcreteEntity  doSomething");
    }

}
