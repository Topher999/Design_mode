package facade;

/**
 * @Author:LiangTao
 * @Description:
 * @Date: Created in 23:09 2018/6/1.
 */
public class Facade2 {
    //使用已经定义好的Facade 尽量保持相同的代码只写一遍，避免以后到处修改相似代码的悲剧
    Facade facade=new Facade();


    public void methodB(){
        this.facade.methodB();
    }
}
