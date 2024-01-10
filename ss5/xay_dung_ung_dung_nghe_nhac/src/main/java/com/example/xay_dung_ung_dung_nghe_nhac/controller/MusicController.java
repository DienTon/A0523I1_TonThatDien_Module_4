package com.example.xay_dung_ung_dung_nghe_nhac.controller;

import com.example.xay_dung_ung_dung_nghe_nhac.model.Music;
import com.example.xay_dung_ung_dung_nghe_nhac.service.IMusicService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import java.util.List;

@RequestMapping("")
@Controller
public class MusicController {
    @Autowired
    private IMusicService musicService;

    @GetMapping("/")
    public String showList(Model model) {
        List<Music> musicList = musicService.FinAll();
        model.addAttribute("musicList", musicList);
        return "showList";
    }

    @GetMapping("/showFormCreate")
    public String showFormAddMusic(Model model) {
        model.addAttribute("music", new Music());
        return "create";
    }

    @PostMapping("/create")
    public String createMusic(@ModelAttribute("music") Music music,
                              RedirectAttributes redirectAttributes) {
        musicService.addMusic(music);
        redirectAttributes.addFlashAttribute("msg", "Music added successfully");
        return "redirect:/";
    }

    @PostMapping("/delete")
    public String delete(@ModelAttribute("music") Music music, RedirectAttributes redirectAttributes) {
        musicService.removeMusic(music);
        return "redirect:/";
    }
}
