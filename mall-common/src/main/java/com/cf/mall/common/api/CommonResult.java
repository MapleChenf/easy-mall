package com.cf.mall.common.api;

/**
 * 通用返回对象
 */
public class CommonResult<T> {
    private long code;
    private String message;
    private T data;

    protected CommonResult() {
    }

    protected CommonResult(long code, String message, T data) {
        this.code = code;
        this.message = message;
        this.data = data;
    }

    public static <T> com.cf.springcloud.common.CommonResult<T> success() {
        return new com.cf.springcloud.common.CommonResult<T>(com.cf.springcloud.common.ResultCode.SUCCESS.getCode(), com.cf.springcloud.common.ResultCode.SUCCESS.getMessage(),null);
    }

    /**
     * 成功返回结果
     *
     * @param data 获取的数据
     */
    public static <T> com.cf.springcloud.common.CommonResult<T> success(T data) {
        return new com.cf.springcloud.common.CommonResult<T>(com.cf.springcloud.common.ResultCode.SUCCESS.getCode(), com.cf.springcloud.common.ResultCode.SUCCESS.getMessage(), data);
    }

    /**
     * 成功返回结果
     *
     * @param data 获取的数据
     * @param  message 提示信息
     */
    public static <T> com.cf.springcloud.common.CommonResult<T> success(T data, String message) {
        return new com.cf.springcloud.common.CommonResult<T>(com.cf.springcloud.common.ResultCode.SUCCESS.getCode(), message, data);
    }

    /**
     * 失败返回结果
     * @param errorCode 错误码
     */
    public static <T> com.cf.springcloud.common.CommonResult<T> failed(IErrorCode errorCode) {
        return new com.cf.springcloud.common.CommonResult<T>(errorCode.getCode(), errorCode.getMessage(), null);
    }

    /**
     * 失败返回结果
     * @param message 提示信息
     */
    public static <T> com.cf.springcloud.common.CommonResult<T> failed(String message) {
        return new com.cf.springcloud.common.CommonResult<T>(com.cf.springcloud.common.ResultCode.FAILED.getCode(), message, null);
    }

    /**
     * 失败返回结果
     */
    public static <T> com.cf.springcloud.common.CommonResult<T> failed() {
        return failed(com.cf.springcloud.common.ResultCode.FAILED);
    }

    /**
     * 参数验证失败返回结果
     */
    public static <T> com.cf.springcloud.common.CommonResult<T> validateFailed() {
        return failed(com.cf.springcloud.common.ResultCode.VALIDATE_FAILED);
    }

    /**
     * 参数验证失败返回结果
     * @param message 提示信息
     */
    public static <T> com.cf.springcloud.common.CommonResult<T> validateFailed(String message) {
        return new com.cf.springcloud.common.CommonResult<T>(com.cf.springcloud.common.ResultCode.VALIDATE_FAILED.getCode(), message, null);
    }

    /**
     * 未登录返回结果
     */
    public static <T> com.cf.springcloud.common.CommonResult<T> unauthorized(T data) {
        return new com.cf.springcloud.common.CommonResult<T>(com.cf.springcloud.common.ResultCode.UNAUTHORIZED.getCode(), com.cf.springcloud.common.ResultCode.UNAUTHORIZED.getMessage(), data);
    }

    /**
     * 未授权返回结果
     */
    public static <T> com.cf.springcloud.common.CommonResult<T> forbidden(T data) {
        return new com.cf.springcloud.common.CommonResult<T>(com.cf.springcloud.common.ResultCode.FORBIDDEN.getCode(), com.cf.springcloud.common.ResultCode.FORBIDDEN.getMessage(), data);
    }

    public long getCode() {
        return code;
    }

    public void setCode(long code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }
}
