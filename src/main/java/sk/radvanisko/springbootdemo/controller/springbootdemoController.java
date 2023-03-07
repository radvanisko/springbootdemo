package sk.radvanisko.springbootdemo.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import sk.radvanisko.springbootdemo.model.Vydavok;
import sk.radvanisko.springbootdemo.service.VydavokService;

import org.springframework.ui.Model;

@Controller
public class springbootdemoController  {

    @Autowired
    private VydavokService vydavokService;

    @GetMapping ("/")

    public String index (){

        return "index";
    }

    @GetMapping ("/zobrazvsetky")
    public String zobrazvsetky(Model model) {
       model.addAttribute("vydavky",vydavokService.getAllrecords());

        return "zobrazvsetky";

    }

    @GetMapping ("/error")
    public  String error (){
        return error();
    }
}
