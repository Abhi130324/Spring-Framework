package in.sp.main;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class MyController {
	
	
   // @RequestMapping(value = "/helloPage", method = RequestMethod.GET )//other way to request get method
	
	
    @GetMapping("/helloPage")
	public ModelAndView openhelloPage() {
		
    	System.out.println("openHelloPage() method executed");
    	
    	ModelAndView mav = new ModelAndView("hello");//you can add view name here as well
    	//mav.setViewName("hello");
    	
    	return mav;
	}
	@GetMapping("/aboutUs")
    public String openAboutUSPage() {
    	return "about-us";//return view name her
    }
	
}
