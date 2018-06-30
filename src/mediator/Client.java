package mediator;

/**
 * @Author:LiangTao
 * @Description:中介者会比较臃肿
 * 中介者模式  （封装模式）
 *
 * 适用于多个对象之间存在紧密耦合的情况（紧密耦合的标准：在类图中出现了蜘蛛网状结构），这种情况下考虑使用中介者模式，将蜘蛛网梳理为星型结构，使原本混乱的关系变得清晰简单
 *
 * 对于依赖行为尚不确定或有发生改变的可能的，可以采用中介者模式，减低变更引起的风险扩散
 *
 * 对于产品应用中介者模式，可以提升产品性能和扩展性，但是对于项目开发未必，项目开发以交付投产为主，产品则是以稳定，高效，扩展为宗旨
 *
 * @Date: Created in 21:57 2018/6/1.
 */
public class Client {
    public static void main(String[] args) {
        Mediator mediator=new ConcreteMediator();
        ConcreteColleagueA concreteColleagueA= new ConcreteColleagueA(mediator);
        mediator.setConcreteColleagueA(concreteColleagueA);

        ConcreteColleagueB concreteColleagueB =new ConcreteColleagueB(mediator);
        mediator.setConcreteColleagueB(concreteColleagueB);

        concreteColleagueA.selfMethodA();
        concreteColleagueA.depMethodA();

    }
}
