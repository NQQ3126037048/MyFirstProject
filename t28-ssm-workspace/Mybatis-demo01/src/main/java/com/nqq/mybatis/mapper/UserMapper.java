package com.nqq.mybatis.mapper;

import java.util.List;

import com.nqq.mybatis.pojo.User;

public interface UserMapper {
	/**
	 * @Author NieQiQiang
	 * @Description 该方法用户获取user所有信息
	 * @Date 10:25 2019/4/23
	 * @Param []
	 * @return java.util.List<com.nqq.mybatis.pojo.User>
	 **/
	List<User> getUserList();
}
