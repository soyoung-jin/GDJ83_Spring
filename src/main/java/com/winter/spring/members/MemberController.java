package com.winter.spring.members;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CookieValue;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/member/*")
public class MemberController {
	@Autowired
	private MemberService memberService;

	@RequestMapping(value = "join", method = RequestMethod.GET)
	public void join() throws Exception {
	}

	@RequestMapping(value = "join", method = RequestMethod.POST)
	public String setJoin(MemberDTO memberDTO) throws Exception {

		int result = memberService.join(memberDTO);

		return "redirect:/";
	}

	@RequestMapping(value = "login", method = RequestMethod.GET) // 기억하고 있는 쿠키를 출력해서 jsp로 보냄
	public String login(HttpServletRequest request,
			@CookieValue(name = "remember", required = false, defaultValue = "") String value) throws Exception {

		Cookie[] cookies = request.getCookies();
		for (Cookie c : cookies) {
			if (c.getName().equals("remeber")) {
				request.setAttribute("id", c.getValue());
			}

		}
		return "redirect:/";

	}

	@RequestMapping(value = "login", method = RequestMethod.POST) // 쿠키를 만들어서 집어넣음
	public String login(MemberDTO memberDTO, HttpServletResponse response, String remember) throws Exception {

		if (remember != null) {
			Cookie cookie = new Cookie("remember", memberDTO.getId());
			cookie.setMaxAge(60);
			response.addCookie(cookie);
		} else {
			Cookie cookie = new Cookie("remember", "");
			cookie.setMaxAge(60);
			response.addCookie(cookie);
		}

		memberDTO = memberService.login(memberDTO);
		if (memberDTO != null) {

		} else {

		}

		return "redirect:/";
	}

}