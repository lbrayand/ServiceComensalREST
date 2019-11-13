package com.elcomensal.serviciorest.negocio;

import com.elcomensal.serviciorest.entidades.Cliente;
import com.elcomensal.serviciorest.repositorio.ClienteRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ClienteNegocio {
    @Autowired
    private ClienteRepositorio clienteRepositorio;

    public Cliente registrar (Cliente cliente)
    {
        return clienteRepositorio.save(cliente);
    }

    public List<Cliente> listarClientes()
    {
        return (List<Cliente>)clienteRepositorio.findAll();
    }


}
