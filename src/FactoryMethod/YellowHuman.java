package FactoryMethod;

/**
 * Created by JEWELZ on 6/7/15.
 */
public class YellowHuman implements Human {
    @Override
    public void laugh() {
        System.out.println("黄人会笑");
    }

    @Override
    public void cry() {
        System.out.println("黄人会哭");
    }

    @Override
    public void talk() {
        System.out.println("黄人会说话");
    }
}
