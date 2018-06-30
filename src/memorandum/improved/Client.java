package memorandum.improved;

/**
 * @Author:LiangTao
 * @Description:改进备忘录模式
 *
 * 封装的更好一点
 * 在系统管理中，备份数据是安全，绝对不能修改的，他要保证数据的洁净，避免数据污染而使备份失去意义，
 *
 * 此改进，将备份作为源数据的内部类，只有发起人才读
 * （这个安全也只是相对的，还可以通过反射来修改Memo的数据）
 *
 *
 *
 *
 * IMemo
 *
 * 双接口设计
 * 一个类可以实现多个接口，在系统设计的时候，如果考虑对象的安全问题，则可以提供两个接口
 *      一个是业务的正常接口，实现必要的业务逻辑，叫做宽接口，
 *      另外一个接口是空接口，什么方法也没有，提供给子系统外的模块访问，比如容器对象，这个叫做窄接口，由于窄接口没有任何操作数据的方法，因此相对比较安全。
 *
 * @Date: Created in 13:52 2018/6/19.
 */
public class Client {

    public static void main(String[] args) throws Exception {
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
