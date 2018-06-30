package memorandum.standard;

/**
 * @Author:LiangTao
 * @Description:备忘录模式
 *
 * 应用场景：
 * 需要保存和恢复数据的相关状态场景
 *
 * 提供回滚的操作
 *
 * 需要监控的副本场景
 * 例如要监控一个对象的属性，但是监控又不应该作为系统的主业务来调用，他只是边缘应用，
 * 即使监控不准，错误报警也问题不大，因此一般做法是备份一个主线程中的对象，然后又分析程序分析
 *
 * 数据库连接的事务管理
 *
 * 注意事项：
 *
 * 备份是在内存中存的（应该严格限制备份的创建，也就是设置Caretaker中map的上限，否则系统很容易产生内存溢出的情况）
 * 备忘录的生命周期:
 * 备忘录创建出来就要在‘最近’的代码中使用，要主动管理他的生命周期，建立就要使用，不使用就要立即删除其引用，等待垃圾回收器的回收处理
 * 备忘录的性能
 * //todo 这个东西怎么解决？？？
 * 不要再频繁建立备份的场景使用备忘录模式（比如一个for循环中），原因：1.控制不了备忘录建立的对象数量，2.大对象的建立消耗资源，系统性能需要考虑
 *
 *
 * 扩展：
 * 可以通过重写clone（），拷贝自己本身实现备忘录，但是由于深拷贝和浅拷贝的问题，复杂的场景下会导致逻辑混乱，所以Clone方式的备忘录一般用在简单，单一的场景中
 *
 * 对象有多状态的备忘录模式，可以写一个工具类将对象状态，存储在以字段名为key,字段值为value的map中，备忘录中存储map即可
 *
 *
 *
 *
 * @Date: Created in 13:52 2018/6/19.
 */
public class Client {

    public static void main(String[] args) {
        Caretaker caretaker=new Caretaker();
        Originator originator=new Originator();
        originator.setState("初始状态---");
        System.out.println(originator.toString());
        caretaker.addMemo("beginning",originator.createMemo());
        originator.setState("我变了，我傻了");
        System.out.println(originator.toString());
        caretaker.addMemo("fooling",originator.createMemo());
        System.out.println("复原------------------------------");
        originator.restoreMemo(caretaker.getMemo("beginning"));
        System.out.println(originator.toString());

    }
}
