package com.spoc.action;

import java.util.HashMap;
import java.util.Map;

import javax.security.auth.message.callback.PrivateKeyCallback.Request;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

import com.spoc.po.User;
import com.spoc.service.UserService;

@SuppressWarnings("unused")
public class UserController  implements Controller
{
	private UserService userService;
	public ModelAndView handleRequest(HttpServletRequest request,HttpServletResponse response) throws Exception
	{
		    //System.out.println("HelloController.handleRequest()");
		    String username = request.getParameter("username");
			String password = request.getParameter("password");
			boolean flag1=userService.find(username, password);
			User user=new User();
			if(flag1)
			{
				request.setAttribute("b", "欢迎登录思博课网");
			return new ModelAndView("index1");
			}
			else
			{
				request.setAttribute("c", "您的用户名或密码错误请重新输入");
				return new ModelAndView("error");
			}
	}
	  
	private User getUser(String username, String password)
	{
		// TODO Auto-generated method stub
		return null;
	}


	public UserService getUserService()
	{
		return userService;
	}

	public void setUserService(UserService userService)
	{
		this.userService = userService;
	}

}
