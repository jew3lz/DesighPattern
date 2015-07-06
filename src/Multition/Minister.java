package Multition;

/**
 * Created by JEWELZ on 6/7/15.
 */
public class Minister {
    public static void main(String[] args) {
        int minister = 10;//10个大臣
        for (int i = 0; i < minister; i++) {
            Emperor emperor = Emperor.getInstance();
            System.out.print("第"+i+"个大臣朝拜的是");
            emperor.emperorInfo();
        }
    }
}
