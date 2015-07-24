package AbstractFactory.Implementor;

import AbstractFactory.Abstraction.AbstractBlackHuman;

/**
 * Created by JEWELZ on 6/7/15.
 */
public class BlackFemaleHuman extends AbstractBlackHuman {

    @Override
    public void sex() {
        System.out.println("该黑种人的性别为女...");
    }
}
