package com.company.enums;

public enum Error {

    INTERNAL_SERVER_ERROR(10000), // Code: ER3489
    NULL_POINTER_EXCEPTION(10001); // Code: ER2349

    private Integer code;

    Error(Integer code){
        this.code = code;
    }

    public Integer getCode() {
        return code;
    }
}
