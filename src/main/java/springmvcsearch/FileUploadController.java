package springmvcsearch;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.commons.CommonsMultipartFile;

@Controller
public class FileUploadController {

	@RequestMapping("/fileform")
	public String showUploadForm() {
		return "fileform";
	}
	
	@RequestMapping(value = "/uploadimage", method=RequestMethod.POST)
	public String fileUpload(@RequestParam("profile") CommonsMultipartFile file,HttpSession s) throws IOException {
		System.out.println("File Upload handler");
		System.out.println(file.getName());
		byte[] data = file.getBytes();
		String path = s.getServletContext().getRealPath("/") + file.getOriginalFilename();
		System.out.println(path);
		FileOutputStream fos = new FileOutputStream(path);
		fos.write(data);
		fos.close();
		return "filesucess";
	}
	
}
