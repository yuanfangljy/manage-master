package com.wq.common.util;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.wq.common.entity.ResponseResult;
import lombok.extern.slf4j.Slf4j;

import javax.servlet.ServletRequest;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.PrintWriter;

/**
 * @项目名称：
 * @类名称：ShiroFilterUtils
 * @类描述：shiro工具类
 * @创建人：liujiayi
 * @创建时间：2018/9/17 18:08
 * @修改时间：2018/9/17 18:08
 * @version：1.0
 */
@SuppressWarnings("all")
@Slf4j
public class ShiroFilterUtils {

    private final static ObjectMapper objectMapper = new ObjectMapper();

    /**
     *@Description:  功能描述（判断请求是否是ajax）
     *@Author:       刘家义
     *@CreateDate:   2018/9/17 18:08
     *@param request
     *@return
    */
    public static boolean isAjax(ServletRequest request){
        String header = ((HttpServletRequest) request).getHeader("X-Requested-With");
        if("XMLHttpRequest".equalsIgnoreCase(header)){
            log.debug("shiro工具类【wyait-manager-->ShiroFilterUtils.isAjax】当前请求,为Ajax请求");
            return Boolean.TRUE;
        }
        log.debug("shiro工具类【wyait-manager-->ShiroFilterUtils.isAjax】当前请求,非Ajax请求");
        return Boolean.FALSE;
    }

    /**
     * @Description:  功能描述（response输出json）
     * @Author:       刘家义
     * @CreateDate:   2018/9/17 18:09
     * @param response
     * @param result
    */
    public static void out(HttpServletResponse response, ResponseResult result){
        PrintWriter out = null;
        try {
            response.setCharacterEncoding("UTF-8");//设置编码
            response.setContentType("application/json");//设置返回类型
            out = response.getWriter();
            out.println(objectMapper.writeValueAsString(result));//输出
            log.error("用户在线数量限制【wyait-manage-->ShiroFilterUtils.out】响应json信息成功");
        } catch (Exception e) {
            log.error("用户在线数量限制【wyait-manage-->ShiroFilterUtils.out】响应json信息出错", e);
        }finally{
            if(null != out){
                out.flush();
                out.close();
            }
        }
    }
}
