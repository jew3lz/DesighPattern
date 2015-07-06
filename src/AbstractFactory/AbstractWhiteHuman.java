package AbstractFactory;

/**
 * Created by JEWELZ on 6/7/15.
 */
public abstract class AbstractWhiteHuman implements Human {
    @Override
    public void laugh() {
        System.out.println("白人会笑");
    }

    @Override
    public void cry() {
        System.out.println("白人会哭");
    }

    @Override
    public void talk() {
        System.out.println("白人会说话");
    }
}
