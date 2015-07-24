package Model;

/**
 * Created by JEWELZ on 24/7/15.
 */
public abstract class HummerModel {
    protected abstract void start();

    protected abstract void stop();

    protected abstract void alarm();

    protected abstract void engineBomm();

    final public void run() {
        this.start();

        this.engineBomm();

        if (this.isAlarmable())
            this.alarm();

        this.stop();
    }

    protected boolean isAlarmable() {
        return true;
    }
}
