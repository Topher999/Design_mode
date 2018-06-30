package combination.transparent;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author:LiangTao
 * @Description:
 * @Date: Created in 10:37 2018/6/18.
 */
public class Branch extends Component {
    private List<Component> subComponent= new ArrayList<>();

    public Branch(String name) {
        super(name);
    }

    @Override
    public void add(Component component) {
        this.subComponent.add(component);
    }

    @Override
    public void remove(Component component) {
        this.subComponent.remove(component);
    }

    @Override
    public List<Component> getChild() {
        return this.subComponent;
    }
}
