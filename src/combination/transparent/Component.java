package combination.transparent;

import java.util.List;

/**
 * @Author:LiangTao
 * @Description:
 * @Date: Created in 10:28 2018/6/18.
 */
public abstract class Component {

    private String name;

    public Component(String name) {
        this.name = name;
    }

    public abstract void  add(Component component);
    public abstract void remove(Component component);
    public abstract List<Component> getChild();


    public String getInfo(){
        return "name:----"+name;
    }
}
