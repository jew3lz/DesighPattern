package AbstractFactory;

/**
 * Created by JEWELZ on 6/7/15.
 */
public class NvWa {
    public static void main(String[] args) {
        //男性生产线
        HumanFactory maleHumanFactory = new MaleFactory();

        //女性生产线
        HumanFactory femaleHumanFactory = new FemaleFactory();

        //生产线建立完毕,开始生产人了
        Human maleYellowHuman = maleHumanFactory.createYellowHuman();

        Human femaleYellowHuman = femaleHumanFactory.createYellowHuman();

        maleYellowHuman.sex();
        femaleYellowHuman.sex();
    }
}
