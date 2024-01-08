package com.example.tudiendongian;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.LinkedHashMap;
import java.util.Map;

@Controller
@RequestMapping("/ThuVien")
public class ThuVien {
    @GetMapping("/search")
    public String thuVien(@RequestParam String search, Model model){
        String result = null;
        Map<String,String> map = new LinkedHashMap<>();
        map.put("dog", "chó");
        map.put("cat", "mèo");
        map.put("bird", "chim");
        map.put("fish", "cá");
        map.put("lion", "sư tử");
        result = map.get(search);
        if (result == null) {
            result = "not found";
        }
        model.addAttribute("result",result);
        return "/index";
    }
    @GetMapping
    public String result(){
        return "/index";
    }
}
