package com.charlie.ctmpas.controller.prescription;

import com.charlie.ctmpas.entity.PatientInfo;
import com.charlie.ctmpas.entity.OperationInfo;
import com.charlie.ctmpas.service.PatientInfoService;
import com.charlie.ctmpas.service.OperationInfoService;
import com.macro.mall.common.api.CommonPage;
import com.macro.mall.common.api.CommonResult;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * 单位管理Controller
 * Created by macro on 2018/4/26.
 */
@Controller
@Api(tags = "OperationInfoController", description = "症状管理")
@RequestMapping("/operation")
public class OperationInfoController {
    @Autowired
    private PatientInfoService patientInfoService;

    @Autowired
    private OperationInfoService operationInfoService;

    @ApiOperation("分页获取所有单位属性")
    @RequestMapping(value = "/list", method = RequestMethod.GET)
    @ResponseBody
    public CommonResult<CommonPage<PatientInfo>> getList(@RequestParam(defaultValue = "5") Integer pageSize, @RequestParam(defaultValue = "1") Integer pageNum) {
        List<PatientInfo> patientInfos = patientInfoService.getList(pageSize, pageNum);
        return CommonResult.success(CommonPage.restPage(patientInfos));
    }

    @ApiOperation("获取所有单位属性")
    @RequestMapping(value = "/allList", method = RequestMethod.GET)
    @ResponseBody
    public CommonResult<CommonPage<OperationInfo>> getList() {
        List<OperationInfo> patientInfos = operationInfoService.getAllList();
        return CommonResult.success(CommonPage.restPage(patientInfos));
    }
}
