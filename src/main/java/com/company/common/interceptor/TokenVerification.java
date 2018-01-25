package com.company.common.interceptor;

import com.alibaba.druid.support.json.JSONUtils;
import com.alibaba.fastjson.JSONObject;
import com.company.common.constant.BaseConstant;
import com.github.pagehelper.util.StringUtil;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;
import org.w3c.dom.css.Counter;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;

/**
 * com.company.common.interceptor
 *
 * @author Wang
 * @create 2018-01-25 下午7:55
 * @description:
 **/
@Component
public class TokenVerification implements HandlerInterceptor {

    private static final Logger logger = LoggerFactory.getLogger(TokenVerification.class);
    @Resource
    private StringRedisTemplate stringRedisTemplate;

    @Override
    public boolean preHandle(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Object o) throws Exception {
        //http请求的信息
        String url = httpServletRequest.getRequestURI().substring(httpServletRequest.getContextPath().length());
        String token = httpServletRequest.getParameter("token");
        String userId = httpServletRequest.getParameter("userId");

        //校验验证码
        String tokenCache = stringRedisTemplate.opsForValue().get(userId);
        if (!tokenCache.equals(token)) {
            Map<Object, Object> map = new HashMap<Object, Object>();
            map.put("code", "401");
            map.put("msg", "Token校验失败...");
            map.put("extra", null);
            map.put("resultMap", null);
            String responseJSONObject = JSONObject.toJSONString(map);
            httpServletResponse.setCharacterEncoding("UTF-8");
            httpServletResponse.setContentType("application/json; charset=utf-8");
            PrintWriter out = null;
            try {
                out = httpServletResponse.getWriter();
                out.append(responseJSONObject);
            } catch (Exception e) {
                e.printStackTrace();
            } finally {
                if (out != null) {
                    out.close();
                }
            }
        }
        stringRedisTemplate.opsForValue().set(userId, token, 30, TimeUnit.MINUTES);
        logger.info("begin request: {}, query params: {}", url);

        return true;
    }

    @Override
    public void postHandle(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Object o, ModelAndView modelAndView) throws Exception {
        String url = httpServletRequest.getRequestURI().substring(httpServletRequest.getContextPath().length());
        logger.info("end request: {}, query params: {}", url, httpServletRequest.getQueryString());
    }

    @Override
    public void afterCompletion(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Object o, Exception e) throws Exception {
        if (e != null) {
            String url = httpServletRequest.getRequestURI().substring(httpServletRequest.getContextPath().length());
            logger.info("end request with exception: {}, query params: {}", url, httpServletRequest.getQueryString());
        }
    }
}

