package Adapter;

/**
 * Created by JEWELZ on 24/7/15.
 */
public class UserInfo implements IUserInfo {
    @Override
    public String getUserName() {
        System.out.println("这是员工的信名...");
        return null;
    }

    @Override
    public String getHomeAddress() {
        System.out.println("员工的家庭住址是...");
        return null;
    }

    @Override
    public String getMobileNumber() {
        System.out.println("这个人的手机号码是...");
        return null;
    }

    @Override
    public String getOfficeTelNumber() {
        System.out.println("这个人的办公室电话是...");
        return null;
    }

    @Override
    public String getJobPosition() {
        System.out.println("这个人的职位是..");
        return null;
    }

    @Override
    public String getHomeTelNumber() {
        System.out.println("这个人的家庭电话是...");
        return null;
    }
}
