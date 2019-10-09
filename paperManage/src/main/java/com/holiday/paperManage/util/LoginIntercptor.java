package com.holiday.paperManage.util;

import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.PrintWriter;

/**
 * @ClassName LoginIntercptor
 * @description 处理未登录拦截
 * @Author NieQiQiang
 * @Date 2019/7/10 16:53
 * @Version 1.0
 */
public class LoginIntercptor implements HandlerInterceptor {
    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object o) throws Exception {
        //处理响应乱码
        response.setContentType("text/html;charset=UTF-8");
        //获取页面登录信息
        Object user = request.getSession().getAttribute("loginUser");
        //如果登录信息为空提示登录进入登录页面，如果不为空放行请求
        if (null == user) {
            PrintWriter out = response.getWriter();
            out.print("<html><script>alert('请先登录');" +
                    "window.location.href='login.jsp';</script></html>");
            return false;
        }
        return true;
    }

    @Override
    public void postHandle(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Object o, ModelAndView modelAndView) throws Exception {

    }

    @Override
    public void afterCompletion(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Object o, Exception e) throws Exception {

    }
}
