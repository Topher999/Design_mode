package proxy.generalProxy;

/**
 * @Author:LiangTao
 * @Description:代理模式------普通代理（要求客户端只能访问代理角色，而不能访问真实角色）
 *
 * 调用者只知代理不知道真实的角色是谁，
 * 屏蔽了真实角色的变更对高层模块的影响，真实的角色随便怎么改，对高层的模块都没有影响，只要你实现了接口对应的方法，该模式非常适合扩展性要求较高的场合
 *
 *
 * 在实际的项目中一般通过约定来禁止new一个真实的角色，这是一个非常好的方案
 * 普通代理模式的约束问题尽量通过团队内的编程规范来约束，因为每一个主题类是可被重用的和可维护的，使用技术约束的方式对系统维护是一种非常不利的因素
 *
 *
 * @Date: Created in 16:16 2018/3/3.
 */
public class Client {
    public static void main(String[] args) {
        //强制只能使用代理
        GamePlayerProxy gamePlayerProxy=new GamePlayerProxy();
        gamePlayerProxy.login();
        gamePlayerProxy.killBoss();
        gamePlayerProxy.upgrade();

    }
}
