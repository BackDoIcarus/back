package icarus.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;


@Controller
public class ListaController {
	@GetMapping("/meusimoveis")
	public String gerenciamento(){
	return "lista-imoveis";
}
}



