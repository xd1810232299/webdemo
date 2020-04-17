package com.example.webdemo.controller;

import com.example.webdemo.entity.DemoData;
import com.pig4cloud.plugin.excel.annotation.ResponseExcel;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

/**
 *
 *@author yxzd
 *@description easyexcel
 *@date 2020/4/17
 */
@RestController
public class ExportController {

    @ResponseExcel(name = "lengleng", sheet = "demoList")
    @RequestMapping("/e1")
    public List<DemoData> e1() {
        List<DemoData> dataList = new ArrayList<>();
        for (int i = 0; i < 100; i++) {
            DemoData data = new DemoData();
            data.setUsername("tr1" + i);
            data.setPassword("tr2" + i);
            dataList.add(data);
        }
        return dataList;
    }


}
