package factory.abstractFactoryMode;

/**
 * Created by bcc on 2018-03-02.
 */
public abstract class AbstractYellowHuman implements Human {
     public void getColor(){
         System.out.println("黄色");
     };
    public void talk(){
        System.out.println("黄种人说话");
    };
}
