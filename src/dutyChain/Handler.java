package dutyChain;

import jdk.nashorn.internal.ir.RuntimeNode;

/**
 * @Author:LiangTao
 * @Description:
 *
 * 父类实现了请求的传递，子类实现了请求的处理
 * @Date: Created in 11:41 2018/6/6.
 */
public abstract class Handler {

    private Handler nextHandler;



    //主要构成链式的就是这个方法
    public Response handle(Request request) {
        Response response = null;
        if (this.getLevel().equals(request.getLevel())) {
            response = this.echo(request);
        } else if (this.nextHandler != null) {
            response=this.nextHandler.handle(request);
        } else {
            System.out.println("暂时处理不了这种请求");
        }
        return response;
    }


    public void setNext(Handler handler) {
        this.nextHandler = handler;
    }


    //声明一个方法感觉很好哎，也不用多声明一个成员变量，也可以在这里面写逻辑
    protected abstract Level getLevel();

    protected abstract Response echo(Request request);
}
