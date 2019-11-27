package com.peluqueria.app.web.Controllers; 

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.peluqueria.app.web.models.entities.Catalogo;
import com.peluqueria.app.web.models.services.ICatalogoService;

@Controller
@RequestMapping(value="/catalogo")
public class CatalogoController {

	@Autowired
	private ICatalogoService service;
	
	@GetMapping(value="/create")
	public String create(Model model) {
		Catalogo catalogo = new Catalogo();
		model.addAttribute("catalogo",catalogo);
		model.addAttribute("title","Registro del catalogo");
		return "catalogo/form";
	}
	
	@GetMapping(value="/retrive/{id}")
	public String retrive(@PathVariable(value="id") Integer id, Model model) {
		Catalogo catalogo = service.findById(id);
		model.addAttribute("catalogo",catalogo);
		return "catalogo/card";
	}
	
	@GetMapping(value="/update/{id}")
	public String update(@PathVariable(value="id") Integer id, Model model) {
		 Catalogo catalogo = service.findById(id);
		model.addAttribute("catalogo",catalogo);
		return "catalogo/form";
	}
	
	@GetMapping(value="/delete/{id}")
	public String delete(@PathVariable(value="id") Integer id, Model model, RedirectAttributes redirect) {
		try {
			service.delete(id);
			redirect.addFlashAttribute("success", "El registro se removió correctamente");
		}catch(Exception e) {
			redirect.addFlashAttribute("error", "No se pudo eliminar el registro");
		}
		return "redirect:/catalogo/list";
	}
	@GetMapping(value="/list")
	public String list(Model model) {
		List<Catalogo> list = service.findAll();
		model.addAttribute("list",list);
		model.addAttribute("title","Listado del catalogo");
		return "/catalogo/list";
	}
	
	//
	@PostMapping(value="/save")
	public String save(Catalogo catalogo,Model model, RedirectAttributes redirect) {	
		try {
			service.save(catalogo);
			redirect.addFlashAttribute("success","Se guardó el registro");
			
		}catch(Exception e) {
			redirect.addFlashAttribute("error","No se pudo guardar el registro");
		}
		
		return "/catalogo/list";
	}
}
