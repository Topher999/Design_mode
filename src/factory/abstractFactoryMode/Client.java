package factory.abstractFactoryMode;

/**
 * Created by liangtao on 2018-03-02.
 * 抽象工厂模式的使用场景;
 * 一个对象族（或是一组没有任何关系的对象）都有相同的约束，则可以使用抽象工厂模式
 * 例：一个文本搬机器和一个图片处理器都是软件实体
 *      两个软件在Linux 和Windows 系统下功能界面基本一样，但是代码实现不一样，他们两个软件具有共同的约束
 *       、操作系统类型，于是就可以使用抽象工厂模式
 *
 * 抽象工厂模式的优点和缺点
 * 优点：
 * 封装性，只关心接口，抽象，不关心对象是如何创建出来的， 只要知道工厂类是谁就能穿件处需要的对象
 * 扩展工厂很方便，扩展产品等级很方便
 * 例：像加一个双性人的 只需增加三个颜色的人种产品类，再创建一个工厂类即可，完全符合开闭原则
 * 缺点：
 * 扩展一个产品族麻烦，也就是在再加一个约束很麻烦
 * 例：要增加一个蓝种人，需要修改AbstractHumanFactory，FemaleHumanFactory，MaleHumanFactory三个工厂类
 *     还得增加AbstractBlueHuman,FemaleBlueHuman,MaleBlueHuamn三个产品类
 *     修改原有的代码，而且修改了接口，抽象类，接口和抽象类是一个契约，改变契约，所有和契约有关的代码 都得改
 *     这段代码叫什么？叫“有毒代码”
 *
 * ***********************************************
 *  抽象工厂模式简单说就是横向扩展方便，纵向扩展困难
 ** ***********************************************
 *
 *
 */
public class Client {
    public static void main(String[] args) {
        AbstractHumanFactory maleHumanFactory=new MaleHumanFactory();
        Human human=maleHumanFactory.createWhiteHuman();
        human.getColor();
        human.talk();
        human.getSex();
        AbstractHumanFactory femaleHumanFactory=new FemaleHumanFactory();
        human=femaleHumanFactory.createBlackHuman();
        human.getColor();
        human.talk();
        human.getSex();

    }

    /**
     * 考虑使用配置文件+反射+简单工厂的方式实现切换
     * 例：数据库的配置，在配置文件中指明数据库类型，程序中根据配置文件中的配置
     *       运用反射（可以代替繁重的if,switch语句）生成访问该种数据库所需的类，然后进行数据操作
     *      这样操作可以简单方便的修改配置文件做到访问不同数据库需要的不同程序
     *
     *
     */
}
