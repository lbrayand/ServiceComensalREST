package com.elcomensal.serviciorest.repositorio;

import com.elcomensal.serviciorest.entidades.Usuario;
import org.springframework.data.repository.CrudRepository;

public interface UsuarioRepositorio extends CrudRepository<Usuario,Long> {
}
