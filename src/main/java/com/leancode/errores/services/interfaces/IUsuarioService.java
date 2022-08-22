package com.leancode.errores.services.interfaces;

import java.util.List;
import java.util.Optional;

import com.leancode.errores.models.domain.Usuario;

public interface IUsuarioService {

    public List<Usuario> listarUsuarios();
    public Usuario obtenerPorId(Integer id);
    public Optional<Usuario> obtenerPorIdOptional(Integer id);

}
