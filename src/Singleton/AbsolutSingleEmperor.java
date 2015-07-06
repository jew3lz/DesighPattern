package Singleton;

/**
 * Created by JEWELZ on 6/7/15.
 */
public class AbsolutSingleEmperor {
    private static final AbsolutSingleEmperor singleEmperor = new AbsolutSingleEmperor();

    private AbsolutSingleEmperor() {

    }

    public synchronized static AbsolutSingleEmperor getInstance() {
        return singleEmperor;
    }
}
