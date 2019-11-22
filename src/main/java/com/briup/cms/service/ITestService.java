package com.briup.cms.service;

import java.util.List;

import com.briup.cms.bean.Test;

public interface ITestService {
	void saveOrUpdate(Test test);
	List<Test> findAll();

}
