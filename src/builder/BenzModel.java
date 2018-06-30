package builder;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author:LiangTao
 * @Description:
 * @Date: Created in 12:47 2018/3/3.
 */
public  class BenzModel extends CarModel{
    private List<String> sequence=new ArrayList<>();
    //基本方法，子类需要扩展的方法尽量设计为protected类型，
    //启动
    @Override
    protected  void start(){
        System.out.println("奔驰启动");
    };
    //引擎响
    @Override
    protected  void engineBoom()
    {
        System.out.println("奔驰发动引擎");
    };
    //在路上按喇叭
    @Override
    protected void alarm(){
        System.out.println("奔驰按喇叭");
    };
    //停车
    @Override
    protected  void stop(){
        System.out.println("奔驰停止");
    };





}
