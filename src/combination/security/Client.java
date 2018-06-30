package combination.security;


import java.util.List;

/**
 * @Author:LiangTao
 * @Description:组合模式
 *
 *
 * 安全的组合模式
 *
 * 破坏了依赖倒置原则，都依赖于实现类
 *
 * @Date: Created in 10:27 2018/6/18.
 */
public class Client {
    public static void main(String[] args) {

        Branch root  = new Branch("root");
        Branch branch1=new Branch("branch1");
        Branch branch2=new Branch("branch2");
        Branch branch3=new Branch("branch3");
        Leaf rootLeaf=new Leaf("rootLeaf");
        Leaf branch1Leaf1=new Leaf("branch1Leaf1");
        Leaf branch1Leaf2=new Leaf("branch1Leaf2");
        Leaf branch3Leaf1=new Leaf("branch3Leaf1");

        root.add(branch1);
        root.add(branch2);
        root.add(branch3);
        root.add(rootLeaf);
        branch1.add(branch1Leaf1);
        branch1.add(branch1Leaf2);
        branch3.add(branch3Leaf1);



        displaySecurity(root);
//        displaySecurity(rootLeaf);   //报错，方法参数为Branch类型


    }

//    安全的组合模式遍历
    public static void displaySecurity(Branch root){
        List<Component> components=root.getChild();
        System.out.println(root.getInfo());
        for(Component component:components){
            if(component instanceof Leaf){
                System.out.println(component.getInfo());
            }else{
                displaySecurity((Branch) component);
            }
        }
    }
}
