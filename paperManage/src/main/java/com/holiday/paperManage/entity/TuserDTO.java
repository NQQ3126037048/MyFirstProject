package com.holiday.paperManage.entity;

import java.sql.Date;
import java.sql.Timestamp;

/**
 * @ClassName TuserDTO
 * @description 用户表实体类
 * @Author NieQiQiang
 * @Date 2019/7/11 10:56
 * @Version 1.0
 */
public class TuserDTO {
    /**
     * 主键
     */
    private Integer id;
    /**
     * 用户账号
     */
    private String userCode;
    /**
     * 用户名
     */
    private String userName;
    /**
     * 用户密码
     */
    private String userPassword;
    /**
     * 性别，1-男，2-女
     */
    private String gender;
    /**
     * 生日
     */
    private Date birthday;
    /**
     * 电话
     */
    private String phone;
    /**
     * 地址
     */
    private String address;
    /**
     * 角色
     */
    private Integer userRole;
    /**
     * 论文发表总数
     */
    private Integer paperNum;
    /**
     * 创建人
     */
    private String createdBy;
    /**
     * 创建时间
     */
    private Timestamp creationDate;
    /**
     * 修改人
     */
    private String modifyBy;
    /**
     * 修改时间
     */
    private Timestamp modifyDate;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUserCode() {
        return userCode;
    }

    public void setUserCode(String userCode) {
        this.userCode = userCode;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserPassword() {
        return userPassword;
    }

    public void setUserPassword(String userPassword) {
        this.userPassword = userPassword;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Integer getUserRole() {
        return userRole;
    }

    public void setUserRole(Integer userRole) {
        this.userRole = userRole;
    }

    public Integer getPaperNum() {
        return paperNum;
    }

    public void setPaperNum(Integer paperNum) {
        this.paperNum = paperNum;
    }

    public String getCreatedBy() {
        return createdBy;
    }

    public void setCreatedBy(String createdBy) {
        this.createdBy = createdBy;
    }

    public Timestamp getCreationDate() {
        return creationDate;
    }

    public void setCreationDate(Timestamp creationDate) {
        this.creationDate = creationDate;
    }

    public String getModifyBy() {
        return modifyBy;
    }

    public void setModifyBy(String modifyBy) {
        this.modifyBy = modifyBy;
    }

    public Timestamp getModifyDate() {
        return modifyDate;
    }

    public void setModifyDate(Timestamp modifyDate) {
        this.modifyDate = modifyDate;
    }

    @Override
    public String toString() {
        return "TuserDTO{" +
                "id=" + id +
                ", userCode='" + userCode + '\'' +
                ", uesrName='" + userName + '\'' +
                ", userPassword='" + userPassword + '\'' +
                ", gender='" + gender + '\'' +
                ", birthday=" + birthday +
                ", phone='" + phone + '\'' +
                ", address='" + address + '\'' +
                ", userRole=" + userRole +
                ", paperNum=" + paperNum +
                ", createdBy='" + createdBy + '\'' +
                ", creationDate=" + creationDate +
                ", modifyBy='" + modifyBy + '\'' +
                ", modifyDate=" + modifyDate +
                '}';
    }
}
