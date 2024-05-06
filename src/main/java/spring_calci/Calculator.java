package spring_calci;



import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class Calculator 
{
	@RequestMapping("/add")
	@ResponseBody
	public String add()
	{
		return "Addition";
	}
	
	@RequestMapping("/sub")
	@ResponseBody
	public String sub()
	{
		return "Subtraction";
	}

	@RequestMapping("/mul")
	@ResponseBody
	public String mul()
	{
		return "Multiplication";
	}
	
	@RequestMapping("/div")
	@ResponseBody
	public String div()
	{
		return "Division";
	}
}

//responseboby-request in front end
//xml way of mapping


//create project add dependency and create class
