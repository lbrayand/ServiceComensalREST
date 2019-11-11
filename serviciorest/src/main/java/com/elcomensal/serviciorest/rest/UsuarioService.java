package com.elcomensal.serviciorest.rest;

import com.elcomensal.serviciorest.entidades.Usuario;
import com.elcomensal.serviciorest.negocio.UsuarioNegocio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/usuario")
public class UsuarioService {
    @Autowired
    private UsuarioNegocio usuarioNegocio;

    @PostMapping("/registrar")
    public Usuario registrar(@RequestBody Usuario usuario)
    {
        return usuarioNegocio.registrar(usuario);
    }

    @GetMapping("/listarUsuarios")
    public List<Usuario> listarUsuarios()
    {
        return usuarioNegocio.listarUsuarios();
    }
}
