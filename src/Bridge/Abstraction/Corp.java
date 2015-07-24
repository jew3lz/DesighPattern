package Bridge.Abstraction;

import Bridge.Implementor.Product;

/**
 * Created by JEWELZ on 24/7/15.
 */
public abstract class Corp {

    private Product product;

    public Corp(Product product){
        this.product = product;
    }

    protected void makeMoney() {
        this.product.beProducted();

        this.product.beSelled();
    }
}
