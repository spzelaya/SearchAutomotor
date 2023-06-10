package com.example.SearchAutomotor.Controller;

import com.example.SearchAutomotor.Model.Automotor;
import com.example.SearchAutomotor.Service.AutomotorService;
import com.example.SearchAutomotor.repository.AutomotorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Arrays;
import java.util.List;

@Controller
public class AutomotorController {

    @Autowired
    private AutomotorService service;

@RequestMapping(path = {"/","/search"})
public String home(Automotor automotor, Model model, String marca,String descripcion,String tipo) {
    if(marca!=null && descripcion!=null) {
        List<Automotor> automotors = service.getByMarcaDescripcionAndTipo(marca, descripcion,tipo);
        model.addAttribute("automotors", automotors);
    }
    else {
        List<Automotor> automotors = service.getAllAutomotors();
        model.addAttribute("automotors", automotors);
    }
    return "index";
}
}