package com.winter.spring.accounts;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.winter.spring.members.MemberDTO;

@Controller
@RequestMapping("/account/*")
public class AccountController {
	@Autowired
	private AccountService accountService;

	@RequestMapping(value = "add", method = RequestMethod.GET)
	public String add(AccountDTO accountDTO, HttpSession session) throws Exception {
		String name = ((MemberDTO) session.getAttribute("member")).getId();
		accountDTO.setId(name);
		int result = accountService.add(accountDTO);

		return "redirect:/";

	}
}
