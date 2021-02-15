package com.springmvc.controllers;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.springmvc.model.UserDetails;

@Controller
public class FormController {
	
	@InitBinder
	public void initBinder(WebDataBinder binder) {
		//binder.setDisallowedFields(new String[] {"studentMobile","address"});
	}
	
	@RequestMapping("/fillForm.html")
	public ModelAndView gotoForm() {
		ModelAndView mv = new ModelAndView("vlnForm");
		return mv;
	}
	@RequestMapping("/submitForm.html")
	public ModelAndView getDetails(@Valid @ModelAttribute("details") UserDetails details, BindingResult result ) {
		if(result.hasErrors()) {
			ModelAndView mv = new ModelAndView("vlnForm");
		}
		ModelAndView mv = new ModelAndView("success");
		mv.addObject("contact", details.getContact());
		return mv;
	}
}
