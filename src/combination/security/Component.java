package combination.security;

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


    public String getInfo(){
        return "name:----"+name;
    }
}
