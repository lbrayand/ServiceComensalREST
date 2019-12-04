package com.elcomensal.serviciorest.rest;


import com.elcomensal.serviciorest.entidades.Motivo;
import com.elcomensal.serviciorest.negocio.MotivoNegocio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
@RestController
@RequestMapping("/api/motivo")
public class MotivoService {

    @Autowired
    private MotivoNegocio motivoNegocio;

    @GetMapping("/listarMotivos")
    public List<Motivo> listarMotivos()
    {
        return motivoNegocio.listarMotivos();
    }
}
