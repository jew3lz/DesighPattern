package Bridge;

import Bridge.Abstraction.ClothesCorp;
import Bridge.Abstraction.RealtyCorp;
import Bridge.Implementor.Clothes;
import Bridge.Implementor.IPod;
import Bridge.Implementor.Realty;

/**
 * Created by JEWELZ on 24/7/15.
 */
public class Client {
    public static void main(String[] args) {
        System.out.println("房地产公司如此运行");
        System.out.println("-----------------");
        RealtyCorp realtyCorp = new RealtyCorp(new Realty());
        realtyCorp.makeMoney();
        System.out.println();

        System.out.println("服装公司如此运行");
        System.out.println("----------------");
        ClothesCorp clothesCorp = new ClothesCorp(new Clothes());
        ClothesCorp shanzhaiCorp = new ClothesCorp(new IPod());
        clothesCorp.makeMoney();
        shanzhaiCorp.makeMoney();
    }
}
