package adaptor;

/**
 * @Author:LiangTao
 * @Description:类适配器
 *
 * 继承关系
 *
 * @Date: Created in 16:41 2018/6/13.
 */
public class ClassAdapter extends AdapteeA implements ITarget  {
    @Override
    public void getName() {
        super.getUsername();
    }
}
