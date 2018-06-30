package factory.factoryMethodMode;

/**
 * Created by bcc on 2018-03-02.
 */
public  abstract class AbstractHumanFactory {
    public abstract <T extends Human> T createHuman(Class<T> tClass);
}
