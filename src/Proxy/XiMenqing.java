package Proxy;

/**
 * Created by JEWELZ on 6/7/15.
 */
public class XiMenqing {
    public static void main(String[] args) {
        //叫王婆出来
        Wangpo wangpo = new Wangpo();

        wangpo.happyWithMan();//表面上是王婆,其实是潘金莲在happer
        wangpo.makeEyesToMan();

        //西门庆又勾引贾氏
        wangpo = new Wangpo(new JiaShi());
        wangpo.makeEyesToMan();
        wangpo.happyWithMan();

        /**
         * 代理模式主要使用了Java的多态,干活的是被代理类,代理类主要是接活.实现的是同一个接口,所以清楚什么能干什么不能
         */
    }
}
