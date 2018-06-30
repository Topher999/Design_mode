package builder;

import template.CarRun;
import template.HummerCarRun;

/**
 * Created by liangtao on 2018-03-02.
 */

/**
 * @Author: LiangTao
 * @Date: 14:51 2018/3/3
 * @Description:建造者模式
 *  使用场景：
 *  产品类非常复杂，不同的逻辑，产生不同的结果
 *  优点:
 *  建造者独立，对系统扩展有利（BMWBuilder,BenzBuilder相互独立）
 *  便于控制细节风险，由于具体的建造者是独立的，因此可以对建造过程逐步细化，而不对别的模块产生任何影响
 *
 *  建造者模式的主要功能是基本方法的调用的安排，也就是说基本方法已经实现了，也就是零件的装配，不同的装配工艺，产生不同的对象
 *  工厂方法模式的重点是创建，创建零件是他的主要职责，组装顺序不是它关心的
 *
 *
 *
 *
 *
 * @Params: * @param null
 * @Return:
 * @Exception:
 */

public class Client {
    public static void main(String[] args) {
        Director director=new Director();
        director.createABenzModel().carRun();
        System.out.println("***************************");
        director.createABMWModel().carRun();
        System.out.println("***************************");
        director.createBBenzModel().carRun();
    }
}
