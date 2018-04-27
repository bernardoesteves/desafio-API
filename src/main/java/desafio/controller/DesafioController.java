package desafio.controller;

import java.util.List;

import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import desafio.dados.DadosMemoria;

@Controller
public class DesafioController {
	
	@RequestMapping(value = "/dadoAtual", method = RequestMethod.GET, produces={MediaType.APPLICATION_JSON_VALUE})
	public @ResponseBody String retornaDadoAtualEmMemoria() {
		return DadosMemoria.instancia().getDadoAtual();
	}
	
	@RequestMapping(value = "/dados", method = RequestMethod.GET, produces={MediaType.APPLICATION_JSON_VALUE})
	public @ResponseBody List<String> retornaDadosEmMemoria() {
		return DadosMemoria.instancia().getDados();
	}
}
