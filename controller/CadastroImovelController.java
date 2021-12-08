package icarus.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import icarus.model.Imoveis;
import icarus.repository.ImovelRepository;

@Controller
public class CadastroImovelController {

	@Autowired
	private ImovelRepository imovelrepository;
	
@GetMapping("/novoimovel")
public ModelAndView InsertImovel(Imoveis imovel) {
	
	ModelAndView mv = new ModelAndView();
	mv.setViewName("/cadastro-imovel");
	mv.addObject("imovel", new Imoveis());
	return mv;
}

@PostMapping("InsertImovel")
public ModelAndView CreateAd(Imoveis imovel) {
	ModelAndView mv= new ModelAndView();
	mv.setViewName("redirect:/lista-imoveis");
	imovelrepository.save(imovel);
	return mv;
}


}
