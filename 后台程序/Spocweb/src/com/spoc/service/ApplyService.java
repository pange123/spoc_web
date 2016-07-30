package com.spoc.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spoc.dao.ApplyDao;
import com.spoc.po.Apply;

@Service("applyService")
public class ApplyService {

	@Autowired
	private ApplyDao applyDao;
	
    public void userApply(Apply apply)
    {
    	applyDao.doApply(apply);
    }
}
