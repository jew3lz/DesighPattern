package Builder;

import java.util.ArrayList;

/**
 * Created by JEWELZ on 24/7/15.
 */
public class BMWBuilder extends CarBuilder {
    private BenzModel benz = new BenzModel();

    @Override
    public void setSequence(ArrayList<String> sequence) {
        this.benz.setSequence(sequence);
    }

    @Override
    public CarModel getCarModel() {
        return this.benz;
    }
}
