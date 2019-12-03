package com.ustglobal.rms.dao;

import com.ustglobal.rms.dto.OrderBean;
import com.ustglobal.rms.dto.ProductBean;
import com.ustglobal.rms.dto.RetailerBean;

public interface RMSDAO {
	public RetailerBean login(int id, String password);
	public boolean changePassword(int id,String password);
	public int register(RetailerBean bean);
	public ProductBean searchId(int id);
	public OrderBean DisplayOrder(int id);
	boolean add(ProductBean bean,int qty,int rid);
}
