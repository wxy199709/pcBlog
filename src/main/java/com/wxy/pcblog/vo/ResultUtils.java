package com.wxy.pcblog.vo;

/**
 * @author: wuxueyong
 * @Description:返回结果工具类
 * @date: 2021/8/31 9:26
 */
public class ResultUtils {
    public static Result success() {
        Result result = new Result();
        result.setCode(200);
        result.setMsg("SUCCESS");
        result.setData(null);
        return result;
    }
    public static Result success(Object o) {
        Result result = new Result();
        result.setCode(200);
        result.setMsg("SUCCESS");
        result.setData(o);
        return result;
    }

    public static Result error() {
        Result result = new Result();
        result.setCode(9999);
        result.setMsg("ERROR");
        result.setData(null);
        return result;
    }

    public static Result error(String msg) {
        Result result = new Result();
        result.setCode(9999);
        result.setMsg(msg);
        result.setData(null);
        return result;
    }

}
