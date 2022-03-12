package com.littlekids8.handlers;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.ModelAndView;

////@ControllerAdvice将当前类标识为异常处理的组件
@ControllerAdvice
public class ExceptionController {

    //@ExceptionHandler用于设置所标识方法处理的异常
    @ExceptionHandler(Exception.class)
    //ex表示当前请求处理中出现的异常对象
    public ModelAndView handleArithmeticException(Exception ex){
        // 将会跳转到error.jsp页面
        ModelAndView mv = new ModelAndView("error");
        // 把异常加到model中
        mv.addObject("exception", ex);
        return mv;
    }
}
