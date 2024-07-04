package com.winter.spring;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Handles requests for the application home page.
 */
@Controller
public class HomeController {

	private static final Logger logger = LoggerFactory.getLogger(HomeController.class);

	/**
	 * Simply selects the home view to render by returning its name.
	 */
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String home(HttpServletRequest request) {
		System.out.println("go");
		// 내장객체
		// 하위 -> 상위O
		// 상위 -> 하위 X
		HttpSession session = request.getSession();
//		session.getServletContext();

//		Cookie[] cookies = request.getCookies();
//		for (Cookie c : cookies) {
//			System.out.println(c.getName());
//			System.out.println(c.getValue());
//		}

//		Cookie cookie = new Cookie("t", "hi");
//		cookie.setMaxAge(60);
//		reponse.addCookie(cookie);
//		// 응답오면 내보냄
//		// 쿠키를 클라이언트한테 보내줘야 함

		return "index";
	}

}
