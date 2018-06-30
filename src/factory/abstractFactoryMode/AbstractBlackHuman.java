package factory.abstractFactoryMode;

/**
 * Created by bcc on 2018-03-02.
 */
public abstract class AbstractBlackHuman implements Human {
     public void getColor(){
         System.out.println("黑色");
     };
    public void talk(){
        System.out.println("黑种人说话");
    };
}
