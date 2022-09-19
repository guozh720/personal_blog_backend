package com.guozh.personal_blog_backend.utils;

/**
 * @Author guozh
 * @Date 2022/9/20
 */
public abstract class ServiceResultDO {
    private boolean success;
    private String errorCode;
    private String errorMessage;
    private Object data;

    public ServiceResultDO() {
    }

    public boolean isSuccess() {
        return success;
    }

    public void setSuccess(boolean success) {
        this.success = success;
    }

    public String getErrorCode() {
        return errorCode;
    }

    public void setErrorCode(String errorCode) {
        this.errorCode = errorCode;
    }

    public String getErrorMessage() {
        return errorMessage;
    }

    public void setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }
}
