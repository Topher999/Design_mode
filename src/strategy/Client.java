package strategy;

/**
 * @Author:LiangTao
 * @Description:策略模式   没感觉到有什么价值，顶多是吧具体策略从逻辑中拆分出来了？
 * @Date: Created in 15:35 2018/6/13.
 */
public class Client {
    public static void main(String[] args) {
        int a = 1;
        int b = 2;
        StrategyEnum.Add.exec(a, b);
        StrategyEnum.Sub.exec(a, b);

        Context context=new Context(new AddStrategy());
        context.exec(a,b);
        context=new Context(new SubStrategy());
        context.exec(a,b);
    }
}
