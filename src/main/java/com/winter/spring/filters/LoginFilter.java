package com.winter.spring.filters;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;

/**
 * Servlet Filter implementation class LoginFilter
 */
public class LoginFilter implements Filter {

	/**
	 * Default constructor.
	 */
	public LoginFilter() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see Filter#destroy()
	 */
	public void destroy() {
		// TODO Auto-generated method stub
	}

	/**
	 * @see Filter#doFilter(ServletRequest, ServletResponse, FilterChain)
	 */
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
			throws IOException, ServletException {
		HttpServletRequest req = (HttpServletRequest) request;

//		HttpSession session = req.getSession();

//		Object obj = session.getAttribute("memeber");
//		if (obj != null) {
//			chain.doFilter(request, response);
//
//		} else {
//			// 1. jsp 로 보내는 포워드 방식
//			// 여기는 스프링이 아니여서 예전 servlet방식을 사용해야 함
//			request.setAttribute("result", "권한이 없습니다.");
//			request.setAttribute("url", "/member/login");
//
//			RequestDispatcher view = request.getRequestDispatcher("/WEB-INF/views/commons/message.jsp");
//			view.forward(request, response);
//
//			// 2. 클라이언트한테 접속 url를 다시 보내는 redirect방식
////			HttpServletResponse res = (HttpServletResponse)response;
////			res.sendRedirect("/member/login");
//
//		}
	}

	/**
	 * @see Filter#init(FilterConfig)
	 */
	public void init(FilterConfig fConfig) throws ServletException {
		// TODO Auto-generated method stub
	}

}
