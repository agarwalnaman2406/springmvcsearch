package springmvcsearch;

import org.springframework.http.HttpMethod;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class FormController {
	
	@RequestMapping("/complex")
	public String showForm() {
		return "complex_form";
	}
	
	@RequestMapping(path ="/handle" , method = RequestMethod.POST)
	public String formHandler(@ModelAttribute("student") Student student, BindingResult bindingResult) {
		if(bindingResult.hasErrors()) {
			return "complex_form";
		}
		System.out.println(student);
		return "sucess";
	}
	

}
