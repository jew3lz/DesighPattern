package Strategy;

/**
 * Created by JEWELZ on 6/7/15.
 */
public class GreenLight implements IStrategy {
    @Override
    public void operate() {
        System.out.println("找吴太给吴国压力开绿灯");
    }
}
