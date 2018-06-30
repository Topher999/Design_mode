package visitor;

import java.util.List;
import java.util.Random;

/**
 * @Author:LiangTao
 * @Description:访问者模式
 *
 * 优点：
 * 扩展Visitor方便，比如说想要一个新的报表，直接实现一个访问类即可
 *
 *
 *
 * 缺点：
 * 具体元素对访问者公布细节，违反了迪米特法则（最少知识法则）
 * 具体元素的增加，修改，删除比较困难，
 * 违背了依赖倒置原则，访问者直接依赖于实现类，感觉具体元素扩展麻烦就是这个原因
 *
 * 应用场景：
 * 业务规则要求遍历多个不同的对象
 * 迭代器模式只能访问同类或同接口的数据（当然你instanceof判断也可以）
 * 访问者模式是对迭代器模式的补充，可以遍历不同的对象，然后执行不同的操作。
 * //todo  可以充当拦截器角色???
 *
 *
 * @Date: Created in 16:07 2018/6/19.
 */
public class Client {

    public static void main(String[] args) {

        for(int i=1;i<5;i++){
            AbstractElement element = getElement();
            element.accept(new VisitorA());
        }

    }



    public static AbstractElement getElement(){
        Random random=new Random();
        int num=random.nextInt(100);
        if(num<50){
            return new ElementA();
        }else {
            return new ElementB();
        }
    }
}
