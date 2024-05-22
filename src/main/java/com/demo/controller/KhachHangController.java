package com.demo.controller;

import com.demo.entity.HangKhachHang;
import com.demo.entity.KhachHang;
import com.demo.service.HangKhachHangService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/khach-hang")
public class KhachHangController {

    @Autowired
    HangKhachHangService hangKhachHangService;

    @GetMapping("/index")
    public String list(){
        return "khach-hang/list";
    }

    @GetMapping("/add")
    public String viewAdd(Model model){
        model.addAttribute("kh",new KhachHang());
        return "khach-hang/form";
    }

    @PostMapping("/add")
    public String add(@Valid @ModelAttribute("kh") KhachHang kh, BindingResult rs){
        return "khach-hang/form";
    }

    @ModelAttribute("dsHang")
    public List<HangKhachHang> getAllHang(){
        return hangKhachHangService.findAll();
    }

}
