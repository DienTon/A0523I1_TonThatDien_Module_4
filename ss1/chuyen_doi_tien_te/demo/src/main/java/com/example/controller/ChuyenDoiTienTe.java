package com.example.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/TienTe")
public class ChuyenDoiTienTe {
    @PostMapping("")
    public String convert(@RequestParam double money, Model model){
        model.addAttribute("result", money * 23000);
        return "/index";
    }

    @GetMapping("")
    public String showForm(){
        return "/index";
    }

}
