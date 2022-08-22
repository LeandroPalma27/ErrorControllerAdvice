package com.leancode.errores.services;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import com.leancode.errores.models.domain.Usuario;
import com.leancode.errores.services.interfaces.IUsuarioService;

import org.springframework.stereotype.Service;

@Service
public class UsuarioService implements IUsuarioService {

    private List<Usuario> listaUsuarios;

    public UsuarioService() {
        this.listaUsuarios = Arrays.asList(new Usuario(1, "Leandro", "Palma"), new Usuario(2, "Martin", "Palma"), new Usuario(3, "Tati", "Palma"));
    }

    @Override
    public List<Usuario> listarUsuarios() {
        return this.listaUsuarios;
    }

    @Override
    public Usuario obtenerPorId(Integer id) {
        Usuario result = null;
        for (var usuario : listaUsuarios) {
            if (usuario.getId().equals(id)) {
                result = usuario;
                break;
            }
        }
        return result;
    }

    @Override
    public Optional<Usuario> obtenerPorIdOptional(Integer id) {
        var usuario = obtenerPorId(id);
        List<String> xd = Arrays.asList("a", "", "x");
        /* xd.forEach((e) -> {
            System.out.println(e.toString());
        }); */
        return Optional.ofNullable(usuario);
    }
    


}
