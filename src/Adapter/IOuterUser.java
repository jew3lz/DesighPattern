package Adapter;

import java.util.Map;

/**
 * Created by JEWELZ on 24/7/15.
 */
public interface IOuterUser {
    //基本信息
    Map getUserBaseInfo();

    //工作区域信息
    Map getUserOfficeInfo();

    //用户的家庭信息
    Map getUserHomeInfo();
}
