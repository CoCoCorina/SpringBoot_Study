package com.example.water_fee.controller;

import com.example.water_fee.service.AdminInfoService;
import com.example.water_fee.vo.AdminInfoVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;


@RestController
@ResponseBody
@RequestMapping("/adminInfo")
public class AdminInfoHandler {

    @Autowired
    private AdminInfoService adminInfoService;

    @GetMapping("/adminInfoFindAll")
    public AdminInfoVO adminInfoFindAll() throws Exception {
        return adminInfoService.findAdminInfoVO();
    }
}
