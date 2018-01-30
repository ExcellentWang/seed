package com.company.restapi.web;
import com.company.restapi.core.Result;
import com.company.restapi.core.ResultGenerator;
import com.company.restapi.model.DeviceRuntimeInfo;
import com.company.restapi.service.DeviceRuntimeInfoService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

/**
* Created by CodeGenerator on 2018/01/30.
*/
@RestController
@RequestMapping("/device/runtime/info")
public class DeviceRuntimeInfoController {
    @Resource
    private DeviceRuntimeInfoService deviceRuntimeInfoService;

    @PostMapping("/add")
    public Result add(DeviceRuntimeInfo deviceRuntimeInfo) {
        deviceRuntimeInfoService.save(deviceRuntimeInfo);
        return ResultGenerator.genSuccessResult();
    }

    @PostMapping("/delete")
    public Result delete(@RequestParam Integer id) {
        deviceRuntimeInfoService.deleteById(id);
        return ResultGenerator.genSuccessResult();
    }

    @PostMapping("/update")
    public Result update(DeviceRuntimeInfo deviceRuntimeInfo) {
        deviceRuntimeInfoService.update(deviceRuntimeInfo);
        return ResultGenerator.genSuccessResult();
    }

    @PostMapping("/detail")
    public Result detail(@RequestParam Integer id) {
        DeviceRuntimeInfo deviceRuntimeInfo = deviceRuntimeInfoService.findById(id);
        return ResultGenerator.genSuccessResult(deviceRuntimeInfo);
    }

    @PostMapping("/list")
    public Result list(@RequestParam(defaultValue = "0") Integer page, @RequestParam(defaultValue = "0") Integer size) {
        PageHelper.startPage(page, size);
        List<DeviceRuntimeInfo> list = deviceRuntimeInfoService.findAll();
        PageInfo pageInfo = new PageInfo(list);
        return ResultGenerator.genSuccessResult(pageInfo);
    }
}
