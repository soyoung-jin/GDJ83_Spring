package com.winter.spring.departments;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service // 클래스의 객체를 만들어달라는 어노테이션
public class DepartmentService {

	@Autowired
	private DepartmentDAO departmentDAO;

	public List<DepartmentDTO> getList() throws Exception {
		return departmentDAO.getList();
	}

	public DepartmentDTO getDetail(int num) throws Exception {
		return departmentDAO.getDetail(num);
	}

	public int add(DepartmentDTO departmentDTO) throws Exception {
		return 0;

	}
}