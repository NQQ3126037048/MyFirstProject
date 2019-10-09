package com.holiday.paperManage.entity;

import java.sql.Timestamp;

/**
 * @ClassName TcodeDTO
 * @description 公共代码表实体类
 * @Author NieQiQiang
 * @Date 2019/7/11 17:44
 * @Version 1.0
 */
public class TcodeDTO {
    /**
     * 主键id
     */
    private Integer id;
    /**
     * 代码编码
     */
    private String code;
    /**
     * 代码名称
     */
    private String codeName;
    /**
     * 代码类型名称
     */
    private String codeTypeName;
    /**
     * 上级编码
     */
    private String parCode;
    /**
     * 排序
     */
    private Integer sequenceNum;
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

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getCodeName() {
        return codeName;
    }

    public void setCodeName(String codeName) {
        this.codeName = codeName;
    }

    public String getCodeTypeName() {
        return codeTypeName;
    }

    public void setCodeTypeName(String codeTypeName) {
        this.codeTypeName = codeTypeName;
    }

    public String getParCode() {
        return parCode;
    }

    public void setParCode(String parCode) {
        this.parCode = parCode;
    }

    public Integer getSequenceNum() {
        return sequenceNum;
    }

    public void setSequenceNum(Integer sequenceNum) {
        this.sequenceNum = sequenceNum;
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
        return "TcodeDTO{" +
                "id=" + id +
                ", code='" + code + '\'' +
                ", codeName='" + codeName + '\'' +
                ", codeTypeName='" + codeTypeName + '\'' +
                ", parCode='" + parCode + '\'' +
                ", sequenceNum=" + sequenceNum +
                ", createdBy='" + createdBy + '\'' +
                ", creationDate=" + creationDate +
                ", modifyBy='" + modifyBy + '\'' +
                ", modifyDate=" + modifyDate +
                '}';
    }
}
