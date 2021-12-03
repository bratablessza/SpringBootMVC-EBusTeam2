package com.project.ebus.controller;

import java.util.List;

import com.project.ebus.models.Developers;
import com.project.ebus.models.Perusahaan;
import com.project.ebus.repositories.developerRepository;
import com.project.ebus.repositories.perusahaanRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class busController {

    @Autowired
    developerRepository devRepo;

    @Autowired
    perusahaanRepository perusahaanRepo;

    @GetMapping("/")
    public String getPageLogin() {
        return "login";
    }

    @GetMapping("/home")
    public String cobaGetPagenya() {
        return "index";
    }

    @GetMapping("/about") // brata
    public String getPageAbout(Model model) {
        List<Developers> dev = devRepo.findAll();
        model.addAttribute("dataDev", dev);
        return "about";
    }

    @GetMapping("/perusahaan") // ade
    public String getPageperusahaan(Model model) {
        List<Perusahaan> perusahaan = perusahaanRepo.findAll();
        model.addAttribute("dataperusahaan", perusahaan);
        return "perusahaan";
    }

    @GetMapping("/contact")
    public String cobaGetPagenya4() {
        return "contact";
    }

    @GetMapping("/booking")
    public String cobaGetPagenya5() {
        return "booking";
    }

    @GetMapping("/gallery")
    public String cobaGetPagenya6() {
        return "gallery";
    }

    // nanti yg ngerjain controller, kalo ada bentrok diatas replace aja. jangan
    // lupa commit message

}
