package org.smartcompras.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import org.smartcompras.model.Marca;
import org.smartcompras.repository.MarcaMongoRepository;


@Controller
public class MarcaController {

	@Autowired
	MarcaMongoRepository marcaRepository;
	

	
	
	@RequestMapping(value="/addmarcas", method=RequestMethod.POST)
	public String addMarcas(@ModelAttribute Marca marca){
		marcaRepository.save(marca);
		return "redirect:marca";
		
	}
	
	@RequestMapping(value = "/searchmarcas")
    public String search(@RequestParam String searchmarcas) {
        return "redirect:marca";
    }
	
	@RequestMapping("/marca")
    public String marcaList(Model model) {
        model.addAttribute("marcaList", marcaRepository.findAll());
        return "marca";
    }
	
	
	@RequestMapping("/delmarca")
    public String delMarca(@ModelAttribute Marca marca) {
		marcaRepository.delete(marca);
//      	System.out.println(marca.getId());
//      	System.out.println(marca.getMarca());
        return "redirect:marca";
    }
	
}
