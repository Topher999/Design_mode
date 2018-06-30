package singleton.hasTopMultiMode;



/**
 * Created by liangtao on 2018-03-02.
 */
public class Client {
    public static void main(String[] args) {

        for(int i=0;i<4;i++){
            Emperor emperor=Emperor.getInstance();
            emperor.say();
        }

    }
}
