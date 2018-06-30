package proxy.simpleProxy;

/**
 * @Author:LiangTao
 * @Description:代理模式也叫委托模式
 *
 *
 * 优点：
 * 职责清晰：真实的角色就是实现实际的业务逻辑，不用关心其他非本职责的事务，通过后期打代理完成，附带的结果就是编程简洁清晰
 * 高扩展性：具体主题角色随时会变，只要它实现了接口，甭管它如何变化，都逃脱不了如来佛的手掌（接口），那我们的代理完全就可以在不做任何修改的情况下使用
 * 智能化：动态代理，面向切面
 *
 *
 * @Date: Created in 16:16 2018/3/3.
 */
public class Client {
    public static void main(String[] args) {
        ISubject realSubject=new RealSubject();
        ISubject subjectProxy=new SubjectProxy(realSubject);
        subjectProxy.request();
    }
}
