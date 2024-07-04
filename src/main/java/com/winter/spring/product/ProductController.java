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
	public String getDetail(Model model, ProductDTO productdto) throws Exception {

		ProductDTO productDTO = productService.getDetail(productdto);

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

	@RequestMapping(value = "add", method = RequestMethod.GET)
	public String add() throws Exception {
		return "product/form";
	}

	@RequestMapping(value = "add", method = RequestMethod.POST)
	public String add(ProductDTO productDTO) throws Exception {

		int result = productService.add(productDTO);

		return "redirect:./list";
	}

	@RequestMapping(value = "update", method = RequestMethod.GET)
	public String update(ProductDTO productDTO, Model model) throws Exception {
		productDTO = productService.getDetail(productDTO);
		model.addAttribute("dto", productDTO);
		return "product/form";
	}

	@RequestMapping(value = "update", method = RequestMethod.POST)
	public String update(ProductDTO productDTO) throws Exception {
		int result = productService.update(productDTO);
		return "redirect:./list";
	}

	@RequestMapping(value = "delete", method = RequestMethod.GET)
	public String delete(ProductDTO productDTO) throws Exception {
		int result = productService.delete(productDTO);
		return "redirect:./list";
	}

}
