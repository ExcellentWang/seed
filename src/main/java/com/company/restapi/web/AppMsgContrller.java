package com.company.restapi.web;

import com.company.common.constant.BaseConstant;
import com.company.restapi.core.Result;
import com.company.restapi.core.ResultGenerator;
import com.company.restapi.model.IntelDevice;
import com.company.restapi.model.UserDevice;
import com.company.restapi.service.MessageService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.Map;

/**
 * com.company.restapi.web
 *
 * @author Wang
 * @create 2018-02-03 上午10:47
 * @description:
 **/
@RestController
public class AppMsgContrller {
@Resource
private MessageService messageService;

    @PostMapping("/information/getNewList")
    public Result bindingDevice() {
        try {
            Map<Object, Object> objectObjectMap = messageService.getMsgList();
            return ResultGenerator.genSuccessResult(objectObjectMap);
        } catch (Exception e) {
            e.printStackTrace();
            return ResultGenerator.genFailResult(BaseConstant.controllerErrorMsg);
        }
    }
}
