package proxy.forceProxy;

/**
 * @Author:LiangTao
 * @Description:代理模式------强制代理
 *
 * 强制代理比较另类，一般都是通过代理找真实的角色，但是强制代理却要“强制”，
 * 你必须通过真实角色查找到代理角色，否则你不能访问。
 * 甭管你是通过代理累还是通过直接new了一个主题角色类，都不能访问，只有通过真实角色指定的代理类才可以访问，友真实角色管理代理角色
 * 高层模块new了一个真实角色的对象，返回的确实代理角色
 *
 *
 *
 * @Date: Created in 16:16 2018/3/3.
 */
public class Client {
    public static void main(String[] args) {
        IGamePlayer gamePlayer=new GamePlayer();
        IGamePlayer proxy = gamePlayer.getProxy();
        proxy.login();
        proxy.killBoss();
        proxy.upgrade();

        System.out.println("********************");
        gamePlayer.login();



    }
}
