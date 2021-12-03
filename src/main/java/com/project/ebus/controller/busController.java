package com.project.ebus.controller;

import java.util.List;

import com.project.ebus.models.Developers;
import com.project.ebus.models.Rekan;
import com.project.ebus.repositories.developerRepository;
import com.project.ebus.repositories.rekanRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class busController {

    @Autowired
    developerRepository devRepo;

    @Autowired
    rekanRepository rekanRepo;

    @GetMapping("/")
    public String cobaGetPagenya() {
        return "index";
    }

    @GetMapping("/about") // brata
    public String getPageAbout(Model model) {
        List<Developers> dev = devRepo.findAll();
        model.addAttribute("dataDev", dev);
        return "about";
    }

    @GetMapping("/rekan") // ade
    public String getPageRekan(Model model) {
        List<Rekan> rekan = rekanRepo.findAll();
        model.addAttribute("dataRekan", rekan);
        return "rekan";
    }

    @GetMapping("/contact")
    public String cobaGetPagenya4() {
        return "contact";
    }

    @GetMapping("/download")
    public String cobaGetPagenya5() {
        return "download";
    }

    @GetMapping("/gallery")
    public String cobaGetPagenya6() {
        return "gallery";
    }

    // nanti yg ngerjain controller, kalo ada bentrok diatas replace aja. jangan
    // lupa commit message

}
