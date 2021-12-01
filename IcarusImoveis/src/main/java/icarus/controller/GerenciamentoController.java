package icarus.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;


@Controller
public class GerenciamentoController {
	@GetMapping("/gerenciamento")
	public String gerenciamento(){
	return "gerenciamento";
}
}



