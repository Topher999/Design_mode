package proxy.dynamicProxy;

import proxy.forceProxy.GamePlayer;
import proxy.forceProxy.IGamePlayer;

/**
 * @Author:LiangTao
 * @Description:代理模式------jdk动态代理
 * 运行阶段才之指定代理哪个类
 *
 *
 *
 *
 * @Date: Created in 16:16 2018/3/3.
 */
public class Client {
    public static void main(String[] args) {
        ISubject subject=new RealSubject();
        ISubject subjectProxy=DynamicProxy.newProxyInstance(subject);
        subjectProxy.request();


    }
}
