package Model;

/**
 * Created by JEWELZ on 24/7/15.
 */
public class HummerH1Model extends HummerModel {

    private boolean alarmFlag = true;

    @Override
    protected void start() {
        System.out.println("悍马H1启动");
    }

    @Override
    protected void stop() {
        System.out.println("悍马H1停止");
    }

    @Override
    protected void alarm() {
        System.out.println("悍马H1鸣笛");
    }

    @Override
    protected void engineBomm() {
        System.out.println("悍马H1引擎声音");
    }

    @Override
    protected boolean isAlarmable() {
        return this.alarmFlag;
    }
}
