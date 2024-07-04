package com.winter.spring.product;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProductService {

	@Autowired
	private ProductDAO productDAO;

	public List<ProductDTO> getList() throws Exception {
		return productDAO.getList();
	}

	public ProductDTO getDetail(ProductDTO productdto) throws Exception {
		return productDAO.getDetail(productdto);
	}

	public int add(ProductDTO productdto) throws Exception {
		return productDAO.add(productdto);
	}

	public int update(ProductDTO productdto) throws Exception {
		return productDAO.update(productdto);
	}

	public int delete(ProductDTO productdto) throws Exception {
		return productDAO.delete(productdto);
	}

}
