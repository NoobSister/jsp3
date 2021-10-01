package com.jcpdev.action;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

// 서블릿은 http 요청을 처리하는 자바 클래스입니다. HttpServlet 을 상속받습니다.
public class Login extends HttpServlet{

	private static final long serialVersionUID = 1L;
	
	// 요청 Method 가 Get 일 때 처리되는 메소드 : 메소드 매개변수 타입 req, resp 을 인자로 요청이 들어오면 생성되는 객체 전달 받습니다.
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// request, response 외의 JSP 내장 객체는 모두 선언해서 사용해야합니다.
		// JSP 내장 객체 out을 선언합니다.
		response.setCharacterEncoding("UTF-8");
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();		// JspWriter 의 부모 PrintWriter 타입으로 선언. 위의 2개 response set 필요
		
		out.print("<h3>JSP와 서블릿</h3>");
		out.print("서블릿 너는 도대체 뭐냐?");
	}
	
	// 요청 Method 가 Post 일 때 처리되는 메소드
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		super.doPost(req, resp);
	}
	
}
