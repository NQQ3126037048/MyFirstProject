package com.holiday.paperManage.service.impl;

import com.holiday.paperManage.dao.PaperDao;
import com.holiday.paperManage.entity.TcodeDTO;
import com.holiday.paperManage.entity.TpaperDTO;
import com.holiday.paperManage.service.PaperService;
import com.holiday.paperManage.util.PageUtil;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * @ClassName PaperServiceImpl
 * @description
 * @Author NieQiQiang
 * @Date 2019/7/13 13:52
 * @Version 1.0
 */
@Service("paperService")
public class PaperServiceImpl implements PaperService {

    @Resource
    PaperDao paperDao;

    @Override
    public List<TpaperDTO> listPageTpaper(String title, Integer type, PageUtil page) {
        //获取数据集合
        List<TpaperDTO> list = paperDao.listTpaperPage(title, type, page);
        return list;
    }

    @Override
    public List<TcodeDTO> listTcodePaper() {
        //获取数据信息
        List<TcodeDTO> list = paperDao.listTcodeByPaper();
        return list;
    }
}
