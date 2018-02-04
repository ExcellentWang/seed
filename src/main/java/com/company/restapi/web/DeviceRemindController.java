package com.company.restapi.web;
import com.company.restapi.core.Result;
import com.company.restapi.core.ResultGenerator;
import com.company.restapi.model.DeviceRemind;
import com.company.restapi.service.DeviceRemindService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

/**
* Created by CodeGenerator on 2018/02/03.
*/
@RestController
@RequestMapping("/device/remind")
public class DeviceRemindController {
    @Resource
    private DeviceRemindService deviceRemindService;

    @PostMapping("/add")
    public Result add(DeviceRemind deviceRemind) {
        deviceRemindService.save(deviceRemind);
        return ResultGenerator.genSuccessResult();
    }

    @PostMapping("/delete")
    public Result delete(@RequestParam Integer id) {
        deviceRemindService.deleteById(id);
        return ResultGenerator.genSuccessResult();
    }

    @PostMapping("/update")
    public Result update(DeviceRemind deviceRemind) {
        deviceRemindService.update(deviceRemind);
        return ResultGenerator.genSuccessResult();
    }

    @PostMapping("/detail")
    public Result detail(@RequestParam Integer id) {
        DeviceRemind deviceRemind = deviceRemindService.findById(id);
        return ResultGenerator.genSuccessResult(deviceRemind);
    }

    @PostMapping("/list")
    public Result list(@RequestParam(defaultValue = "0") Integer page, @RequestParam(defaultValue = "0") Integer size) {
        PageHelper.startPage(page, size);
        List<DeviceRemind> list = deviceRemindService.findAll();
        PageInfo pageInfo = new PageInfo(list);
        return ResultGenerator.genSuccessResult(pageInfo);
    }
}
