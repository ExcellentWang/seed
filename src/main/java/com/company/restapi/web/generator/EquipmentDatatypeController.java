package com.company.restapi.web.generator;
import com.company.restapi.core.Result;
import com.company.restapi.core.ResultGenerator;
import com.company.restapi.model.EquipmentDatatype;
import com.company.restapi.service.EquipmentDatatypeService;
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
@RequestMapping("/equipment/datatype")
public class EquipmentDatatypeController {
    @Resource
    private EquipmentDatatypeService equipmentDatatypeService;

    @PostMapping("/add")
    public Result add(EquipmentDatatype equipmentDatatype) {
        equipmentDatatypeService.save(equipmentDatatype);
        return ResultGenerator.genSuccessResult();
    }

    @PostMapping("/delete")
    public Result delete(@RequestParam Integer id) {
        equipmentDatatypeService.deleteById(id);
        return ResultGenerator.genSuccessResult();
    }

    @PostMapping("/update")
    public Result update(EquipmentDatatype equipmentDatatype) {
        equipmentDatatypeService.update(equipmentDatatype);
        return ResultGenerator.genSuccessResult();
    }

    @PostMapping("/detail")
    public Result detail(@RequestParam Integer id) {
        EquipmentDatatype equipmentDatatype = equipmentDatatypeService.findById(id);
        return ResultGenerator.genSuccessResult(equipmentDatatype);
    }

    @PostMapping("/list")
    public Result list(@RequestParam(defaultValue = "0") Integer page, @RequestParam(defaultValue = "0") Integer size) {
        PageHelper.startPage(page, size);
        List<EquipmentDatatype> list = equipmentDatatypeService.findAll();
        PageInfo pageInfo = new PageInfo(list);
        return ResultGenerator.genSuccessResult(pageInfo);
    }
}
