package Singleton;

/**
 * Created by JEWELZ on 6/7/15.
 */
public class Emperor {
    private static Emperor emperor = null;//定义一个皇帝放在那里

    private Emperor(){
        //私有构造方法,不能被外界调用无法new
    }

    public static Emperor getInstance(){
        //多线程在下面这两行逻辑时会出现风险,解决办法见另一个类
        if(emperor == null)
            emperor = new Emperor();
        //∆为null的话就new一个
        return emperor;
    }

    //皇帝名字
    public static void emperorInfo(){
        System.out.println("我就是皇帝xxx");
    }
}
