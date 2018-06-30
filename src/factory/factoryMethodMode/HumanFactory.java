package factory.factoryMethodMode;

/**
 * Created by bcc on 2018-03-02.
 */
public class HumanFactory extends AbstractHumanFactory {
    @Override
    public <T extends Human> T createHuman(Class<T> tClass) {
        T human= null;
        try {
            human = tClass.newInstance();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }
        return human;
    }
}
