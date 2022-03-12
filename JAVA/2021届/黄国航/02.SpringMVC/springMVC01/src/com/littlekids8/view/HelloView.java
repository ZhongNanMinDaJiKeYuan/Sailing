package com.littlekids8.view;

import org.springframework.stereotype.Component;
import org.springframework.web.servlet.View;

import java.util.Date;
import java.util.Map;

// 将会使用视图解析器BeanNameViewResolver进行解析视图:
// 该视图解析器直接从IOC容器中根据viewName取出视图解析视图，故视图需要配置为bean
@Component
public class HelloView implements View {
    @Override
    public String getContentType() {
        return "text/html";
    }

    @Override
    public void render(Map<String, ?> model, javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws Exception {
        response.getWriter().println("hello view ,time:"+ new Date());
    }
}
