package builder;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author:LiangTao
 * @Description:导演类起到了封装的作用，避免高层模块深入到建造者内部的实现类
 *              当建造者模式比较庞大时，导演类可以有多个
 * @Date: Created in 13:58 2018/3/3.
 */
public class Director {
    private List<String> sequenceList=new ArrayList<>();
    private CarBuilder benzBuilder=new BenzBuilder();
    private CarBuilder bmwBuilder=new BMWBuilder();

    public BenzModel createABenzModel(){
        this.sequenceList.clear();
        this.sequenceList.add("stop");
        this.sequenceList.add("start");
        this.benzBuilder.buildProcess(this.sequenceList);
        return (BenzModel)this.benzBuilder.getCarModel() ;
    }

    public BenzModel createBBenzModel(){
        this.sequenceList.clear();
        this.sequenceList.add("alarm");
        this.sequenceList.add("stop");
        this.sequenceList.add("start");
        this.benzBuilder.buildProcess(this.sequenceList);
        return (BenzModel)this.benzBuilder.getCarModel() ;
    }


    public BMWModel createABMWModel(){
        this.sequenceList.clear();
        this.sequenceList.add("engineBoom");
        this.sequenceList.add("stop");
        this.sequenceList.add("start");
        this.bmwBuilder.buildProcess(this.sequenceList);
        return (BMWModel)this.bmwBuilder.getCarModel() ;
    }
}
