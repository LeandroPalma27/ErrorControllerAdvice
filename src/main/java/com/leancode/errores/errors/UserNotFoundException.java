package com.leancode.errores.errors;

public class UserNotFoundException extends RuntimeException {

    public UserNotFoundException(Integer id) {
        super("Usuario con el ID: ".concat(id.toString()) + " no existe en el sistema.");
    }

}
