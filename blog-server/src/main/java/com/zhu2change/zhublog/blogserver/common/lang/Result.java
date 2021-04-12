package com.zhu2change.zhublog.blogserver.common.lang;

import lombok.Data;

import java.io.Serializable;

/**
 * 前后端分离，后端只返回封装的数据
 */
@Data
public class Result implements Serializable {
    private String code;//状态
    private String msg;//信息
    private Object data;//数据

    //成功数据
    public static Result success(String msg, Object data){
        Result res = new Result();
        res.setCode("200");
        res.setMsg(msg);
        res.setData(data);

        return res;
    }
    public static Result success(Object data){
        return success("操作成功",data);
    }
    //失败数据
    public static Result fail(int code, String msg, Object data){
        Result res = new Result();
        res.setCode(Integer.toString(code));
        res.setMsg(msg);
        res.setData(data);

        return res;
    }
    public static Result fail(Object data){
        return fail(400,"操作失败",data);
    }
}
