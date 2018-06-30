package combination.transparent;

import java.util.List;

/**
 * @Author:LiangTao
 * @Description:组合模式
 *
 * 透明的组合模式
 * 符合依赖倒置原则，便于扩展
 *
 * @Date: Created in 10:27 2018/6/18.
 */
public class Client {
    public static void main(String[] args) {

        Component root  = new Branch("root");
        Component branch1=new Branch("branch1");
        Component branch2=new Branch("branch2");
        Component branch3=new Branch("branch3");
        Component rootLeaf=new Leaf("rootLeaf");
        Component branch1Leaf1=new Leaf("branch1Leaf1");
        Component branch1Leaf2=new Leaf("branch1Leaf2");
        Component branch3Leaf1=new Leaf("branch3Leaf1");

        root.add(branch1);
        root.add(branch2);
        root.add(branch3);
        root.add(rootLeaf);
        branch1.add(branch1Leaf1);
        branch1.add(branch1Leaf2);
        branch3.add(branch3Leaf1);



        displayTransparent(root);
        System.out.println("---------------------------------------------------");
        displayTransparent(rootLeaf);


    }

    //        透明的组合模式  遍历
    //无需关心传入的是叶子节点还树枝节点
    //对高层模块完全是透明的
    public static void displayTransparent(Component root){
        if(root instanceof Leaf){
            System.out.println(root.getInfo());
            return;
        }
        List<Component> components=root.getChild();
        System.out.println(root.getInfo());
        for(Component component:components){
            if(component instanceof Leaf){
                System.out.println(component.getInfo());
            }else{
                displayTransparent(component);
            }
        }

    }

}
