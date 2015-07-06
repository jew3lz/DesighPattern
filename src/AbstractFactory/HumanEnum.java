package AbstractFactory;

/**
 * Created by JEWELZ on 6/7/15.
 */
public enum HumanEnum {
    //把世界上所有人的类型都定义出来
    YellowMaleHuman("AbstractFactory.YellowMaleHuman"),
    YellowFemaleHuman("AbstractFactory.YellowFemaleHuman"),
    WhiteFemaleHuman("AbstractFactory.WhiteFemaleHuman"),
    WhiteMaleHuman("AbstractFactory.WhiteMaleHuman"),
    BlackFemaleHuman("AbstractFactory.BlackFemaleHuman"),
    BlackMaleHuman("AbstractFactory.BlackMaleHuman");

    private String value = "";
    //定义构造函数,目的是Data(value)类型的相匹配
    private HumanEnum(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }

    /**
     * java enum类型尽量简单使用,尽量不要使用多态,继承等方法
     */
}
