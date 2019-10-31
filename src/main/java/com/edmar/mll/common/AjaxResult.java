package com.edmar.mll.common;
import com.alibaba.fastjson.JSONObject;


public class AjaxResult extends JSONObject {
    public static final String CODE_TAG = "code";
    public static final String MSG_TAG = "msg";
    public static final String DATA_TAG = "data";

    public enum Type {
        SUCCESS(0),
        ERROR(500);
        private final int value;
        Type(int value) {
            this.value = value;
        }
        public int value() {
            return this.value;
        }
    }
    public AjaxResult(Type type,String msg,Object data) {
        super.put(CODE_TAG,type.value);
        super.put(MSG_TAG,msg);
        super.put(DATA_TAG,data);
    }
    public static AjaxResult success(Object data) {
        return AjaxResult.success("成功！",data);
    }
    public static AjaxResult success(String msg, Object data) {
        return new AjaxResult(Type.SUCCESS,msg,data);
    }


    public static AjaxResult error() {
        return AjaxResult.error("操作失败");
    }
    public static AjaxResult error(String msg) {
        return new AjaxResult(Type.ERROR,msg,null);
    }



}
