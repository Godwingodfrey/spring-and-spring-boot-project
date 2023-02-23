package com.odo.oddexample.controller;

import com.odo.oddexample.model.Decagon;
import com.odo.oddexample.service.DecaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
public class DecaController {

    @Autowired
    private DecaService decaService;


    @GetMapping(path = "/devs")
    public String showDecaDashBoard(Model model){
        List<Decagon> listOfDevs = decaService.getAllDecadev();
        model.addAttribute("decadevs", listOfDevs);
        return "devs";
    }

    @GetMapping(path = "/devs/create-new")
    public String devEnter(Model model){
        Decagon decagon = new Decagon();
        model.addAttribute("dev", decagon);
        return "create-dev";
    }

    @PostMapping("/devs")
    public String saveDev(@ModelAttribute("dev") Decagon dev){
        decaService.saveDecaDev(dev);
        return "redirect:/devs";
    }

    @GetMapping(path="devs/edit/{id}")
    public String editDev(@PathVariable Long id, Model model) {
        model.addAttribute("dev", decaService.getById(id));
        return "redirect:/devs";
    }

    @PostMapping(path = "dev/{id}")
    public String updateDev(@PathVariable Long id, @ModelAttribute("dev") Decagon decagon){
        decaService.updateDecadev(id, decagon);
        return "redirect:/dev";
    }


    @GetMapping(path = "/devs/{id}")
    public String deleteDev(@PathVariable("id") Long id, Model model){
        decaService.deleteDecadevById(id);
        return "redirect:/devs";
    }
}
