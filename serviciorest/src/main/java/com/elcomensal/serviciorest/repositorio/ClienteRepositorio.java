package com.elcomensal.serviciorest.repositorio;

import com.elcomensal.serviciorest.entidades.Cliente;
import org.springframework.data.repository.CrudRepository;

public interface ClienteRepositorio extends CrudRepository<Cliente,Long> {
}
