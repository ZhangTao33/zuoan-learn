package com.zuoan.api;

import com.zuoan.api.common.ReturnResult;
import com.zuoan.po.NasConfigEntity;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Api(value = "脚手架-基础配置", tags = {"脚手架-基础配置"})
@RequestMapping("api/v1/configs")
public interface AssembleApi {
    @ApiOperation(value = "网关配置-查询nas项")
    @GetMapping("/queryNasInfo")
    ReturnResult<NasConfigEntity> getNasInfo();
}
