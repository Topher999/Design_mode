package decorator;

/**
 * @Author:LiangTao
 * @Description:抽象装饰角色
 *
 *
 *
 * @Date: Created in 16:15 2018/6/6.
 */
public abstract class Decorator extends Component{

    protected Component component=null;


    //约束子类必须赋值成员变量
    public Decorator(Component _component) {
        this.component = _component;
    }



//通过这个方法将内层包裹的Component一层一层的剥开
    @Override
    public void operate() {
        this.component.operate();
    }

}
