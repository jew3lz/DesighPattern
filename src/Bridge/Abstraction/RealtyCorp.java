package Bridge.Abstraction;

import Bridge.Implementor.Product;

/**
 * Created by JEWELZ on 24/7/15.
 */
public class RealtyCorp extends Corp {
    public RealtyCorp(Product product) {
        super(product);
    }

    @Override
    public void makeMoney() {
        super.makeMoney();
        System.out.println("房地产公司赚大钱了..");
    }
}
