package com.holiday.paperManage.controller;

import com.holiday.paperManage.entity.TuserDTO;
import com.holiday.paperManage.service.UserService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import java.util.ArrayList;
import java.util.List;

/**
 * @ClassName UserController
 * @description 用户控制
 * @Author NieQiQiang
 * @Date 2019/7/10 17:34
 * @Version 1.0
 */
@Controller
public class  UserController {

    @Resource
    UserService userService;

    @RequestMapping("userList")
    public ModelAndView listUser(){
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("welcome");
        return modelAndView;
    }

    /**
     * 处理用户登录
     * @Author NieQiQiang
     * @Date 17:59 2019/7/10
     * @Param []
     * @return org.springframework.web.servlet.ModelAndView
     **/
    @RequestMapping("userLogin")
    public ModelAndView loginUser(String userCode, String userPassword, HttpServletRequest request){
        ModelAndView modelAndView = new ModelAndView();

        //访问service层执行业务逻辑
        TuserDTO tuser = userService.loginUser(userCode, userPassword);
        if (null != tuser) {
            request.getSession().setAttribute("loginUser",tuser);
            modelAndView.setViewName("welcome");
            return modelAndView;
        }
        modelAndView.addObject("error","登录失败");
        modelAndView.setViewName("../login");
        return modelAndView;
    }

    /**
     * 处理退出登录
     * @Author NieQiQiang
     * @Date 15:56 2019/7/12
     * @Param [request]
     * @return java.lang.String
     **/
    @RequestMapping("loginOut")
    public String loginOut(HttpServletRequest request){
        //清除登录记录
        request.getSession().invalidate();
        //返回登录界面
        return "../login";
    }
}
