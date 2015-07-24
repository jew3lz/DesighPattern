package AbstractFactory.Implementor;

import AbstractFactory.Abstraction.AbstractYellowHuman;

/**
 * Created by JEWELZ on 6/7/15.
 */
public class YellowFemaleHuman extends AbstractYellowHuman {

    @Override
    public void sex() {
        System.out.println("该黄种人的性别为女...");
    }
}
