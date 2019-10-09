package com.holiday.paperManage.service.impl;

import com.holiday.paperManage.dao.UserDao;
import com.holiday.paperManage.entity.TuserDTO;
import com.holiday.paperManage.service.UserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @ClassName UserServiceImpl
 * @description
 * @Author NieQiQiang
 * @Date 2019/7/10 16:48
 * @Version 1.0
 */
@Service("userService")
public class UserServiceImpl implements UserService {

    @Resource
    UserDao userDao;

    @Override
    public TuserDTO loginUser(String userCode, String userPassword) {
        //获取数据库信息
        TuserDTO tuser = userDao.getTuserByCodeAndPassword(userCode, userPassword);
        //返回结果
        return tuser;
    }
}
