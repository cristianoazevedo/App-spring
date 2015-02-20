package demo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class IndexController {

	@RequestMapping(value="/aluno")
	public Aluno aluno(@RequestParam(value="nome") String nome, @RequestParam(value="ra") String ra){
		return new Aluno(nome, ra);
	}
}
