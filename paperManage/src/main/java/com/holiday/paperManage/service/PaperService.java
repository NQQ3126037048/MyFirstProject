package com.holiday.paperManage.service;

import com.holiday.paperManage.entity.TcodeDTO;
import com.holiday.paperManage.entity.TpaperDTO;
import com.holiday.paperManage.util.PageUtil;

import java.util.List;

/**
 * @InterfaceName PaperService
 * @description 定义论文业务处理规则
 * @Author NieQiQiang
 * @Date 2019/7/13 13:47
 * @Version 1.0
 */
public interface PaperService {
    /**
     * 处理模糊查询论文分页信息
     * @Author NieQiQiang
     * @Date 13:51 2019/7/13
     * @Param [title, type, page]
     * @return java.util.List<com.holiday.paperManage.entity.TpaperDTO>
     **/
    List<TpaperDTO> listPageTpaper(String title, Integer type, PageUtil page);


    List<TcodeDTO> listTcodePaper();
}
