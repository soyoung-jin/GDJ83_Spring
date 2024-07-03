package com.winter.spring.product;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/product/*")
public class ProductController {

//	@Autowired
//	private ProductService productService;
//
//	@RequestMapping(value = "list", method = RequestMethod.GET)
//	public void getList(Model model) throws Exception {
//		System.out.println("product list");
//		List<ProductDTO> ar = productService.getList();
//
//		model.addAttribute("list", ar);
//		
//
//		List<Map<String, Object>> list = departmentService.getInfo();
//
//		model.addAttribute("info", list);
//
//
//	}
//	
//	@RequestMapping("detail")
//	// @RequestParam(name = "num", defaultValue = "10") int department_id
//	public String getDetail(Model model, int department_id) throws Exception {
//
//		DepartmentDTO departmentDTO = departmentService.getDetail(department_id);
//
//		String path = "commons/message";
//
//		if (departmentDTO != null) {
//			model.addAttribute("dto", departmentDTO);
//			path = "department/detail";
//		} else {
//			model.addAttribute("result", "부서를 찾을 수 없다");
//			model.addAttribute("url", "./list");
//		}
//
//		return path;
//
//	}
//
//	@RequestMapping(value = "add", method = RequestMethod.GET)
//	public void add() {
//	}
//
//	@RequestMapping(value = "add", method = RequestMethod.POST)
//	public String add(DepartmentDTO departmentDTO, Model model) throws Exception {
//
//		int result = departmentService.add(departmentDTO);
//		String url = "";
//		if (result > 0) {
//			url = "redirect:/";//
//		} else {
//			url = "commons/message";
//			model.addAttribute("result", "부서 등록에 실패");
//			model.addAttribute("url", "./list");
//		}
//
//		return url;
//
//	}
}
