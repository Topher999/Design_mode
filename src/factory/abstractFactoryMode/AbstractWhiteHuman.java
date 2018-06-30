package factory.abstractFactoryMode;

/**
 * Created by bcc on 2018-03-02.
 */
public abstract class AbstractWhiteHuman implements Human {
     public void getColor(){
         System.out.println("白色");
     };
    public void talk(){
        System.out.println("白种人说话");
    };
}
