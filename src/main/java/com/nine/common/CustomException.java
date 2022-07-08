package com.nine.common;

/**
 * 自定义业务异常类
 * @author: nine
 * @version: 1.0
 */
public class CustomException extends RuntimeException{
    public CustomException(String message){
        super(message);
    }
}
