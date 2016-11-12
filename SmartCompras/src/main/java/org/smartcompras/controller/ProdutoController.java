package org.smartcompras.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import org.smartcompras.model.Produto;
import org.smartcompras.repository.ProdutoMongoRepository;


@Controller
public class ProdutoController {

	@Autowired
	ProdutoMongoRepository produtoRepository;
	
	@RequestMapping(value="/addprodutos", method=RequestMethod.POST)
	public String addmarcas(@ModelAttribute Produto produto){
		produtoRepository.save(produto);
		return "produto";
		
	}
	
	@RequestMapping(value = "/searchprodutos")
    public String search(@RequestParam String searchprodutos) {
        return "produto";
    }
	
	@RequestMapping("/produto")
    public String produto(Model model) {
        model.addAttribute("produtoList", produtoRepository.findAll());
        return "produto";
    }
	
}
