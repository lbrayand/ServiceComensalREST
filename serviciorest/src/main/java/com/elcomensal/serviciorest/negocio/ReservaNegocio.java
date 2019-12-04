package com.elcomensal.serviciorest.negocio;

import com.elcomensal.serviciorest.entidades.Cliente;
import com.elcomensal.serviciorest.entidades.Reserva;
import com.elcomensal.serviciorest.repositorio.ReservaRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.server.ResponseStatusException;

@Service
public class ReservaNegocio {
    @Autowired
    private ReservaRepositorio reservaRepositorio;

    public Reserva registrar (@RequestBody Reserva reserva)
    {
        try
        {
            reservaRepositorio.save(reserva);
        }
        catch (Exception ex)
        {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, ex.getMessage());
        }

        return reserva;
    }
}
