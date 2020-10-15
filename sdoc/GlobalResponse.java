package com.infoepoch.entity.bean;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.experimental.Accessors;

/**
 * 〈全局response〉
 *
 * @author LZ
 * @create 2019/4/29
 * @since 1.0.0
 */
@Data
@Accessors(chain = true)
@ApiModel(value = "globalResponse", description = "全局返回参数")
public class GlobalResponse {
    /**
     * 状态码
     */
    @ApiModelProperty(value = "状态码", required = true)
    private Integer status;
    /**
     * 返回信息
     */
    @ApiModelProperty(value = "状态描述", required = true)
    private String info;
    /**
     * 结果数据集
     */
    @ApiModelProperty(value = "结果集", required = true)
    private Object data;

    public GlobalResponse() {
    }

    public GlobalResponse(Integer status, String message) {
        this.status = status;
        this.info = message;
    }


    public static GlobalResponse success() {
        return new GlobalResponse(200, "Success");
    }

    public static GlobalResponse bad_request() {
        return new GlobalResponse(400, "Bad Request");
    }

    public static GlobalResponse fail() {
        return new GlobalResponse(0, "Resource not found");
    }

    public static GlobalResponse illegal_argument_message() {
        return new GlobalResponse(409, "Illegal Argument Message");
    }

    public static GlobalResponse user_not_found() {
        return new GlobalResponse(404, "User Not Found");
    }

    public static GlobalResponse server_busy() {
        return new GlobalResponse(40005, "服务器繁忙");
    }

    public static GlobalResponse params_not_found() {
        return new GlobalResponse(404, "Params Not Found");
    }

    public static GlobalResponse data_not_found() {
        return new GlobalResponse(201, "Data Not Found");
    }
}
