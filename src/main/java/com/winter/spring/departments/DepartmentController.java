package com.winter.spring.departments;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
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
	public void getList(Model model) throws Exception {
		System.out.println("department list");
//		return "department/list"; 리턴해주는 url이 없으면 url을 jsp주소로 대체한다. 

		List<DepartmentDTO> ar = departmentService.getList();

//		ModelAndView mw = ModelAndView();
//		mv.addObject("list", ar);
//		my.setViewName("department/list");
//		
//		return mv;

		model.addAttribute("list", ar); // 속성명와 값을 함께 보냄
		List<Map<String, Object>> list = departmentService.getInfo();
		model.addAttribute("info", list);

	}

//	@RequestMapping(value = "detail", method = RequestMethod.GET)
//	method = RequestMethod.GET 안쓰면 기본이 get

	@RequestMapping("detail")
	public String getDetail(Model model, int department_id) throws Exception {
		// 파라미터 명과 일치하고 숫자형태가 되어 있는 애를 찾아서 넣어줌
		// 형변환 할 필요없이 그대로 넣어주면 됨. 개발자들은 핵심 로직에만 신경쓰면 됨.
		// @RequestParam(name = "num"), defaultValue="10"num으로 오는 애를 department_id로
		// 보내달라는 뜻

		DepartmentDTO departmentDTO = departmentService.getDetail(department_id);

		String path = "commons/message";
		if (departmentDTO != null) {

			model.addAttribute("dto", departmentDTO);
			path = "department/detail";

		} else {
			model.addAttribute("result", "부서를 찾을 수 없습니다.");
			model.addAttribute("url", "./list");
		}

		return path;
	}

	// add
	@RequestMapping(value = "add", method = RequestMethod.GET)
	public void add() {
	}

	@RequestMapping(value = "add", method = RequestMethod.POST)
	public String add(DepartmentDTO departmentDTO, Model model) throws Exception {

		int result = departmentService.add(departmentDTO);
		String url = "";
		if (result > 0) {
			url = "redirect:/";//
		} else {
			url = "commons/message";
			model.addAttribute("result", "부서 등록에 실패");
			model.addAttribute("url", "./list");
		}

		return url;

	}

	// delete
	@RequestMapping("delete")
	public String delete(DepartmentDTO departmentDTO, Model model) throws Exception {
		int result = departmentService.delete(departmentDTO);
		String url = "commons/message";
		if (result > 0) {
			url = "redirect:list";
		} else {
			model.addAttribute("result", "삭제 실패");
			model.addAttribute("url", "list");
		}

		return url;
	}

	// update
	@RequestMapping("update")
	public String update(int department_id, Model model) throws Exception {
		DepartmentDTO departmentDTO = departmentService.getDetail(department_id);
		String url = "commons/message";
		if (departmentDTO != null) {
			model.addAttribute("dto", departmentDTO);
			url = "department/update";
		} else {
			model.addAttribute("result", "없는 부서");
			model.addAttribute("url", "list");
		}

		return url;
	}

	@RequestMapping(value = "update", method = RequestMethod.POST)
	public String update(DepartmentDTO departmentDTO) throws Exception {
		int result = departmentService.update(departmentDTO);

		return "redirect:list";
	}

}