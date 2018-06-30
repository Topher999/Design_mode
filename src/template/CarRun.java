package template;

/**
 * Created by liangtao  on 2018-03-02.
 */
public abstract class CarRun {
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
        start();
        engineBoom();
        alarm();
        stop();
    }
}
