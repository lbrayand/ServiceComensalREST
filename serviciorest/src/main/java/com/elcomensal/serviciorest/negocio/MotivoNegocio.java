package com.elcomensal.serviciorest.negocio;
import com.elcomensal.serviciorest.entidades.Motivo;
import com.elcomensal.serviciorest.repositorio.MotivoRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MotivoNegocio {

    @Autowired

    private MotivoRepositorio motivoRepositorio;

    public List<Motivo> listarMotivos()
    {
        return (List<Motivo>)motivoRepositorio.findAll();
    }

}
