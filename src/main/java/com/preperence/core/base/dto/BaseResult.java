package com.preperence.core.base.dto;

/**
 * @Author ： xy.
 * @Date ：Created in 14:38 2019/8/24
 * @Version: 1.0
 */
public class BaseResult<T> {

    private int code;

    private String msg;

    private T data;

    public BaseResult(T data) {
        this.data = data;
    }

    /**
     * 成功
     * @param data
     * @param <T>
     * @return
     */
    public static <T> BaseResult<T> success(T data) {
        return new BaseResult<>(data);
    }

    /**
     * 失败
     * @param codeMsg
     * @param <T>
     * @return
     */
    public static <T> BaseResult<T> error(CodeMsg codeMsg) {
        return new BaseResult<T>(codeMsg);
    }

    public BaseResult(CodeMsg codeMsg) {
        if (codeMsg != null) {
            this.code = codeMsg.getCode();
            this.msg = codeMsg.getMsg();
        }
    }

    public BaseResult(int code, String msg) {
        this.code = code;
        this.msg = msg;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }
}
