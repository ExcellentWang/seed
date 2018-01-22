package com.company.restapi.web.generator;
import com.company.restapi.core.Result;
import com.company.restapi.core.ResultGenerator;
import com.company.restapi.model.AlarmDatatype;
import com.company.restapi.service.AlarmDatatypeService;
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
@RequestMapping("/alarm/datatype")
public class AlarmDatatypeController {
    @Resource
    private AlarmDatatypeService alarmDatatypeService;

    @PostMapping("/add")
    public Result add(AlarmDatatype alarmDatatype) {
        alarmDatatypeService.save(alarmDatatype);
        return ResultGenerator.genSuccessResult();
    }

    @PostMapping("/delete")
    public Result delete(@RequestParam Integer id) {
        alarmDatatypeService.deleteById(id);
        return ResultGenerator.genSuccessResult();
    }

    @PostMapping("/update")
    public Result update(AlarmDatatype alarmDatatype) {
        alarmDatatypeService.update(alarmDatatype);
        return ResultGenerator.genSuccessResult();
    }

    @PostMapping("/detail")
    public Result detail(@RequestParam Integer id) {
        AlarmDatatype alarmDatatype = alarmDatatypeService.findById(id);
        return ResultGenerator.genSuccessResult(alarmDatatype);
    }

    @PostMapping("/list")
    public Result list(@RequestParam(defaultValue = "0") Integer page, @RequestParam(defaultValue = "0") Integer size) {
        PageHelper.startPage(page, size);
        List<AlarmDatatype> list = alarmDatatypeService.findAll();
        PageInfo pageInfo = new PageInfo(list);
        return ResultGenerator.genSuccessResult(pageInfo);
    }
}
