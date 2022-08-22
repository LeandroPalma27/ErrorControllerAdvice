package com.leancode.errores.controllers;

import com.leancode.errores.errors.UserNotFoundException;
import com.leancode.errores.services.interfaces.IUsuarioService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping({"", "/"})
public class AppController {

    @Autowired
    private IUsuarioService usuarioService;

    @GetMapping("/index")
    public String Index(Model model) {
        Integer random = Integer.parseInt("10x");
        return "index";
    }

    @GetMapping("/ver/{id}")
    public String Ver(@PathVariable(name = "id") Integer id , Model model) {
        var usuario = usuarioService.obtenerPorIdOptional(id).orElseThrow(() -> new UserNotFoundException(id));
        
        /* if (usuario == null) {
            throw new UserNotFoundException(id);
        } */

        model.addAttribute("titulo", "xd".concat(usuario.getApellidos()));
        return "ver";
    }

}
