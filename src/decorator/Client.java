package decorator;

/**
 * @Author:LiangTao
 * @Description:装饰器模式
 *
 * 修饰方法操作具体类的属性--多层的话访问到最里面内层也可以
 *
 * 优点：
 * 装饰类和被装饰类可以独立发展，不会相互耦合
 * 装饰模式是继承关系的一个替代方案，（例子宏不管装饰多少层，返回的永远是Component,是is-a的关系 ），可以动态的扩展一个实现类的功能
 *
 * 扩展性非常好
 * 可以代替继承，解决类膨胀的问题
 * 继承是静态的类增加功能，而装饰模式是动态的增加功能
 * （而且继承是侵入性的，加入有三个类Father,Son,GrandSon三个类，要在Son上增加一些功能，就只能使用装饰模式了，改Son的话，那GrandSon会有一些不可预估的问题）
 *
 * 缺点：
 * 多层装饰模式比较复杂，就像剥洋葱似的一层一层的剥开，剥到了最后才发现最里层装饰器有问题
 *
 *
 * @Date: Created in 23:53 2018/6/5.
 */
public class Client {
    public static void main(String[] args) {
        Component component=new ConcreteComponent();
        component=new ConcreteDecoratorA(component);
        component=new ConcreteDecoratorB(component);
        component.operate();
    }
}
