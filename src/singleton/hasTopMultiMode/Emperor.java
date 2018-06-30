package singleton.hasTopMultiMode;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * Created by bcc on 2018-03-02.
 * 可以决定内存中有多少实例，方便系统扩展
 * 修正单例可能存在的性能问题，提高系统的响应速度
 *
 * 有点像池化技术
 *
 */
public class Emperor {
    //定义最多能产生的实例数量
    private static int maxNumOfEmperor=2;
    private static List<Emperor> emperorList=new ArrayList<>();

    //记录当前用的是哪个实例（可定位到名字）
    private static int countNumOfEmperor=0;

    private static List<String> nameList=new ArrayList<>();

    static{
        for(int i=0;i<maxNumOfEmperor;i++) {
            emperorList.add(new Emperor("唐太宗"));
            emperorList.add(new Emperor("唐献宗"));
        }
    }

    private Emperor(String name){
        nameList.add(name);
    }

    public void say(){
        System.out.println(nameList.get(countNumOfEmperor));
    }

    public static Emperor getInstance(){
        Random random=new Random();
        countNumOfEmperor=random.nextInt(maxNumOfEmperor);
        return emperorList.get(countNumOfEmperor);
    }

}
