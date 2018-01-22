package com.company.restapi.web.generator;
import com.company.restapi.core.Result;
import com.company.restapi.core.ResultGenerator;
import com.company.restapi.model.InformationUserDel;
import com.company.restapi.service.InformationUserDelService;
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
@RequestMapping("/information/user/del")
public class InformationUserDelController {
    @Resource
    private InformationUserDelService informationUserDelService;

    @PostMapping("/add")
    public Result add(InformationUserDel informationUserDel) {
        informationUserDelService.save(informationUserDel);
        return ResultGenerator.genSuccessResult();
    }

    @PostMapping("/delete")
    public Result delete(@RequestParam Integer id) {
        informationUserDelService.deleteById(id);
        return ResultGenerator.genSuccessResult();
    }

    @PostMapping("/update")
    public Result update(InformationUserDel informationUserDel) {
        informationUserDelService.update(informationUserDel);
        return ResultGenerator.genSuccessResult();
    }

    @PostMapping("/detail")
    public Result detail(@RequestParam Integer id) {
        InformationUserDel informationUserDel = informationUserDelService.findById(id);
        return ResultGenerator.genSuccessResult(informationUserDel);
    }

    @PostMapping("/list")
    public Result list(@RequestParam(defaultValue = "0") Integer page, @RequestParam(defaultValue = "0") Integer size) {
        PageHelper.startPage(page, size);
        List<InformationUserDel> list = informationUserDelService.findAll();
        PageInfo pageInfo = new PageInfo(list);
        return ResultGenerator.genSuccessResult(pageInfo);
    }
}
