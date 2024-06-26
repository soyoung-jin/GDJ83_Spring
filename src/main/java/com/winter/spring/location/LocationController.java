package com.winter.spring.location;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/location/**")
public class LocationController {

	@Autowired
	private LocationService locationService;

	// 어떤 url이 왔을 때 수행하라는 어노테이션(설명과 실행)
	@RequestMapping(value = "list", method = RequestMethod.GET)
	public void getList(Model model) throws Exception {
		System.out.println("location list");
//		return "department/list"; 리턴해주는 url이 없으면 url을 jsp주소로 대체한다. 

		List<LocationDTO> ar = locationService.getList();

//		ModelAndView mw = ModelAndView();
//		mv.addObject("list", ar);
//		my.setViewName("department/list");
//		
//		return mv;

		model.addAttribute("list", ar); // 속성명와 값을 함께 보냄

	}

	@RequestMapping("detail")
	public void getDetail(Model model, int location_id) throws Exception {
		// 파라미터 명과 일치하고 숫자형태가 되어 있는 애를 찾아서 넣어줌
		// 형변환 할 필요없이 그대로 넣어주면 됨. 개발자들은 핵심 로직에만 신경쓰면 됨.
		// @RequestParam(name = "num"), defaultValue="10"num으로 오는 애를 department_id로
		// 보내달라는 뜻
		LocationDTO locationDTO = locationService.getDetail(location_id);
		model.addAttribute("dto", locationDTO);
	}
}
