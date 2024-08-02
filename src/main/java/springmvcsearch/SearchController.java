package springmvcsearch;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.view.RedirectView;

@Controller
public class SearchController {
	
	@RequestMapping("/home")
	public String home() {
		System.out.println("going to home view ..");
		return "home";
	}
	
	@RequestMapping("/search")
	public RedirectView search(@RequestParam("querybox") String query) {
		String url = "https://www.google.com/search?q="+query;
		RedirectView redirect =  new RedirectView();
		redirect.setUrl(url);
		return redirect;
	}
	
	@RequestMapping("/user/{userId}")
	public String getUserDetail(@PathVariable("userId") int id) {
		System.out.println(id);
		return "home";
	}
	
}
