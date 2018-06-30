package dutyChain;

/**
 * @Author:LiangTao
 * @Description:
 * @Date: Created in 15:23 2018/6/6.
 */
public class ConcreteHandlerA extends  Handler{
    @Override
    protected Level getLevel() {
        return new Level(2);
    }

    @Override
    protected Response echo(Request request) {
        return new Response("ConcreteHandlerA  处理了:"+request.getMessage());
    }
}
