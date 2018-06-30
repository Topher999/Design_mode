package combination.transparent;

import java.util.List;

/**
 * @Author:LiangTao
 * @Description:
 * @Date: Created in 10:35 2018/6/18.
 */
public class Leaf extends Component {
    public Leaf(String name) {
        super(name);
    }

    @Override
    public void add(Component component) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void remove(Component component) {
        throw new UnsupportedOperationException();
    }

    @Override
    public List<Component> getChild() {
        throw new UnsupportedOperationException();
    }
}
