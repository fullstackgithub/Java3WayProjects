package com.garagem.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.garagem.entity.Veiculo;
import com.garagem.service.VeiculoService;

@Controller
public class VeiculoController {
	
	@Autowired
	VeiculoService service; 
	
	@GetMapping("/novo")
	public String cadastrar(Veiculo objVeiculo) {
		return "frmveiculo";
	}
	
	@GetMapping("/listar")
	public String listar(ModelMap model) {
		model.addAttribute("lstVeiculos", service.findAll());
		return "lstveiculos";
	}
	
	@PostMapping("/salvar")
	public String salvar(Veiculo objVeiculo, RedirectAttributes attr) {
		service.saveOrUpdate(objVeiculo);
		attr.addFlashAttribute("msg", "Veículo inserido com sucesso!");
		return "redirect:/novo";
	}
}
