package proxy.dynamicProxy;

/**
 * @Author:LiangTao
 * @Description:
 * @Date: Created in 16:11 2018/3/3.
 */
public class RealSubject implements ISubject {

    @Override
    public void request() {
        System.out.println("realSubject request");
    }
}
