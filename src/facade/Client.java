package facade;

/**
 * @Author:LiangTao
 * @Description:
 *
 * 门面模式：
 *
 * “金玉其外。败絮其中”
 *
 * 使用场景：为一个复杂的模块或子系统提供一个供外界访问的接口，子系统相对独立，预防低水平人员带来的风险扩散
 *
 * 缺点：不符合开闭原则，修改只能修改门面角色里面的代码
 *
 * 一个子系统可以有好几个门面
 * 1.门面过大   例：数据库操作的门面可以拆成查询门面，删除门面，更新门面等
 * 2.提供不同的访问路径  例： 有一个新的模块只能访问methodB方法可以新建一个门面 如代码Facade2.java供此模块访问
 *
 * 门面不参与子系统内的业务逻辑
 * 例：在Facade类中添加方法 public void methodC(){
 *                              this.classA.doSomethingA();
 *                              this.classB.doSomethingB();
 *                          }
 *      虽然只是简单的调用了连个方法，但是已经让门面对象参加了业务逻辑，门面对象只是提供一个访问子系统的一个路径而已，
 *      这样会产生一个倒依赖的问题：子系统依赖必须依赖门面才能被访问，这是设计上一个严重错误，不仅违反了单一职责原则，同事破坏了系统的封装性
 *      处理方法：建立一个封装类（他的生产环境是在子系统中），将业务逻辑封装在此类中，然后门面类调用此类
 *
 *
 * @Date: Created in 23:13 2018/6/1.
 */
public class Client {
    public static void main(String[] args) {
        Facade facade=new Facade();
        facade.methodA();
        facade.methodB();
    }
}
