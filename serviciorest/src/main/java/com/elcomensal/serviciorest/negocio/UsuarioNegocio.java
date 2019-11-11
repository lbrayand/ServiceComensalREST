package com.elcomensal.serviciorest.negocio;

import com.elcomensal.serviciorest.entidades.Usuario;
import com.elcomensal.serviciorest.repositorio.UsuarioRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UsuarioNegocio {
    @Autowired
    private UsuarioRepositorio usuarioRepositorio;

    public Usuario registrar (Usuario usuario)
    {
        return usuarioRepositorio.save(usuario);
    }

    public List<Usuario> listarUsuarios()
    {
        return (List<Usuario>)usuarioRepositorio.findAll();
    }


}
