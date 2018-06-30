package strategy;

/**
 * @Author:LiangTao
 * @Description:
 * @Date: Created in 15:21 2018/6/13.
 */
public class Context {

    private IStrategy strategy;

    public Context(IStrategy _strategy){
        this.strategy=_strategy;
    }

    public void exec(int a ,int b){
        this.strategy.exec(a,b);
    }
}
