package com.company.restapi.web.generator;
import com.company.restapi.core.Result;
import com.company.restapi.core.ResultGenerator;
import com.company.restapi.model.InformationDatatype;
import com.company.restapi.service.InformationDatatypeService;
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
@RequestMapping("/information/datatype")
public class InformationDatatypeController {
    @Resource
    private InformationDatatypeService informationDatatypeService;

    @PostMapping("/add")
    public Result add(InformationDatatype informationDatatype) {
        informationDatatypeService.save(informationDatatype);
        return ResultGenerator.genSuccessResult();
    }

    @PostMapping("/delete")
    public Result delete(@RequestParam Integer id) {
        informationDatatypeService.deleteById(id);
        return ResultGenerator.genSuccessResult();
    }

    @PostMapping("/update")
    public Result update(InformationDatatype informationDatatype) {
        informationDatatypeService.update(informationDatatype);
        return ResultGenerator.genSuccessResult();
    }

    @PostMapping("/detail")
    public Result detail(@RequestParam Integer id) {
        InformationDatatype informationDatatype = informationDatatypeService.findById(id);
        return ResultGenerator.genSuccessResult(informationDatatype);
    }

    @PostMapping("/list")
    public Result list(@RequestParam(defaultValue = "0") Integer page, @RequestParam(defaultValue = "0") Integer size) {
        PageHelper.startPage(page, size);
        List<InformationDatatype> list = informationDatatypeService.findAll();
        PageInfo pageInfo = new PageInfo(list);
        return ResultGenerator.genSuccessResult(pageInfo);
    }
}
