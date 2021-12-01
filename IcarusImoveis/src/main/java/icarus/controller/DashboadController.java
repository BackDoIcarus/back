package icarus.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

import icarus.model.Imoveis;

@Controller
public class DashboadController {

@GetMapping("/dashboard")
public ModelAndView InsertImovel(Imoveis imovel) {
	
	ModelAndView mv = new ModelAndView();
	mv.setViewName("/dashboard-locador");
	mv.addObject("imovel", new Imoveis());
	return mv;
}
	
}
