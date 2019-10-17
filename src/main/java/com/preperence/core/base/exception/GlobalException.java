package com.preperence.core.base.exception;

import com.preperence.core.base.dto.CodeMsg;

/**
 * @Author ： xy.
 * @Date ：Created in 11:13 2019/8/27
 * @Version: 1.0
 */
public class GlobalException extends RuntimeException {
    private static final long serialVersionUID = 1L;

    private CodeMsg codeMsg;

    public GlobalException(CodeMsg codeMsg) {
        super(codeMsg.toString());
        this.codeMsg = codeMsg;
    }

    public CodeMsg getCodeMsg() {
        return codeMsg;
    }
}
