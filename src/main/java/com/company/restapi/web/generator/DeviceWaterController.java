package com.company.restapi.web.generator;
import com.company.restapi.core.Result;
import com.company.restapi.core.ResultGenerator;
import com.company.restapi.model.DeviceWater;
import com.company.restapi.service.DeviceWaterService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

/**
* Created by CodeGenerator on 2018/01/18.
*/
@RestController
@RequestMapping("/device/water")
public class DeviceWaterController {
    @Resource
    private DeviceWaterService deviceWaterService;

    @PostMapping("/add")
    public Result add(DeviceWater deviceWater) {
        deviceWaterService.save(deviceWater);
        return ResultGenerator.genSuccessResult();
    }

    @PostMapping("/delete")
    public Result delete(@RequestParam Integer id) {
        deviceWaterService.deleteById(id);
        return ResultGenerator.genSuccessResult();
    }

    @PostMapping("/update")
    public Result update(DeviceWater deviceWater) {
        deviceWaterService.update(deviceWater);
        return ResultGenerator.genSuccessResult();
    }

    @PostMapping("/detail")
    public Result detail(@RequestParam Integer id) {
        DeviceWater deviceWater = deviceWaterService.findById(id);
        return ResultGenerator.genSuccessResult(deviceWater);
    }

    @PostMapping("/list")
    public Result list(@RequestParam(defaultValue = "0") Integer page, @RequestParam(defaultValue = "0") Integer size) {
        PageHelper.startPage(page, size);
        List<DeviceWater> list = deviceWaterService.findAll();
        PageInfo pageInfo = new PageInfo(list);
        return ResultGenerator.genSuccessResult(pageInfo);
    }
}
