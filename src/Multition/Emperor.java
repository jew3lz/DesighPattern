package Multition;

import java.util.ArrayList;
import java.util.Random;

/**
 * Created by JEWELZ on 6/7/15.
 * 有上限的多例模式
 */
public class Emperor {
    private static int maxNumOfEmperor = 2;//最多只能有两个皇帝
    private static ArrayList emperorInfoList = new ArrayList(maxNumOfEmperor);//皇帝叫什么名字
    private static ArrayList emperorList = new ArrayList(maxNumOfEmperor);//装皇帝的列表
    private static int countNumOfEmperor = 0;

    //先把两个皇帝产生出来
    static {
        for (int i = 0; i < maxNumOfEmperor; i++) {
            emperorList.add(new Emperor("皇"+(i+1)+"帝"));
        }
    }
    //私有
    private Emperor(String info) {
        emperorInfoList.add(info);
    }
    //私有
    private Emperor(){

    }

    public static Emperor getInstance(){
        Random random = new Random();
        countNumOfEmperor = random.nextInt(maxNumOfEmperor);//随机拉出一个皇帝供朝拜
        return (Emperor)emperorList.get(countNumOfEmperor);
    }

    public static void emperorInfo(){
        System.out.println(emperorInfoList.get(countNumOfEmperor));
    }
}
