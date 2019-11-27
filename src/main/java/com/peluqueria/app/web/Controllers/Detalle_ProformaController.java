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

import com.peluqueria.app.web.models.entities.Detalle_Proforma;
import com.peluqueria.app.web.models.services.IDetalle_Proforma_Service;

 

@Controller
@RequestMapping(value="/detalle_proforma")
public class Detalle_ProformaController {

	@Autowired
	private IDetalle_Proforma_Service service;
	
	@GetMapping(value="/create")
	public String create(Model model) {
		Detalle_Proforma detalle_proforma = new Detalle_Proforma();
		model.addAttribute("detalle_proforma",detalle_proforma);
		model.addAttribute("title","Registro detalle proforma");
		return "detalle_proforma/form";
	}
	
	@GetMapping(value="/retrive/{id}")
	public String retrive(@PathVariable(value="id") Integer id, Model model) {
		Detalle_Proforma detalle_proforma = service.findById(id);
		model.addAttribute("detalle_proforma",detalle_proforma);
		return "detalle_proforma/card";
	}
	
	@GetMapping(value="/update/{id}")
	public String update(@PathVariable(value="id") Integer id, Model model) {
		Detalle_Proforma detalle_proforma = service.findById(id);
		model.addAttribute("detalle_proforma",detalle_proforma);
		return "detalle_proforma/form";
	}
	
	@GetMapping(value="/delete/{id}")
	public String delete(@PathVariable(value="id") Integer id, Model model, RedirectAttributes redirect) {
		try {
			service.delete(id);
			redirect.addFlashAttribute("success", "El registro eliminado");
		}catch(Exception e) {
			redirect.addFlashAttribute("error", "Error al eliminar el registro");
		}
		return "redirect:/detalle_proforma/list";
	}
	@GetMapping(value="/list")
	public String list(Model model) {
		List<Detalle_Proforma> list = service.findAll();
		model.addAttribute("list",list);
		model.addAttribute("title","Listado detalle de proforma");
		return "/detalle_proforma/list";
	}
	
	//
	@PostMapping(value="/save")
	public String save(Detalle_Proforma detalle_proforma,Model model, RedirectAttributes redirect) {	
		try {
			service.save(detalle_proforma);
			redirect.addFlashAttribute("success","Se guardó el registro");
			
		}catch(Exception e) {
			redirect.addFlashAttribute("error","Error al guardar el registro");
		}
		
		return "/detalle_proforma/list";
	}
}
