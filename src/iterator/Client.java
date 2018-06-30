package iterator;

/**
 * @Author:LiangTao
 * @Description:迭代器模式
 *
 * 基本api中基本都已实现
 *
 * 迭代器类似数据库中的游标，可以在一个容器内翻滚，遍历所有他需要的元素
 *
 * 提供方法访问容器内的各个元素，又不暴露该对象的细节
 *
 * @Date: Created in 17:10 2018/6/13.
 */
public class Client {
    public static void main(String[] args) {
        IAggregate<String> iAggregate=new Aggregate<>();
        IIterator iterator = iAggregate.iterator();
        iAggregate.add("a");
        iAggregate.add("B");
        iAggregate.add("c");
        iAggregate.add("d");
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }


}
