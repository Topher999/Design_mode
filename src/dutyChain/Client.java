package dutyChain;

/**
 * @Author:LiangTao
 * @Description:责任链模式
 *
 * 链链链
 *
 *
 *  优点：
 *  将请求和处理分开
 *  请求者不用知道是谁处理了，处理者也不用知道请求的全貌
 *
 *  缺点：
 *  性能问题，当链长过长时，每个请求都从链头到链尾，性能是个问题
 *  采用了类似递归的方式，调试起来比较麻烦
 *
 *  控制链中的节点数，避免出现超长链的问题，（一般的做法是在Handler里设置一个最大节点数量，在setNext()方法中判断是否超过阈值，超过则不允许该链建立，以免无意识的破坏系统性能）
 *
 * @Date: Created in 23:54 2018/6/5.
 */
public class Client {

    public static void main(String[] args) {
        Request request1=new Request(new Level(1),"一等请求");
        Request request2=new Request(new Level(2),"二等请求");
        Request request3=new Request(new Level(3),"三等请求");

        Handler handlerA=new ConcreteHandlerA();
        Handler handlerB=new ConcreteHandlerB();
        handlerA.setNext(handlerB);

        System.out.println(handlerA.handle(request1));
        System.out.println(handlerA.handle(request2));
        handlerA.handle(request3);
    }
}
