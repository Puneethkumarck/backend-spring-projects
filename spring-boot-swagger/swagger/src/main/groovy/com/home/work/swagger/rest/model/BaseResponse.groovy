package com.home.work.swagger.rest.model

import io.swagger.annotations.ApiModel
import io.swagger.annotations.ApiModelProperty


@ApiModel(value = "BaseResponse" , description = "the API interface return object")
class BaseResponse<T> {

    @ApiModelProperty(value = "wheather succeeded" ,name = "success" , example = "true",required = true)
    private boolean success

    @ApiModelProperty(value = "return detailed instruction",name = "msg" , example = "success")
    private String msg

    @ApiModelProperty(value = "returned data",name = "data")
    private T  data

    BaseResponse(){

    }

    BaseResponse(boolean success, String msg, T data) {
        this.success = success
        this.msg = msg
        this.data = data
    }

    boolean getSuccess() {
        return success
    }

    void setSuccess(boolean success) {
        this.success = success
    }

    String getMsg() {
        return msg
    }

    void setMsg(String msg) {
        this.msg = msg
    }

    T getData() {
        return data
    }

    void setData(T data) {
        this.data = data
    }
}
