package decorator;

/**
 * @Author:LiangTao
 * @Description:
 * @Date: Created in 16:12 2018/6/6.
 */
public class ConcreteComponent extends Component{

    @Override
    public void operate() {
        System.out.println("ConcreteComponent---operate()");
    }
}
