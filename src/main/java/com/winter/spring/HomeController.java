package com.winter.spring;

import java.util.Locale;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
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
	public String home(Locale locale, Model model) {

//		Robot robot = new Robot();
//		RightArm rm = new RightArm();
//
//		robot.setRightArm(rm);

		// 로봇은 오른팔에 의존적이다. = dependency
		// 주입한다 injection
		// 이 둘을 합쳐서 dependency injection 이라고 함. 의존성 주입

		// 이 일들을 스프링 컨테이너한테 위임 및 요청함 - 이걸 어노테이션으로 설명해줌
		// 이것을 IOC라고 함, inversion object
		// 각 어노테이션이 모아진 것들을 spring pool이라고 함,이것을 관리하는 것이 컨테이너.

		return "index";
	}

}
