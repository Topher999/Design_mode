package adaptor;

/**
 * @Author:LiangTao
 * @Description:对象适配器
 *
 * 关联关系
 *
 * @Date: Created in 16:45 2018/6/13.
 */
public class ObjectAdapter implements ITarget {
    private AbstractAdaptee adaptee;

    public ObjectAdapter(AbstractAdaptee _adaptee){
        this.adaptee=_adaptee;
    }
    @Override
    public void getName() {
        this.adaptee.getUsername();
    }
}
