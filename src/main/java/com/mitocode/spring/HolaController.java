package com.mitocode.spring;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HolaController {
@RequestMapping("irHola")
	public ModelAndView irHola() {
	ModelAndView MV= new ModelAndView("hola","mensaje","Soy un mensaje directo we");
	/*MV.setViewName("hola");
	MV.addObject("mensaje","Hola mensaje desde controller we");*/
	return MV;
}
}
