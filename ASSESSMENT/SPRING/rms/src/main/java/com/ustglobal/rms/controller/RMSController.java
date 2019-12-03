package com.ustglobal.rms.controller;

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

import com.ustglobal.rms.dto.ProductBean;
import com.ustglobal.rms.dto.RetailerBean;
import com.ustglobal.rms.service.RMSService;

@Controller
public class RMSController {

	@Autowired
	private RMSService service;
	
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
		RetailerBean bean = service.login(id, password);

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
	public String register(RetailerBean  bean, ModelMap map) {

		int check = service.register(bean);
		if (check > 0) {
			map.addAttribute("msg", "You are registered and ID is " + check);
		} else {
			map.addAttribute("msg", "Email is repeted");
		}

		return "login";
	}// End of Register

	@GetMapping("/home")
	public String home(ModelMap map, @SessionAttribute(name = "bean", required = false) RetailerBean  bean) {

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
		ProductBean bean = service.searchId(id);
		if(bean == null) {
			map.addAttribute("msg", "Data Not Found");
		}else {
			map.addAttribute("bean", bean);
			System.out.println(bean);
		}
		return "home";
	}//End of Search


	@GetMapping("/logout")
	public String logout(HttpSession session) {
		session.invalidate();
		return "login";
	}//End of Logout

	

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
	public String changePassword(ModelMap map,String npassword,String cpassword,@SessionAttribute(name="bean",required = false)RetailerBean  bean) {

		if(npassword.equals(cpassword)) {
			service.changePassword(bean.getId(),cpassword);
			map.addAttribute("msg","Password Changed");
			return "home";
		}else {
			map.addAttribute("msg", "Password Not Matching");
		}
		return "home";
	}//End of Changepassword
	
	
	
	
	
	@GetMapping("/product")
	public String addProduct(ProductBean pbean,int quantity,HttpSession session,ModelMap map ){
		RetailerBean bean=(RetailerBean)session.getAttribute("bean");
		boolean check=service.add(pbean,quantity,bean.getId());
		if(check) {
			
			map.addAttribute("msg","added sucessfully");
		}
		else {
			map.addAttribute("msg","added unsucessfully");
		}
		return "home";
	}
}
