package command;

/**
 * @Author:LiangTao
 * @Description:调用者对象
 * @Date: Created in 10:59 2018/6/6.
 */
public class Invoker {

    public void invoke(Command command) {
        command.execute();
    }
}
