package org.smartcompras.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpServletRequest;


import org.smartcompras.model.Produto;
import org.smartcompras.repository.ProdutoMongoRepository;


@Controller
public class ProdutoController {

	@Autowired
	ProdutoMongoRepository produtoRepository;
	
	@RequestMapping("produto")
	public String produto() {
		return "produto";
	}
	
	
	@RequestMapping(value="/addprodutos", method=RequestMethod.POST)
	public String addmarcas(@ModelAttribute Produto produto){
		produtoRepository.save(produto);
		return "redirect:produto";
		
	}
	
	@RequestMapping(value = "/searchprodutos")
    public String search(@RequestParam String searchprodutos) {
        return "redirect:produto";
    }
	
//	@RequestMapping("/produto")
//    public String produtoListar(Model model) {
//       model.addAttribute("produtoList", produtoRepository.findAll());
//        return "redirect:produto";
//    }
////	
	@RequestMapping(value = "/delprod", params = { "removerProduto" }, method = RequestMethod.POST)

	public String delMarca(@ModelAttribute Produto produto, final HttpServletRequest req) {
		String prodId = String.valueOf((req.getParameter("removerProduto")));

		produtoRepository.delete(prodId);

		return "redirect:produto";
	}
}
