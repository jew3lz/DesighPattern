package Bridge.Implementor;

/**
 * Created by JEWELZ on 24/7/15.
 */
public class IPod extends Product {

    public void beProducted(){
        System.out.println("生产出的iPod是这样子的...");
    }

    public void beSelled() {
        System.out.println("生产出的iPod卖出去了...");
    }

}
