package iterator;

import java.util.Vector;

/**
 * @Author:LiangTao
 * @Description:
 * @Date: Created in 17:10 2018/6/13.
 */
public interface IAggregate<E> {
    public void add(E e);
    public Iterator iterator();
}
