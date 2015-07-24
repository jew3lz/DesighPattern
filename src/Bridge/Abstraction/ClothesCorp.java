package Bridge.Abstraction;

import Bridge.Implementor.Product;

/**
 * Created by JEWELZ on 24/7/15.
 */
public class ClothesCorp extends Corp {
    public ClothesCorp(Product product) {
        super(product);
    }

    @Override
    public void makeMoney() {
        super.makeMoney();
        System.out.println("服装公司赚小钱...");
    }
}
