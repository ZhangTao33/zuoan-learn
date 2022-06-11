package com.zuoan.api.common;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
@Data
@ApiModel("返回结果")
public class ReturnResult <T> implements Serializable {
    private static final long serialVersionUID = 6948768594132295784L;
    @ApiModelProperty("状态码")
    private int status;
    @ApiModelProperty("提示信息")
    private String message;
    @ApiModelProperty("请求流水号")
    private String transId;
    @ApiModelProperty("数据")
    private T data;
    @ApiModelProperty("错误信息")
    private String moreInfo;

    public ReturnResult(int status) {
        this(status, (String)null);
    }

    public ReturnResult(int status, String message) {
//        this(status, message, (Object)null);
    }

    public ReturnResult(int status, String message, T data) {
        this.status = status;
        this.message = message;
        this.data = data;
    }

    public static ReturnResult success(String message) {
        return build(200, message, (Object)null);
    }
    public static <T> ReturnResult<T> build(int code, String message, T data) {
        ReturnResult vo = new ReturnResult(code);
        vo.setMessage(message);
        vo.setData(data);
        return vo;
    }

    public ReturnResult() {
    }

    public ReturnResult(int status, String message, String transId, T data, String moreInfo) {
        this.status = status;
        this.message = message;
        this.transId = transId;
        this.data = data;
        this.moreInfo = moreInfo;
    }

    public static class ReturnResultBuilder<T> {
        private int status;
        private String message;
        private String transId;
        private T data;
        private String moreInfo;

        ReturnResultBuilder() {
        }

        public ReturnResultBuilder<T> status(int status) {
            this.status = status;
            return this;
        }

        public ReturnResultBuilder<T> message(String message) {
            this.message = message;
            return this;
        }

        public ReturnResultBuilder<T> transId(String transId) {
            this.transId = transId;
            return this;
        }

        public ReturnResultBuilder<T> data(T data) {
            this.data = data;
            return this;
        }

        public ReturnResultBuilder<T> moreInfo(String moreInfo) {
            this.moreInfo = moreInfo;
            return this;
        }

        public ReturnResult<T> build() {
            return new ReturnResult(this.status, this.message, this.transId, this.data, this.moreInfo);
        }

        public String toString() {
            return "ReturnResult.ReturnResultBuilder(status=" + this.status + ", message=" + this.message + ", transId=" + this.transId + ", data=" + this.data + ", moreInfo=" + this.moreInfo + ")";
        }
    }
}
