package com.zuoan.po;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

@Data
@ApiModel(value = "配置管理Dto ", description = "cb_gateway_config表")
public class NasConfigEntity {

    @ApiModelProperty(value = "主键")
    private Long id;

    @ApiModelProperty(value = "nas地址")
    private String nasUrl;

    @ApiModelProperty(value = "nas存储目录")
    private String nasDataPath;
}
