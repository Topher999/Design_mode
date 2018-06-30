package proxy.dynamicProxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

/**
 * @Author:LiangTao
 * @Description:
 * @Date: Created in 18:09 2018/3/3.
 */
public class DynamicProxy {
    public static <T> T newProxyInstance(ISubject subject){
        ClassLoader loader=subject.getClass().getClassLoader();
        Class<?>[] interfaces=subject.getClass().getInterfaces();
        InvocationHandler handler=new MyInvocationHandler(subject);
        return (T) Proxy.newProxyInstance(loader,interfaces,handler);
    }
}
