package dutyChain;

/**
 * @Author:LiangTao
 * @Description:
 * @Date: Created in 15:23 2018/6/6.
 */
public class ConcreteHandlerB extends  Handler{
    @Override
    protected Level getLevel() {
        return new Level(1);
    }

    @Override
    protected Response echo(Request request) {
        return new Response("ConcreteHandlerB  处理了:"+request.getMessage());
    }
}
