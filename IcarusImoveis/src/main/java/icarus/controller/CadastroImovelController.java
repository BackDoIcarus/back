package icarus.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import icarus.model.Imoveis;

@Controller
public class CadastroImovelController {

@GetMapping("/novoimovel")
public ModelAndView InsertImovel(Imoveis imovel) {
	
	ModelAndView mv = new ModelAndView();
	mv.setViewName("/cadastro-imovel");
	mv.addObject("imovel", new Imoveis());
	return mv;
}

//@PostMapping("InsertImovel")
//public ModelAndView CreateAd(Imoveis imovel) {
//	ModelAndView mv= new ModelAndView();
//	mv.setViewName("redirect:/lista-imoveis");
//}


}
