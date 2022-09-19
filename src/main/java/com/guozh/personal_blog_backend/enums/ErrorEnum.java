package com.guozh.personal_blog_backend.enums;

/**
 * @Author guozh
 * @Date 2022/9/20
 */
public enum ErrorEnum {

    ParamIsNull("BE.ParamIsNull","back-end service: param is null"),

    CanNotFindResult("BE.CanNotFindResult","back-end service: can not find result"),

    UniqueKeyIsExist("BE.UniqueKeyIsExist","back-end service:unique key is exist"),

    DataCanNotBeEmpty("BE.DataCanNotBeEmpty","back-end service: data can not be empty");

    private String errorCode;
    private String errorMessage;

    ErrorEnum(String errorCode, String errorMessage) {
        this.errorCode = errorCode;
        this.errorMessage = errorMessage;
    }

    public String getErrorCode() {
        return errorCode;
    }

    public String getErrorMessage() {
        return errorMessage;
    }
}
