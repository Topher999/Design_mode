package template;

/**
 * Created by liangtao  on 2018-03-02.
 */
public  class HummerCarRun extends CarRun {
    //启动
    protected  void start(){
        System.out.println("悍马启动。。。");
    };
    //引擎响
    protected  void engineBoom(){
        System.out.println("悍马发动引擎。。。。。。。");
    };
    //在路上按喇叭
    protected  void alarm(){
        System.out.println("悍马发动引擎。。。。。。。");
    };
    //停车
    protected  void stop(){
        System.out.println("悍马停车。。。。。。。");
    };


}
