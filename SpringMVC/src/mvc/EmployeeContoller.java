package mvc;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import beans.Employee;

@Controller
public class EmployeeContoller {
	
	@Autowired
	
	EmployeeDaoImpl dao;
	
	@RequestMapping(value = "addempl", method =  RequestMethod.GET)
	
	public String showEmployeeForm(){
		return "AddEmpl";
	}


	@RequestMapping(value = "addempl", method =  RequestMethod.POST)
	
	public ModelAndView addEmployee(@ModelAttribute("employee") Employee emp){
	
		ModelAndView mav = new ModelAndView();
		mav.addObject("empl", emp);
		mav.setViewName("redirect : ViewEmpls");
		return mav;
	
}
	
	@RequestMapping(value = "viewempls", method =  RequestMethod.GET)
	
	public ModelAndView getEmpls(){
	
		ModelAndView mav = new ModelAndView();
		
		java.util.List<Employee> emplist = dao.getEmpls();
		mav.addObject("empls", emplist);
		mav.setViewName("ViewEmpls");
		return mav;
	
}
	
	
}

