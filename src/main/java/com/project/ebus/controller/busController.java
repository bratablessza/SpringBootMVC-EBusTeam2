package com.project.ebus.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class busController {

    @GetMapping("/")
    public String cobaGetPagenya() {
        return "index";
    }

    @GetMapping("/about")
    public String cobaGetPagenya2() {
        return "about";
    }

    @GetMapping("/blog")
    public String cobaGetPagenya3() {
        return "blog";
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
    // lupa commit message ya

}
