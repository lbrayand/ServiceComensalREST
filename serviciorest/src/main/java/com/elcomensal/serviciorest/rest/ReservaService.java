package com.elcomensal.serviciorest.rest;

import com.elcomensal.serviciorest.entidades.Reserva;
import com.elcomensal.serviciorest.negocio.ReservaNegocio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/reserva")
public class ReservaService {
    @Autowired
    private ReservaNegocio reservaNegocio;

    @PostMapping("/registrar")
    public Reserva registrar(@RequestBody Reserva reserva)
    {
        return reservaNegocio.registrar(reserva);
    }
}
