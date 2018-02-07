package com.company.restapi.web;
import com.company.restapi.core.Result;
import com.company.restapi.core.ResultGenerator;
import com.company.restapi.model.DeviceOfflineInfo;
import com.company.restapi.service.DeviceOfflineInfoService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

/**
* Created by CodeGenerator on 2018/02/05.
*/
@RestController
@RequestMapping("/device/offline/info")
public class DeviceOfflineInfoController {
    @Resource
    private DeviceOfflineInfoService deviceOfflineInfoService;

    @PostMapping("/add")
    public Result add(DeviceOfflineInfo deviceOfflineInfo) {
        deviceOfflineInfoService.save(deviceOfflineInfo);
        return ResultGenerator.genSuccessResult();
    }

    @PostMapping("/delete")
    public Result delete(@RequestParam Integer id) {
        deviceOfflineInfoService.deleteById(id);
        return ResultGenerator.genSuccessResult();
    }

    @PostMapping("/update")
    public Result update(DeviceOfflineInfo deviceOfflineInfo) {
        deviceOfflineInfoService.update(deviceOfflineInfo);
        return ResultGenerator.genSuccessResult();
    }

    @PostMapping("/detail")
    public Result detail(@RequestParam Integer id) {
        DeviceOfflineInfo deviceOfflineInfo = deviceOfflineInfoService.findById(id);
        return ResultGenerator.genSuccessResult(deviceOfflineInfo);
    }

    @PostMapping("/list")
    public Result list(@RequestParam(defaultValue = "0") Integer page, @RequestParam(defaultValue = "0") Integer size) {
        PageHelper.startPage(page, size);
        List<DeviceOfflineInfo> list = deviceOfflineInfoService.findAll();
        PageInfo pageInfo = new PageInfo(list);
        return ResultGenerator.genSuccessResult(pageInfo);
    }
}
