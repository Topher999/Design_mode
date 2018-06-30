package adaptor;

/**
 * @Author:LiangTao
 * @Description:适配器模式
 *
 * 是一个补救模式
 *
 *
 * @Date: Created in 16:39 2018/6/13.
 */
public class Client {

    public static void main(String[] args) {
        ITarget target=new ClassAdapter();
        target.getName();

        target=new ObjectAdapter(new AdapteeA());
        target.getName();
    }
}
