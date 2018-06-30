package proxy.generalProxy;

/**
 * @Author:LiangTao
 * @Description:
 * @Date: Created in 16:53 2018/3/3.
 */
public class GamePlayerProxy implements IGamePlayer{


    private IGamePlayer gamePlayer;
    public GamePlayerProxy(){
        try {
            this.gamePlayer=new GamePlayer(this);
        } catch (Exception e) {
            e.printStackTrace();
        }
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
}
