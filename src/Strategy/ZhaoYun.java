package Strategy;

/**
 * Created by JEWELZ on 6/7/15.
 */
public class ZhaoYun {
    /**
     * 赵云出场,根据诸葛亮给他的交代,依次拆开妙计
     */
    public static void main(String[] args) {
        Context context;
        System.out.println("刚到吴国的时候拆第一个");
        context = new Context(new BackDoor());//拿到妙计
        context.operate();
        System.out.println();

        System.out.println("拆第二个");
        context = new Context(new GreenLight());
        context.operate();
        System.out.println();

        System.out.println("拆第三个");
        context = new Context(new BlockEnemy());
        context.operate();
        System.out.println();
    }
}
