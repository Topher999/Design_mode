package proxy.dynamicProxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * @Author:LiangTao
 * @Description:
 * @Date: Created in 18:06 2018/3/3.
 */
public class MyInvocationHandler implements InvocationHandler{
    private Object object;

    public MyInvocationHandler(Object object){
        this.object=object;
    }


    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        //可以进行切点的验证
        System.out.println("执行方法前");
        method.invoke(object,args);
        System.out.println("执行方法后");
        return null;
    }
}
