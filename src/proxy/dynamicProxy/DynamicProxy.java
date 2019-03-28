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
        ClassLoader loader=ISubject.class.getClassLoader();
//        Class<?>[] interfaces=ISubject.class.getInterfaces();
        Class<?>[] interfaces=new Class[]{ISubject.class};
//        InvocationHandler handler=new MyInvocationHandler(subject);
        InvocationHandler handler=new MyInvocationHandler();
        return (T) Proxy.newProxyInstance(loader,interfaces,handler);
    }
}
