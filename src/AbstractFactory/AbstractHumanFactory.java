package AbstractFactory;

/**
 * Created by JEWELZ on 6/7/15.
 * 编写一个抽象类,根据enum创建一个人类出来
 */
public abstract class AbstractHumanFactory implements HumanFactory {
    /**
     * 给定一个性别人类,创建一个人类出来,专业术语是产生产品等级
     */

    protected Human createHuman(HumanEnum humanEnum) {
        Human human = null;

        //如果传递进来的不是一个Enum中具体的Element的话,不处理
        if (!humanEnum.getValue().equals("")) {
            try {
                human = (Human) Class.forName(humanEnum.getValue()).newInstance();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return human;
    }
}
