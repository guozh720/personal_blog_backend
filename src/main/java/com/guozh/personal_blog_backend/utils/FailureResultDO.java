package com.guozh.personal_blog_backend.utils;

import com.guozh.personal_blog_backend.enums.ErrorEnum;

/**
 * @Author guozh
 * @Date 2022/9/20
 */
public class FailureResultDO extends ServiceResultDO {

    public FailureResultDO(ErrorEnum errorEnum, Object data) {
        this.setSuccess(false);
        this.setErrorCode(errorEnum.getErrorCode());
        this.setErrorMessage(errorEnum.getErrorMessage());
        this.setData(data);
    }

    public FailureResultDO(ErrorEnum errorEnum) {
        this.setSuccess(false);
        this.setErrorCode(errorEnum.getErrorCode());
        this.setErrorMessage(errorEnum.getErrorMessage());
    }

    public FailureResultDO(String errorCode, String errorMessage) {
        this.setSuccess(false);
        this.setErrorCode(errorCode);
        this.setErrorMessage(errorMessage);
    }
}
