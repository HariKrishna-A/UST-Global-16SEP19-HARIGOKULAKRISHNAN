package com.ustglobal.assessmentboot.dao;

import java.util.List;

import com.ustglobal.assessmentboot.dto.OrderInfo;
import com.ustglobal.assessmentboot.dto.ProductsInfo;

public interface ProductDAO {
	public ProductsInfo searchProductById(int pid);
	public boolean modifyProduct(ProductsInfo info);
	public boolean addProduct(ProductsInfo info);
	public List<ProductsInfo> getAllProducts();
	public boolean addToCart(ProductsInfo info);
	public List<OrderInfo> getFromCart();
}
