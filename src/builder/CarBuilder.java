package builder;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author:LiangTao
 * @Description:有多少个产品就有多少个具体的建造者
 * @Date: Created in 13:51 2018/3/3.
 */
public abstract class CarBuilder {


    //处理关于不同创建过程的逻辑
    //这个方法放这很重要，只要要扩展具体的处理逻辑都可以重写此方法
    public abstract void buildProcess(List<String> sequenceList);

    public abstract CarModel getCarModel();
}
