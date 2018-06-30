package strategy;

/**
 * @Author:LiangTao
 * @Description:
 * @Date: Created in 15:21 2018/6/13.
 */
public class AddStrategy extends IStrategy {

    @Override
    public void exec(int a,int b) {
        System.out.println("Add------exec():"+(a+b));
    }
}
