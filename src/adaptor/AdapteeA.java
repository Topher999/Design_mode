package adaptor;

/**
 * @Author:LiangTao
 * @Description:
 * @Date: Created in 16:39 2018/6/13.
 */
public class AdapteeA extends AbstractAdaptee {
    @Override
    public void getUsername() {
        System.out.println("AdapteeA----------getUsername():username");
    }
}
