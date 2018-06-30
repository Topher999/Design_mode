package strategy;

/**
 * @Author:LiangTao
 * @Description:
 * @Date: Created in 15:21 2018/6/13.
 */
public class SubStrategy extends IStrategy {

    @Override
    public void exec(int a ,int b) {
        System.out.println("Sub------exec():"+(a-b));
    }
}
