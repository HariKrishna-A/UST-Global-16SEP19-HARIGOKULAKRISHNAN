package com.ustglobal.rms.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ustglobal.rms.dao.RMSDAO;
import com.ustglobal.rms.dto.OrderBean;
import com.ustglobal.rms.dto.ProductBean;
import com.ustglobal.rms.dto.RetailerBean;

@Service
public class RMSServiceIMPL implements RMSService{
	@Autowired
	private RMSDAO dao;
	
	@Override
	public RetailerBean login(int id, String password) {
		return dao.login(id, password);
	}

	@Override
	public boolean changePassword(int id, String password) {
		return dao.changePassword(id, password);
	}

	@Override
	public int register(RetailerBean bean) {
		return dao.register(bean);
	}

	@Override
	public ProductBean searchId(int id) {
		return dao.searchId(id);
	}

	@Override
	public OrderBean DisplayOrder(int id) {
		return dao.DisplayOrder(id);
	}

}
