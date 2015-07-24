package AbstractFactory;

/**
 * Created by JEWELZ on 6/7/15.
 */
public enum HumanEnum {
    //把世界上所有人的类型都定义出来
    YellowMaleHuman("AbstractFactory.Implementor.YellowMaleHuman"),
    YellowFemaleHuman("AbstractFactory.Implementor.YellowFemaleHuman"),
    WhiteFemaleHuman("AbstractFactory.Implementor.WhiteFemaleHuman"),
    WhiteMaleHuman("AbstractFactory.Implementor.WhiteMaleHuman"),
    BlackFemaleHuman("AbstractFactory.Implementor.BlackFemaleHuman"),
    BlackMaleHuman("AbstractFactory.Implementor.BlackMaleHuman");

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
