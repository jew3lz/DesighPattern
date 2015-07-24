package Model;

/**
 * Created by JEWELZ on 24/7/15.
 */
public class HummerH2Model extends HummerModel {
    @Override
    protected void start() {
        System.out.println("悍马H2启动");
    }

    @Override
    protected void stop() {
        System.out.println("悍马H2停止");
    }

    @Override
    protected void alarm() {
        System.out.println("悍马H2鸣笛");
    }

    @Override
    protected void engineBomm() {
        System.out.println("悍马H2引擎声音");
    }

    @Override
    protected boolean isAlarmable() {
        return false;
    }
}
