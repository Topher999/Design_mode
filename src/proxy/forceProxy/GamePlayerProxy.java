package proxy.forceProxy;

/**
 * @Author:LiangTao
 * @Description:
 * @Date: Created in 16:53 2018/3/3.
 */
public class GamePlayerProxy implements IGamePlayer {


    private IGamePlayer gamePlayer;
    public GamePlayerProxy(IGamePlayer gamePlayer){
        this.gamePlayer=gamePlayer;
    }

    @Override
    public void login() {
        this.gamePlayer.login();
    }

    @Override
    public void killBoss() {
        this.gamePlayer.killBoss();
    }

    @Override
    public void upgrade() {
        this.gamePlayer.upgrade();
    }

    @Override
    public IGamePlayer getProxy() {
        //代理的代理暂时没有 ，返回自己
        return this;
    }
}
