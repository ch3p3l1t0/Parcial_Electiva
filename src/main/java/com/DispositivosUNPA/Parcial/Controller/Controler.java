package com.DispositivosUNPA.Parcial.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.DispositivosUNPA.Parcial.InterfaceService.IpersonaService;
import com.DispositivosUNPA.Parcial.Model.Persona;
import com.DispositivosUNPA.Parcial.Services.PersonaServices;

@Controller
@RequestMapping
public class Controler {

    @Autowired
    private IpersonaService service;

    @GetMapping("/listar")
    public String listar(Model model) {
        model.addAttribute("personas", service.listar());
        return "index";
    }

    @GetMapping("/listar/{id}")
    public String listarId(@PathVariable int id, Model model) {
        model.addAttribute("persona", service.listarId(id));
        return "form";
    }

    @GetMapping("/new")
    public String nuevo(Model model) {
        model.addAttribute("personas", new PersonaServices());
        return "form";
    }

    @PostMapping("/save")
    public String save(@Validated Persona p, Model model) {
        int id = service.save(p);
        if (id == 0) {
            return "form";
        }
        return "redirect:/listar";
    }

    @GetMapping("/delete/{id}")
    public String eliminar(@PathVariable int id, Model model) {
        service.delete(id);
        return "redirect:/listar";
    }
}