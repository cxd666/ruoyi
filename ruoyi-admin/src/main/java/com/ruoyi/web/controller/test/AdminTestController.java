package com.ruoyi.web.controller.test;


import com.ruoyi.common.core.controller.BaseController;
import com.ruoyi.test.service.AdminTestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;


@Controller
@RequestMapping("/admin/test")
public class AdminTestController extends BaseController{


    private String prefix = "admin/test";


    @Resource
    private AdminTestService adminTestService;

//    @RequiresPermissions("admin:test:view")
    @GetMapping("/1")
    public String test()
    {
        adminTestService.helloTest();
        return "test";
    }

}



