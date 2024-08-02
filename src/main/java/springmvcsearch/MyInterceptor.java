package springmvcsearch;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

public class MyInterceptor extends HandlerInterceptorAdapter {

	@Override
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler)
			throws Exception {
		// TODO Auto-generated method stub
		System.out.println("in a pre handler");
		String s = request.getParameter("user");
		if(s.startsWith("a")) {
			response.setContentType("text/html");
			response.getWriter().println("Invalid name.. Write Correct name");
			return false;
		}
		return super.preHandle(request, response, handler);
	}

	
	
}
