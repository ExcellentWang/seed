package com.company.restapi.web;
import com.company.restapi.core.Result;
import com.company.restapi.core.ResultGenerator;
import com.company.restapi.model.IntelDevice;
import com.company.restapi.service.IntelDeviceService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

/**
* Created by CodeGenerator on 2018/01/22.
*/
@RestController
@RequestMapping("/intel/device")
public class IntelDeviceController {
    @Resource
    private IntelDeviceService intelDeviceService;

    @PostMapping("/add")
    public Result add(IntelDevice intelDevice) {
        intelDeviceService.save(intelDevice);
        return ResultGenerator.genSuccessResult();
    }

    @PostMapping("/delete")
    public Result delete(@RequestParam Integer id) {
        intelDeviceService.deleteById(id);
        return ResultGenerator.genSuccessResult();
    }

    @PostMapping("/update")
    public Result update(IntelDevice intelDevice) {
        intelDeviceService.update(intelDevice);
        return ResultGenerator.genSuccessResult();
    }

    @PostMapping("/detail")
    public Result detail(@RequestParam Integer id) {
        IntelDevice intelDevice = intelDeviceService.findById(id);
        return ResultGenerator.genSuccessResult(intelDevice);
    }

    @PostMapping("/list")
    public Result list(@RequestParam(defaultValue = "0") Integer page, @RequestParam(defaultValue = "0") Integer size) {
        PageHelper.startPage(page, size);
        List<IntelDevice> list = intelDeviceService.findAll();
        PageInfo pageInfo = new PageInfo(list);
        return ResultGenerator.genSuccessResult(pageInfo);
    }
}
