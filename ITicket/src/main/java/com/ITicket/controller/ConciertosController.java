package com.ITicket.controller;

import com.ITicket.entity.Conciertos;
import com.ITicket.service.IConciertoService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@Controller
public class ConciertosController {
    @Autowired
    private IConciertoService conciertoRepository;
    
    @GetMapping("/")
    public String index (Model model){
        List<Conciertos> listaConciertos=conciertoRepository.getAllConciertos();
        model.addAttribute ("conciertos", listaConciertos);
        return "conciertos";
    }
    
    @GetMapping("/conciertos")
    public String conciertos (Model model){
        List<Conciertos> listaConciertos=conciertoRepository.getAllConciertos();
        model.addAttribute ("conciertos", listaConciertos);
        return "conciertos";
    }
    
    @GetMapping(value = "/conciertos/delete")
    public String deleteConcierto (@PathVariable Integer id, Model model){
        conciertoRepository.delete(id);
        List<Conciertos> listaConciertos=conciertoRepository.getAllConciertos();
        model.addAttribute ("conciertos", listaConciertos);
        return "conciertos";
    }
}
