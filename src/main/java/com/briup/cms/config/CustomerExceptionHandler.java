package com.briup.cms.config;


import org.apache.logging.log4j.message.Message;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import com.briup.cms.utils.MessageUtil;



/**
 * @program: app01
 * @description: 统一异常处理类
 * @author: charles
 * @create: 2019-03-13 21:03
 **/
@RestControllerAdvice
public class CustomerExceptionHandler {

    @ExceptionHandler(value =  Exception.class) // 捕获 Controller 中抛出的指定类型的异常，也可以指定其他异常
    public <E> Message handler(Exception exception){
        exception.printStackTrace(); 
        return (Message) MessageUtil.error(exception.getMessage());
    }
}
