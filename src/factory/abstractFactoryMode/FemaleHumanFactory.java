package factory.abstractFactoryMode;

/**
 * Created by bcc on 2018-03-02.
 */
public class FemaleHumanFactory extends AbstractHumanFactory {

    @Override
    public Human createYellowHuman() {
        return new FemaleYellowHuman();
    }


    @Override
    public Human createWhiteHuman() {
        return new FemaleWhiteHuman();
    }

    @Override
    public Human createBlackHuman() {
        return new FemaleBlackHuman();
    }
}
