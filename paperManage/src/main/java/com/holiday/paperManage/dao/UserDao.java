package com.holiday.paperManage.dao;

import com.holiday.paperManage.entity.TuserDTO;
import org.apache.ibatis.annotations.Param;

/**
 * @InterfaceName UserDao
 * @description 定义用户表的访问规则
 * @Author NieQiQiang
 * @Date 2019/7/10 16:19
 * @Version 1.0
 */
public interface UserDao {
    /**
     * 该方法用于根据登录代码以及密码获取用户信息
     * @param userCode
     * @param UserPassword
     * @return
     */
    TuserDTO getTuserByCodeAndPassword(@Param("code") String userCode,
                                       @Param("password") String UserPassword);
}
