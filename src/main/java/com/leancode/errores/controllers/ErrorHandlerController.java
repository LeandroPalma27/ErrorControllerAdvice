package com.leancode.errores.controllers;

import com.leancode.errores.errors.UserNotFoundException;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class ErrorHandlerController {
    
    @ExceptionHandler(ArithmeticException.class)
    public String arithmeticErrorPage(ArithmeticException ex, Model model) {
        model.addAttribute("error", "Error de servidor. Codigo: 500");
        model.addAttribute("message", "Se intento dividir un numero entre 0.");
        return "error/arithmethicError";
    }

    @ExceptionHandler(NumberFormatException.class)
    public String numberFormatErrorPage(NumberFormatException ex, Model model) {
        model.addAttribute("error", "Error de servidor. Codigo: 500");
        model.addAttribute("message", "Error de formato " + ex.getMessage().toLowerCase());
        return "error/numberFormatError";
    }

    @ExceptionHandler(UserNotFoundException.class)
    public String userNotFoundErrorPage(UserNotFoundException ex, Model model) {
        model.addAttribute("error", "Error de servidor. Codigo: 500");
        model.addAttribute("message", ex.getMessage().toLowerCase());
        return "error/userNotFoundError";
    }
    
}
