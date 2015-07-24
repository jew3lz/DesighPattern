package Bridge.Abstraction;

import Bridge.Implementor.Product;

/**
 * Created by JEWELZ on 24/7/15.
 */
public class IPodCorp extends Corp{

    public IPodCorp(Product product) {
        super(product);
    }

    @Override
    protected void makeMoney() {
        super.makeMoney();
        System.out.println("iPod公司赚大钱了..");
    }
}
