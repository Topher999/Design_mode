package builder;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * @Author:LiangTao
 * @Description:
 * @Date: Created in 12:47 2018/3/3.
 */
public abstract class CarModel {
    private List<String> sequence=new ArrayList<>();
    //基本方法，子类需要扩展的方法尽量设计为protected类型，
    //启动
    protected abstract void start();
    //引擎响
    protected abstract void engineBoom();
    //在路上按喇叭
    protected abstract void alarm();
    //停车
    protected abstract void stop();


    //模板方法  定义了子类需要拓展方法的执行规则
    //为了防止恶意的操作，一般模板方法都加上final关键字，不允许覆写
    public final void carRun(){
        Iterator<String> iterator = sequence.iterator();
        while(iterator.hasNext()) {
            String action=iterator.next();
            if ("start".equals(action)) {
                this.start();
            }else
            if ("engineBoom".equals(action)) {
                this.engineBoom();
            }else
            if ("alarm".equals(action)) {
                this.alarm();
            }else
            if ("stop".equals(action)) {
                this.stop();
            }else{
                System.out.println("不存在此动作");
            }

        }
    }

    public void setSequenceList(List<String> sequence) {
        this.sequence = sequence;
    }
}
