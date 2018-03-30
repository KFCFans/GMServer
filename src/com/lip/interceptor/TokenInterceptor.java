package com.lip.interceptor;

import com.lip.service.UserSecurityServie;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

public class TokenInterceptor implements HandlerInterceptor {

    @Autowired
    private UserSecurityServie userSecurityServie;

    @Override
    public boolean preHandle(javax.servlet.http.HttpServletRequest httpServletRequest, javax.servlet.http.HttpServletResponse httpServletResponse, Object o) throws Exception {
        String accesstoken = httpServletRequest.getParameter("accesstoken");

        if (accesstoken == null||accesstoken.equals("")){
            // Access Token 无效输出错误消息
            httpServletResponse.setCharacterEncoding("utf-8");
            httpServletResponse.getWriter().write("{\"status\":401,\"data\":\"需要验证身份信息\"}");

            return false;
        }

        // Access Token 有效即跳转
        if (userSecurityServie.checkAccessToken(accesstoken)){

            return true;
        }

        // Access Token 无效输出错误消息
        httpServletResponse.setCharacterEncoding("utf-8");
        httpServletResponse.getWriter().write("{\"status\":403,\"data\":\"身份消息已过期，请重新登陆\"}");

        return false;
    }

    @Override
    public void postHandle(javax.servlet.http.HttpServletRequest httpServletRequest, javax.servlet.http.HttpServletResponse httpServletResponse, Object o, ModelAndView modelAndView) throws Exception {

    }

    @Override
    public void afterCompletion(javax.servlet.http.HttpServletRequest httpServletRequest, javax.servlet.http.HttpServletResponse httpServletResponse, Object o, Exception e) throws Exception {

    }
}
