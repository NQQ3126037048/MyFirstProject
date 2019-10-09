package com.holiday.paperManage.service;

import com.holiday.paperManage.entity.TuserDTO;

/**
 * @InterfaceName UserService
 * @description 处理用户业务逻辑规则目录
 * @Author NieQiQiang
 * @Date 2019/7/10 16:47
 * @Version 1.0
 */
public interface UserService {
    /**
     * 处理用户登录业务
     * @Author NieQiQiang
     * @Date 9:43 2019/7/12
     * @Param [userCode, userPassword]
     * @return com.holiday.paperManage.entity.TuserDTO
     **/
    TuserDTO loginUser(String userCode, String userPassword);
}
