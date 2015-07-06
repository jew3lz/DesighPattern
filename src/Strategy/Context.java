package Strategy;

/**
 * Created by JEWELZ on 6/7/15.
 * 装妙计的锦囊
 */
public class Context {
    //构造函数,要使用哪个妙计
    private IStrategy strategy;
    public Context(IStrategy strategy){
        this.strategy = strategy;
    }

    //出计谋
    public void operate(){
        this.strategy.operate();
    }
}
