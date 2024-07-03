package com.winter.spring.product;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/product/*")
public class ProductController {

	@Autowired
	private ProductService productService;

	@RequestMapping(value = "list", method = RequestMethod.GET)
	public void getList(Model model) throws Exception {
		System.out.println("product list");
		List<ProductDTO> ar = productService.getList();

		model.addAttribute("list", ar);

	}

	@RequestMapping("detail")
	// @RequestParam(name = "num", defaultValue = "10") int department_id
	public String getDetail(Model model, int p_code) throws Exception {

		ProductDTO productDTO = ProductService.getDetail(p_code);

		String path = "commons/message";

		if (productDTO != null) {
			model.addAttribute("dto", productDTO);
			path = "product/detail";
		} else {
			model.addAttribute("result", "부서를 찾을 수 없다");
			model.addAttribute("url", "./list");
		}

		return path;

	}

}
