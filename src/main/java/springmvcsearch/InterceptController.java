package springmvcsearch;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

@Controller
public class InterceptController {
	
	@RequestMapping("/name")
	public String getName() {
		return "nameform";
	}
	
	@RequestMapping("/welcome")
	public String welcome(@RequestParam("user") String name, Model m) {
		System.out.println(name);
		m.addAttribute("name", name);
		return "welcome";
	}

}
