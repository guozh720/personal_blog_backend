package com.guozh.personal_blog_backend.utils;

/**
 * @Author guozh
 * @Date 2022/9/20
 */
public class SuccessResultDO extends ServiceResultDO {

    public SuccessResultDO(Object data) {
        this.setSuccess(true);
        if (data != null) {
            this.setData(data);
        }
    }

    public SuccessResultDO() {
        this.setSuccess(true);
    }
}
