package com.winter.spring.notice;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/notice/*")
public class NoticeController {

	@RequestMapping(value = "list", method = RequestMethod.GET)
	public void getlist() throws Exception {

	}

}
