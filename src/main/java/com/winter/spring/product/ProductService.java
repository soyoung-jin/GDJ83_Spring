package com.winter.spring.product;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProductService {

	@Autowired
	private ProductDAO productDAO;

//	public List<ProductDTO> getList() throws Exception {
//		return productDAO.getList();
//	}
//
//	public DepartmentDTO getDetail(int num) throws Exception {
//		return departmentDAO.getDetail(num);
//	}
//
//	public int add(DepartmentDTO departmentDTO) throws Exception {
//		return departmentDAO.add(departmentDTO);
//	}
//
//	public List<Map<String, Object>> getInfo() throws Exception {
//		return departmentDAO.getInfo();
//	}

}
