package proxy.generalProxy;

/**
 * @Author:LiangTao
 * @Description:
 * @Date: Created in 16:51 2018/3/3.
 */
public class GamePlayer implements IGamePlayer {

    public GamePlayer(IGamePlayer _gamePlayer) throws Exception {
        //此处也可以对参数，进行是否是代理验证，如是否后缀是proxy等
        if(_gamePlayer==null) {
            throw new Exception("禁止创建真实对象，只能创建代理");
        }
    }

    @Override
    public void login() {
        System.out.println("张三   登陆成功");
    }

    @Override
    public void killBoss() {
        System.out.println("张三   杀怪");
    }

    @Override
    public void upgrade() {
        System.out.println("张三   升级了");
    }
}
