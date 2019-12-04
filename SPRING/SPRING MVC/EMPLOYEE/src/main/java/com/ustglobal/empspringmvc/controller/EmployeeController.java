package com.ustglobal.empspringmvc.controller;

import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttribute;

import com.ustglobal.empspringmvc.dto.EmployeeBean;
import com.ustglobal.empspringmvc.service.EmployeeService;
import com.ustglobal.empspringmvc.service.EmployeeServiceImpl;

@Controller
public class EmployeeController {

	@Autowired
	// private EmployeeService service = new EmployeeServiceImpl();
	private EmployeeService service;

	@InitBinder
	public void initBinder(WebDataBinder binder) {
		SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
		CustomDateEditor editor = new CustomDateEditor(format, true);
		binder.registerCustomEditor(Date.class, editor);
	}


	@GetMapping("/login")
	public String loginPage() {
		return "login";
	}// End of LoginPage

	@PostMapping("/login")
	public String login(int id, String password, HttpServletRequest request) {
		EmployeeBean bean = service.login(id, password);

		if (bean == null) {
			request.setAttribute("msg", "Invalid Credentials");
			return "login";
		} else {
			HttpSession session = request.getSession();
			session.setAttribute("bean", bean);
			return "home";
		}
	}// End of Login()

	@GetMapping("/register")
	public String registerPage() {
		return "register";
	}// End of registerPage

	@PostMapping("/register")
	public String register(EmployeeBean bean, ModelMap map) {

		int check = service.register(bean);
		if (check > 0) {
	
			map.addAttribute("msg", "You are registered and ID is " + check);
		} else {
			map.addAttribute("msg", "Email is repeted");
		}

		return "login";
	}// End of Register

	@GetMapping("/home")
	public String home(ModelMap map, @SessionAttribute(name = "bean", required = false) EmployeeBean bean) {

		if (bean == null) {
			map.addAttribute("msg", "Login First!!!!!");
			return "login";
		} else {
			return "home";
		}

	}// End of Home()

	@PostMapping("/home")
	public String home() {
		return "home";
	}//End of Home

	@GetMapping("/search")
	public String search(@RequestParam("id")int id,ModelMap map) {
		EmployeeBean bean = service.searchEmployee(id);
		if(bean == null) {
			map.addAttribute("msg", "Data Not Found");
		}else {
			map.addAttribute("bean", bean);
			
		}
		return "home";
	}//End of Search


	@GetMapping("/logout")
	public String logout(HttpSession session) {
		session.invalidate();
		return "login";
	}//End of Logout

	@GetMapping("/detele")
	public String deleteProfile(HttpSession session) {
		EmployeeBean bean = (EmployeeBean)session.getAttribute("bean");
		try {
			service.deleteEmployee(bean.getId());
		} catch (Exception e) {
			e.printStackTrace();
		}
		session.invalidate();
		return "login";
	}//End of Delete


	@GetMapping("/changepassword")
	public String changePassord(HttpServletRequest request) {
		HttpSession session = request.getSession(false);
		if(session != null) {

			return "changepassword";
		}else {
			return "login";
		}
	}// End of changepaword

	@PostMapping("/changepassword")
	public String changePassword(ModelMap map,String npassword,String cpassword,@SessionAttribute(name="bean",required = false)EmployeeBean bean) {

		if(npassword.equals(cpassword)) {
			service.changePassword(bean.getId(),cpassword);
			map.addAttribute("msg","Password Changed");
			return "home";
		}else {
			map.addAttribute("msg", "Password Not Matching");
		}
		return "home";
	}//End of Changepassword

	
	
	
	@GetMapping("/update")
	public String updateProfile(HttpServletRequest request) {
		HttpSession session = request.getSession(false);
		if(session != null) {

			return "update";
		}else {
			return "login";
		}
	}// End of Updateprofile

	@PostMapping("/update")
	public String updateProfile(ModelMap map,EmployeeBean bean,@SessionAttribute(name="bean",required = false)EmployeeBean bean1,HttpSession session) {

		 bean.setId(bean1.getId());
		 bean.setPassword(bean1.getPassword());
		 boolean check = service.updateEmployee(bean);
		if(check) {
			map.addAttribute("msg", "Updated");
			 session.setAttribute("bean", bean);
			return "home";
		}
		else {
			map.addAttribute("msg", "NOT UpDatad");
			return "update";
		}
		
	}//End of Updateprofile
}
