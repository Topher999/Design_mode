package proxy.forceProxy;

/**
 * @Author:LiangTao
 * @Description:
 * @Date: Created in 16:09 2018/3/3.
 */
public interface IGamePlayer {
    public  abstract void  login();
    public  abstract void  killBoss();
    public  abstract void  upgrade();
    public abstract IGamePlayer getProxy();
}
