package com.briup.cms.web.controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.briup.cms.bean.Test;
import com.briup.cms.service.ITestService;

@RestController
@RequestMapping("/test")
public class TestController {
	
	    @Autowired
	    private ITestService testService;

	    @GetMapping(value = "findAll")
	    public List<Test> findAll(){
	        return testService.findAll();
	    }

	    @PostMapping(value = "saveOrUpdate")
	    public String saveOrUpdate(Test test){
	        // 调用service,完成保存
	        testService.saveOrUpdate(test);
	        return "保存成功";
	    }
}
