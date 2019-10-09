package com.holiday.paperManage.util;

/**
 * @ClassName PageUtil
 * @description 分页实体工具类
 * @Author NieQiQiang
 * @Date 2019/7/13 13:46
 * @Version 1.0
 */
public class PageUtil {

    //当前页
    private Integer pageIndex = 1;
    //每页显示条数
    private Integer pageNum;
    //总页数
    private Integer totalPageNum;
    //分页查询跳过条数
    private Integer skipNum;

    public void setSkipNum(Integer skipNum) {
        this.skipNum = skipNum;
    }

    /**
     * 计算分页查询时跳过条数
     * @Author NieQiQiang
     * @Date 15:56 2019/7/13
     * @Param []
     * @return void
     **/
    public void setSkipNum() {
        skipNum = (pageIndex - 1) * pageNum;
    }

    public Integer getPageIndex() {
        return pageIndex;
    }

    public void setPageIndex(Integer pageIndex) {
        this.pageIndex = pageIndex;
    }

    public Integer getPageNum() {
        return pageNum;
    }

    public void setPageNum(Integer pageNum) {
        this.pageNum = pageNum;
    }

    public Integer getTotalPageNum() {
        return totalPageNum;
    }

    public void setTotalPageNum(Integer totalPageNum) {
        this.totalPageNum = totalPageNum;
    }

    @Override
    public String toString() {
        return "PageUtil{" +
                "pageIndex=" + pageIndex +
                ", pageNum=" + pageNum +
                ", totalPageNum=" + totalPageNum +
                ", skipNum=" + skipNum +
                '}';
    }
}
