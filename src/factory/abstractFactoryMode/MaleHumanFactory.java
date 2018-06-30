package factory.abstractFactoryMode;

/**
 * Created by bcc on 2018-03-02.
 */
public class MaleHumanFactory extends AbstractHumanFactory {

    @Override
    public Human createYellowHuman() {
        return new MaleYellowHuman();
    }

    @Override
    public Human createWhiteHuman() {
        return new MaleWhiteHuman();
    }

    @Override
    public Human createBlackHuman() {
        return new MaleBlackHuman();
    }
}
