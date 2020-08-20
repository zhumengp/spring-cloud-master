package org.com.zhump.mssp.filter;

import lombok.extern.log4j.Log4j2;
import org.apache.commons.lang3.StringUtils;
import org.com.zhump.mssp.constant.MsspConstant;
import org.com.zhump.mssp.util.RedisUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.servlet.HandlerInterceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.PrintWriter;

@Log4j2
public class GlobalInterceptor  implements HandlerInterceptor {

    @Autowired
    private RedisUtils redisUtils;

    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object obj) throws Exception {
        String secretKey = request.getHeader(MsspConstant.SECRET_KEY);
        if(StringUtils.isNotBlank(secretKey)){
            String s = redisUtils.get(MsspConstant.SECRET_KEY);
            if (StringUtils.isNotBlank(s) && secretKey.equals(s)){
                return true;
            }
        }
        response.setContentType("application/json; charset=utf-8");
        PrintWriter writer = response.getWriter();
        writer.write("{\"code\":1999999,\"msg\":\"网关异常，请重试。。。。\",\"data\":null}");
        return false;

    }
}
