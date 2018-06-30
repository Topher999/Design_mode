package factory.factoryMethodMode;

/**
 * Created by liangtao on 2018-03-02.
 */
public class Client {
    public static void main(String[] args) {
        AbstractHumanFactory humanFactory=new HumanFactory();
        Human human=humanFactory.createHuman(YellowHuman.class);
        human.getColor();
        human.talk();
        human=humanFactory.createHuman(WhiteHuman.class);
        human.getColor();
        human.talk();
        human=humanFactory.createHuman(BlackHuman.class);
        human.getColor();
        human.talk();
    }
}
