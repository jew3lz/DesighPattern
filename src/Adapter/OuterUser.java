package Adapter;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by JEWELZ on 24/7/15.
 */
public class OuterUser implements IOuterUser {
    @Override
    public Map getUserBaseInfo() {
        HashMap baseInfoMap = new HashMap();

        baseInfoMap.put("userName", "员工名叫小明..");
        baseInfoMap.put("mobileNumber", "电话是...");
        return baseInfoMap;
    }

    @Override
    public Map getUserOfficeInfo() {
        HashMap officeInfo = new HashMap();

        officeInfo.put("jobPosition", "这个人的职位是boss..");
        officeInfo.put("officeNum", "员工办公号码是...");
        return officeInfo;
    }

    @Override
    public Map getUserHomeInfo() {
        HashMap homeInfo = new HashMap();

        homeInfo.put("homeTelNumber", "员工的家庭电话是...");
        homeInfo.put("homeAddress", "员工的家庭住址是...");
        return homeInfo;
    }
}
