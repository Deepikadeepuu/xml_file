package spring_calci;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class Myclass {

	@RequestMapping("/hello")
	@ResponseBody
	public String Hello()
	{
		return "hello";
	}
	
	@RequestMapping("/bye")
	@ResponseBody
	public String Bye()
	{
		return "bye";
	}
}
