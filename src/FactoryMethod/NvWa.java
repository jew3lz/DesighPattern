package FactoryMethod;

/**
 * Created by JEWELZ on 6/7/15.
 */
public class NvWa {
    public static void main(String[] args) {
        //第一次遭人,少造点
        System.out.println("-------------造出第一批人:白人-------------");
        Human whiteHuman = HumanFactory.createHuman(WhiteHuman.class);
        whiteHuman.laugh();
        whiteHuman.cry();
        whiteHuman.talk();

        System.out.println("\n-------------造出第二批人:黑人-------------");
        Human blackHuman = HumanFactory.createHuman(BlackHuman.class);
        blackHuman.laugh();
        blackHuman.cry();
        blackHuman.talk();

        System.out.println("\n-------------造出第三批人:黄人-------------");
        Human yellowHuman = HumanFactory.createHuman(YellowHuman.class);
        yellowHuman.laugh();
        yellowHuman.cry();
        yellowHuman.talk();

        //女娲随便造

        for (int i = 0; i < 100000000; i++) {
            System.out.println("\n-------------随机产生人类了-------------");
            Human human = HumanFactory.createHuman();
            human.cry();
            human.laugh();
            human.talk();
        }
    }
}
