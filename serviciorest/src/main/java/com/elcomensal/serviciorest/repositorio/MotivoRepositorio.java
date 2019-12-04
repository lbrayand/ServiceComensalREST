package com.elcomensal.serviciorest.repositorio;

import com.elcomensal.serviciorest.entidades.Cliente;
import com.elcomensal.serviciorest.entidades.Motivo;
import org.springframework.data.repository.CrudRepository;

public interface MotivoRepositorio extends CrudRepository<Motivo,Integer> {
}
