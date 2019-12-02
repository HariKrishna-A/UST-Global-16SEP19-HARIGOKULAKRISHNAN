package com.ustglobal.rms.service;

import com.ustglobal.rms.dto.OrderBean;
import com.ustglobal.rms.dto.ProductBean;
import com.ustglobal.rms.dto.RetailerBean;

public interface RMSService {
	public RetailerBean login(int id, String password);
	public boolean changePassword(int id,String password);
	public int register(RetailerBean bean);
	public ProductBean searchId(int id);
	public OrderBean DisplayOrder(int id);
}
