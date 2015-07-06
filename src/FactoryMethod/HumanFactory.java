package FactoryMethod;

import java.util.HashMap;
import java.util.List;
import java.util.Random;

/**
 * Created by JEWELZ on 6/7/15.
 */
public class HumanFactory {
    //定义一个map,初始化过的Human对象都放在这里,(Lazy initialization延迟始化),初始化后不释放,再用直接从内存中拿出来用
    private static HashMap<String, Human> humans = new HashMap<String, Human>();

    //定义一个烤箱,泥巴塞进去,人就出来
    public static Human createHuman(Class c) {
        Human human = null;

        try {
            //如果map中有,就直接取出
            if (humans.containsKey(c.getSimpleName())) {
                human = humans.get(c.getSimpleName());
            } else {
                human = (Human) Class.forName(c.getName()).newInstance();
                humans.put(c.getSimpleName(), human);
            }
        } catch (InstantiationException e) {//不指定人类颜色没法烤
            System.out.println("必须指定人类颜色");
        } catch (IllegalAccessException e) {//定义的人类有问题,烤不出来
            System.out.println("人类定义错误");
        } catch (ClassNotFoundException e) {//随便说个人类,无法制造
            System.out.println("指定的人类找不到");
        }
        return human;
    }

    //一团泥巴扔进八卦炉,爱产生啥人类就啥人类
    public static Human createHuman() {
        Human human = null;//定义一个类型的人类

        //首先是获得有多少个实现类,多少个人类
        List<Class> concreateHumanList = ClassUtil.getAllClassByInterface(Human.class);//定义了多少人类
        //八卦撸自己想烧出什么人就烧出什么人
        Random random = new Random();
        int rand = random.nextInt(concreateHumanList.size());

        human = createHuman(concreateHumanList.get(rand));

        return human;
    }
}
