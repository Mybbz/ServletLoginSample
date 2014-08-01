package com.j2ee.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@SuppressWarnings("serial")
public class CheckAccount extends HttpServlet{
	protected void doPost(HttpServletRequest req, HttpServletResponse resp)
		throws ServletException, IOException{
		doGet(req, resp);
	}
	
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
		throws ServletException, IOException{
		HttpSession session = req.getSession();
		AccountBean account = new AccountBean();
		String username = req.getParameter("username");
		String password = req.getParameter("password");
		account.setPassword(password);
		account.setUsername(username);
		
		if((username != null) && (username.trim().equals("jsp"))){
			if((password != null) && (password.trim().equals("1"))){
				System.out.println("success");
				session.setAttribute("account", account);
				String login_suc = "success.jsp";
				resp.sendRedirect(login_suc);
				return;
			}
		}
		String login_fail = "fail.jsp";
		resp.sendRedirect(login_fail);
		return;
		
	}
}
