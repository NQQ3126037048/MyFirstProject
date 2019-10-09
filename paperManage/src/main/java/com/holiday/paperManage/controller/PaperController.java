package com.holiday.paperManage.controller;

import com.holiday.paperManage.entity.TcodeDTO;
import com.holiday.paperManage.entity.TpaperDTO;
import com.holiday.paperManage.service.PaperService;
import com.holiday.paperManage.util.PageUtil;
import org.apache.commons.lang.math.RandomUtils;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;

import javax.activation.MimetypesFileTypeMap;
import javax.annotation.Resource;
import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.*;
import java.util.List;

/**
 * @ClassName PaperController
 * @description 处理论文页面请求控制
 * @Author NieQiQiang
 * @Date 2019/7/13 9:14
 * @Version 1.0
 */
@Controller
public class PaperController {

    /**
     * 默认每页显示条数
     */
    private final Integer PAGENUM = 2;

    @Resource
    PaperService paperService;

    /**
     * 处理论文分页查询显示
     * @Author NieQiQiang
     * @Date 17:22 2019/7/13
     * @Param [title, type, pageIndex, pageNum]
     * @return org.springframework.web.servlet.ModelAndView
     **/
    @RequestMapping("listPagePaper")
    public ModelAndView pagePaper(String title, Integer type, Integer pageIndex, Integer pageNum){
        ModelAndView modelAndView = new ModelAndView();
        //第一次请求页面展示所有分页信息
        if (title==null || title.isEmpty()) {
            title = "";
        }
        if (type == null) {
            type = 0;
        }
        if (pageIndex == null) {
            pageIndex = 1;
        }
        if (pageNum == null) {
            pageNum = PAGENUM;
        }

        //创建分页
        PageUtil page = new PageUtil();
        page.setPageIndex(pageIndex);
        page.setPageNum(pageNum);
        page.setSkipNum();
        //获取模糊查询分页数据
        List<TpaperDTO> paperList = paperService.listPageTpaper(title, type, page);
        //获取论文类型
        List<TcodeDTO> codeList = paperService.listTcodePaper();
        //存储数据
        modelAndView.addObject("codeList",codeList);
        modelAndView.addObject("paperListPage",paperList);
        //存储分页信息
        TpaperDTO paper = null;
        try {
            //获取集合中第一条数据
            paper = paperList.get(0);
        } catch (ArrayIndexOutOfBoundsException e) {
            //查询集合中无数据为分页对象赋值为0
            paper = new TpaperDTO();
            paper.setTotalPageNum(0);
            paper.setPageIndex(0);
            e.printStackTrace();
        }
        modelAndView.addObject("paperPage",paper);
        //存储查询关键字
        modelAndView.addObject("queryType",type);
        modelAndView.addObject("queryTitle",title);

        //跳转页面
        modelAndView.setViewName("paperList");
        return modelAndView;
    }


    @RequestMapping("filePaper")
    public ModelAndView filePaper(HttpServletRequest request,String title, Integer type, String paperSummary, MultipartFile fileName){
        ModelAndView modelAndView = new ModelAndView();
        if (fileName != null) {
            //存储路径
            String path = "D:\\lunwen";
            //存储文件名
            String newFileName = System.currentTimeMillis()+ RandomUtils.nextInt(10000)+"_lunWen.doc";
            //创建新文件对象
            File newFile = new File(path,newFileName);
            //判断是否存在该路径，不存在创建该路径
            if (!newFile.exists()) {
                newFile.mkdirs();
            }
            //保存文件
            try {
                fileName.transferTo(newFile);
            } catch (IOException e) {
                e.printStackTrace();
            }

            request.getSession().setAttribute("fileNameDownload",newFileName);
            request.getSession().setAttribute("pathFileDownload",newFile.getPath());

            modelAndView.addObject("fileStatus","文件上传成功,路径="+newFile.getPath());
        }else{
            modelAndView.addObject("fileStatus","文件未上传");

        }
        modelAndView.setViewName("addPaper");
        return modelAndView;
    }

    @RequestMapping("downloadFile")
    public void downladFile(HttpServletResponse response, HttpServletRequest request){
        try {
            response.setContentType("text/html; charset=UTF-8");
            //获取下载文件全路径
            String path = (String)request.getSession().getAttribute("pathFileDownload");
            String fileName = (String)request.getSession().getAttribute("fileNameDownload");
            //设置文件MIME类型
            response.setContentType(new MimetypesFileTypeMap().getContentType(fileName));
            // 设置Content-Disposition
            response.setHeader("Content-Disposition","attachment;filename="+
                        new String("论文".getBytes("GBK"),"ISO-8859-1")+".doc");
            //创建读取对象
            InputStream inputStream = new FileInputStream(path);
            //创建输出，通过response将文件响应客户端
            ServletOutputStream out = response.getOutputStream();
            //写入文件
            int b;
            while ((b = inputStream.read()) != -1){
                out.write(b);
            }
            inputStream.close();
            out.close();
        } catch (Exception e) {
            System.out.println("出现异常");
            e.printStackTrace();
        }
    }
}
