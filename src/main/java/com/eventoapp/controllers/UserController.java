package com.eventoapp.controllers;


import com.eventoapp.User;
import jakarta.validation.Valid;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class UserController {

    @GetMapping("/cadastrar")
    public String showForm(Model model){
        model.addAttribute("userForm", new User());
        return "userForm";
    }

    @PostMapping("/cadastrar")
    public String userFormPost(@Valid @ModelAttribute("userForm") User userForm, BindingResult resultado, Model model){
        if (resultado.hasErrors()) {
            return "userForm";
        }
        model.addAttribute("mensagem", "Cadastrado com sucesso.");
        return "userForm";
    }
;
}
