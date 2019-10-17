package com.preperence.core.base.exception;

import com.preperence.core.base.dto.BaseResult;
import com.preperence.core.base.dto.CodeMsg;
import org.springframework.validation.BindException;
import org.springframework.validation.ObjectError;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

/**
 * @Author ： xy.
 * @Date ：Created in 11:45 2019/8/27
 * @Version: 1.0
 */
@ControllerAdvice
@ResponseBody
public class GlobalExceptionHandler {
    @ExceptionHandler
    public BaseResult<String> exceptionHandler(HttpServletRequest request, Exception e) {
        e.printStackTrace();
        if (e instanceof GlobalException) {
            GlobalException g = (GlobalException) e;
            return BaseResult.error(g.getCodeMsg());
        } else if (e instanceof BindException) {
            BindException b = (BindException) e;
            List<ObjectError> errors = b.getAllErrors();
            ObjectError firstError = errors.get(0);
            String msg = firstError.getDefaultMessage();
            return BaseResult.error(CodeMsg.BIND_ERROR.fillArgs(msg));
        } else {
            return BaseResult.error(CodeMsg.SERVER_ERROR);
        }
    }
}
