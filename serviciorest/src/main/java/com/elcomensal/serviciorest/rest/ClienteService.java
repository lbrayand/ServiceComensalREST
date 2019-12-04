package com.elcomensal.serviciorest.rest;

import com.elcomensal.serviciorest.entidades.Cliente;
import com.elcomensal.serviciorest.negocio.ClienteNegocio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/cliente")
public class ClienteService {
    @Autowired
    private ClienteNegocio clienteNegocio;

    @PostMapping("/registrar")
    public Cliente registrar(@RequestBody Cliente cliente)
    {
        return clienteNegocio.registrar(cliente);
    }

    @GetMapping("/listarClientes")
    public List<Cliente> listarClientes()
    {
        return clienteNegocio.listarClientes();
    }
}
