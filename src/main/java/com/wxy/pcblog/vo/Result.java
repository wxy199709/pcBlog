package com.wxy.pcblog.vo;

import lombok.Data;

import java.io.Serializable;


/**
 * @author: wuxueyong
 * @Description:
 * @date: 2021/8/31 8:56
 */
@Data
public class Result implements Serializable {
    private String msg;
    private Integer code;
    private Object data;



}
