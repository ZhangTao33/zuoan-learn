package com.zuoan.controller;

import com.zuoan.api.AssembleApi;
import com.zuoan.api.common.ReturnResult;
import com.zuoan.po.NasConfigEntity;

public class AssembleController implements AssembleApi {
    @Override
    public ReturnResult<NasConfigEntity> getNasInfo() {
        return ReturnResult.success("success");
    }
}
