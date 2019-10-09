package com.holiday.paperManage.dao;

import com.holiday.paperManage.entity.TcodeDTO;
import com.holiday.paperManage.entity.TpaperDTO;
import com.holiday.paperManage.util.PageUtil;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @InterfaceName PaperDao
 * @description 定义论文表的访问规则
 * @Author NieQiQiang
 * @Date 2019/7/13 9:25
 * @Version 1.0
 */
public interface PaperDao {

    /**
     * 获取根据论文标题和论文类型查询的论文分页信息
     * @Author NieQiQiang
     * @Date 13:46 2019/7/13
     * @Param [title, type, page]
     * @return java.util.List<com.holiday.paperManage.entity.TpaperDTO>
     **/
    List<TpaperDTO> listTpaperPage(@Param("title") String title,
                                   @Param("type") Integer type,
                                   @Param("page") PageUtil page);

    /**
     * 获取所有论文类型代码表
     * @Author NieQiQiang
     * @Date 16:01 2019/7/13
     * @Param []
     * @return java.util.List<com.holiday.paperManage.entity.TcodeDTO>
     **/
    List<TcodeDTO> listTcodeByPaper();
}
