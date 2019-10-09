package com.holiday.paperManage.entity;

import com.holiday.paperManage.util.PageUtil;

import java.sql.Timestamp;

/**
 * @ClassName TpaperDTO
 * @description 论文表实体类
 * @Author NieQiQiang
 * @Date 2019/7/11 17:53
 * @Version 1.0
 */
public class TpaperDTO extends PageUtil {
    /**
     * 主键id
     */
    private Integer id;
    /**
     * 论文题目
     */
    private String title;
    /**
     * 论文类型
     */
    private Integer type;
    /**
     * 论文摘要
     */
    private String paperSummary;
    /**
     * 路径
     */
    private String paperPath;
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
    /**
     * 论文文件名
     */
    private String fileName;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    public String getPaperSummary() {
        return paperSummary;
    }

    public void setPaperSummary(String paperSummary) {
        this.paperSummary = paperSummary;
    }

    public String getPaperPath() {
        return paperPath;
    }

    public void setPaperPath(String paperPath) {
        this.paperPath = paperPath;
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

    public String getFileName() {
        return fileName;
    }

    public void setFileName(String fileName) {
        this.fileName = fileName;
    }

    @Override
    public String toString() {
        return "TpaperDTO{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", type=" + type +
                ", paperSummary='" + paperSummary + '\'' +
                ", paperPath='" + paperPath + '\'' +
                ", createdBy='" + createdBy + '\'' +
                ", creationDate=" + creationDate +
                ", modifyBy='" + modifyBy + '\'' +
                ", modifyDate=" + modifyDate +
                ", fileName='" + fileName + '\'' +
                '}';
    }
}
