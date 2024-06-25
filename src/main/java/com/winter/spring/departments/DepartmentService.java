package com.winter.spring.departments;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository // 클래스의 객체를 만들어달라는 어노테이션
public class DepartmentService {
	@Autowired // 만들어진 객체의 타입을 알아서 찾아주라는 어노테이션
	private DepartmentDAO departmentDAO;

	public List<DepartmentDTO> getList() throws Exception {
		return departmentDAO.getList();
	}

}
