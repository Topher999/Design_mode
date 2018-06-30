package factory.abstractFactoryMode;

/**
 * Created by bcc on 2018-03-02.
 */
public  abstract class AbstractHumanFactory {
    public abstract  Human  createYellowHuman();
    public abstract Human createWhiteHuman();
    public abstract Human createBlackHuman();
}
