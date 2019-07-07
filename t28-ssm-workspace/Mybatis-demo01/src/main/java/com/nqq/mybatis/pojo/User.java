package com.nqq.mybatis.pojo;

import java.util.Date;

/**
 * @Author NieQiQiang
 * @Description 测试mybatis实体类 - test数据库
 * @Date 10:14 2019/4/23
 * @Param 
 * @return 
 **/
public class User {

	private Integer id;
	// 用户姓名
	private String username;
	// 性别
	private String sex;
	// 生日
	private Date birthday;
	// 地址
	private String address;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

	public Date getBirthday() {
		return birthday;
	}

	public void setBirthday(Date birthday) {
		this.birthday = birthday;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String toString() {
		return "User [id=" + id + ", username=" + username + ", sex=" + sex + ", birthday=" + birthday + ", address="
				+ address + "]";
	}

}
