package io.github.opensabe.spring.cloud.parent.common.handler;

import io.github.opensabe.base.vo.BaseRsp;
import lombok.Getter;

@Getter
@SuppressWarnings("unused")
public class FrontendException extends IException {

    public static <T> T resolveBaseResponse (BaseRsp<T> rsp) {
        return rsp.resolveData(FrontendException::new);
    }

    /**
     * 国家化占位符
     */
    private final Object [] args;

    public FrontendException(Integer code, String message, String innerMessage, Object data, Object ... args) {
        super(code, message, innerMessage, data);
        this.args = args;
    }

    public FrontendException(Integer code, String message, Object data, Object ... args) {
        this(code, message, null, data, args);
    }

    public FrontendException(Integer code, String message, String innerMessage, Object ... args) {
        this(code, message, innerMessage, null, args);
    }

    public FrontendException(Integer code, String message, Object ... args) {
        this(code, message, null, null, args);
    }

    public FrontendException(ErrorMessage message, String innerMessage, Object data, Object ... args) {
        super(message, innerMessage, data);
        this.args = args;
    }

    public FrontendException(ErrorMessage message, String innerMessage, Object ... args) {
        this(message, innerMessage, message.data(), args);
    }

    public FrontendException(ErrorMessage message, Object data, Object ... args) {
        this(message, null, data, args);
    }

    public FrontendException(ErrorMessage message, Object ... args) {
        this(message, message.data(), args);
    }

}
