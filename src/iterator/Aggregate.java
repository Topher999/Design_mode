package iterator;

import java.util.Vector;

/**
 * @Author:LiangTao
 * @Description:
 * @Date: Created in 17:10 2018/6/13.
 */
public class Aggregate<E> implements  IAggregate<E>{

    private Vector<E> vector=new Vector<E>();

    @Override
    public void add(E e) {
        this.vector.add(e);
    }

    @Override
    public Iterator iterator() {
        return new Iterator(this.vector);
    }

}
