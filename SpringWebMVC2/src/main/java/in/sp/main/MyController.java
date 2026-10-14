package in.sp.main;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import in.sp.beans.User;
import jakarta.servlet.http.HttpServletRequest;

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
	

	@GetMapping("/myForm")
    public String openMyFormPage() {
    	return "my-form";//return view name her
    }
	
	
//	
//	@PostMapping("/submitForm") //since we used post in method and transfering
//	public String handleMyForm(HttpServletRequest req) {
//		
////		
////	String myname = req.getParameter("name1");
////	String myemail = req.getParameter("email1");
////	String myphno = req.getParameter("phoneno1");
////	
////	
////	System.out.println("Name: "+myname);
////	System.out.println("Email Id: "+myemail);
////	System.out.println("Phone NO.: "+myphno);
////	
//		
//		
//	return  "profile";	
//	}
	
//	@PostMapping("/submitForm") //since we used post in method and transfering
//	public String handleMyForm(
//			
//			                        @RequestParam("name1")String myname,//this is easy way
//			                        @RequestParam("email1")String myemail,
//			                        @RequestParam("phoneno1")String myphno,
//			                        Model model
//			) 
//	{
//	System.out.println("Name: "+myname);
//	System.out.println("Email Id: "+myemail);
//	System.out.println("Phone NO.: "+myphno);
//	
//		model.addAttribute("model_name", myname);//storing data in model object in key value pair
//		model.addAttribute("model_email", myemail);
//		model.addAttribute("model_phno", myphno);
//		
//          return  "profile";	
//}
//	
	
//
//	@PostMapping("/submitForm") //since we used post in method and transfering
//	public String handleMyForm(
//			
//			                        @RequestParam("name1")String myname,//this is easy way
//			                        @RequestParam("email1")String myemail,
//			                        @RequestParam("phoneno1")String myphno,
//			                        Model model
//			) 
//	{
//	System.out.println("Name: "+myname);
//	System.out.println("Email Id: "+myemail);
//	System.out.println("Phone NO.: "+myphno);
//	
//	User user = new User();
//	user.setName(myname);
//	user.setEmail(myemail);
//	user.setPhoneno(myphno);
//	
//		model.addAttribute("model_user", user);//storing data in model object in key value pair
//		
//	
//        return  "profile";	
//}
	
	@PostMapping("/submitForm") //since we used post in method and transfering
	public String handleMyForm( @ModelAttribute User user	                      
			) 
	{
	System.out.println("Name: "+user.getName());
	System.out.println("Email Id: "+user.getEmail());
	System.out.println("Phone NO.: "+user.getPhoneno());

	
        return  "profile";	
}
	

	
}
