package AbstractFactory.Implementor;

import AbstractFactory.Abstraction.AbstractWhiteHuman;

/**
 * Created by JEWELZ on 6/7/15.
 */
public class WhiteMaleHuman extends AbstractWhiteHuman {

    @Override
    public void sex() {
        System.out.println("该白种人的性别为男...");
    }
}
