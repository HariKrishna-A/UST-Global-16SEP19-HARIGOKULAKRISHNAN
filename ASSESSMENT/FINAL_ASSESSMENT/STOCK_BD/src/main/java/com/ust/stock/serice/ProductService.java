package com.ust.stock.serice;

import java.util.List;

import com.ust.stock.dto.OrderInfo;
import com.ust.stock.dto.ProductsInfo;
public interface ProductService {
	public ProductsInfo searchProductById(int pid);
	public boolean modifyProduct(ProductsInfo info);
	public boolean addProduct(ProductsInfo info);
	public boolean addToCart(ProductsInfo info);
	public List<ProductsInfo> getAllProducts();
	public List<OrderInfo> getFromCart();
	
}
