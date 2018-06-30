package proxy.forceProxy;

/**
 * @Author:LiangTao
 * @Description:
 * @Date: Created in 16:51 2018/3/3.
 */
public class GamePlayer implements IGamePlayer {

//    private boolean isProxy=false;
    private IGamePlayer proxy=null;
    public GamePlayer(){

    }

    @Override
    public void login() {
        if(this.isProxy()) {
            System.out.println("张三   登陆成功");
        }else{
            System.out.println("请使用指定的代理访问");
        }
    }

    @Override
    public void killBoss() {
        if(this.isProxy()) {
            System.out.println("张三   杀怪");
        }else{
            System.out.println("请使用指定的代理访问");
        }
    }

    @Override
    public void upgrade() {
        if(this.isProxy()) {
            System.out.println("张三   升级了");
        }else{
            System.out.println("请使用指定的代理访问");
        }
    }

    @Override
    public IGamePlayer getProxy() {
        this.proxy=new GamePlayerProxy(this);
        return this.proxy;
    }

    //此方法有问题，只要调用过getProxy() ，真实角色也就可以访问了？？？？？？？？？？？？？
    //可能需要自己实现这块吧？？？？/**/
    public boolean isProxy(){
        if(this.proxy==null){
            return  false;
        }else{
            return  true;
        }
    }


}
