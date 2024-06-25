package com.winter.spring.departments;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/department/**") // **은 폴더 까지 전부 department로 시작하는 것들 일로와라~ 의미 밑에 애들은 나머지 경로를 적어주면 됨
public class DepartmentController {

	// IOC (Inversion Of control
	// 객체 생성, 메서드 호출
	// 객체 생성 어노테이션
	/*
	 * 1. controller(Controller) 2. service(Service) 3. repository(DAO) 4.
	 * component(위 세가지가 아닌 그외의 것에 주는 어노테이션)
	 */
	@Autowired
	private DepartmentService departmentService;

	// 어떤 url이 왔을 때 수행하라는 어노테이션(설명과 실행)
	@RequestMapping(value = "list", method = RequestMethod.GET)
	public void getList() throws Exception {
		System.out.println("department list");
//		return "department/list"; 리턴해주는 url이 없으면 url을 jsp주소로 대체한다. 

		departmentService.getList();
	}

}
