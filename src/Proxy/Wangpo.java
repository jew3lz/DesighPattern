package Proxy;

/**
 * Created by JEWELZ on 6/7/15.
 * 王婆作为这类女人的代理
 */
public class Wangpo implements KindWomen {
    private KindWomen kindWomen;

    public Wangpo(){
        //默认为潘金莲的代理
        this.kindWomen = new PanJinlian();
    }

    public Wangpo(KindWomen kindWomen){
        //也可以是任意一个这种女人的代理
        this.kindWomen = kindWomen;
    }

    @Override
    public void happyWithMan() {
        kindWomen.happyWithMan();
    }

    @Override
    public void makeEyesToMan() {
        kindWomen.makeEyesToMan();
    }
}
