package com.elcomensal.serviciorest.repositorio;

import com.elcomensal.serviciorest.entidades.Reserva;
import org.springframework.data.repository.CrudRepository;

public interface ReservaRepositorio extends CrudRepository<Reserva, Integer> {
}
