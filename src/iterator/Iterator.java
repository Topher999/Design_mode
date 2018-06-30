package iterator;

import java.util.Vector;

/**
 * @Author:LiangTao
 * @Description:
 * @Date: Created in 17:09 2018/6/13.
 */
public class Iterator<E> implements IIterator<E> {

    Vector<E> vector=null;


    public Iterator(Vector<E> vector) {
        this.vector = vector;
    }

    public int cursor=0;

    @Override
    public E next() {
        if(this.hasNext()){
            return vector.get(cursor++);
        }
        return null;
    }

    @Override
    public boolean hasNext() {
        if(cursor==this.vector.size()){
            return false;
        }
        return true;
    }

}
