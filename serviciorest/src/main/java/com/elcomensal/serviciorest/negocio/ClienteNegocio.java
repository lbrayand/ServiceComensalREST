package com.elcomensal.serviciorest.negocio;

import com.elcomensal.serviciorest.entidades.Cliente;
import com.elcomensal.serviciorest.repositorio.ClienteRepositorio;
import com.sun.org.apache.xalan.internal.xsltc.runtime.ErrorMessages;
import org.hibernate.engine.jdbc.spi.SqlExceptionHelper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.client.HttpStatusCodeException;
import org.springframework.web.server.ResponseStatusException;
import org.springframework.web.server.handler.ResponseStatusExceptionHandler;
import org.springframework.web.servlet.mvc.annotation.ResponseStatusExceptionResolver;

import java.sql.SQLException;
import java.util.List;

@Service
public class ClienteNegocio {
    @Autowired
    private ClienteRepositorio clienteRepositorio;

    public Cliente registrar (@RequestBody Cliente cliente)
    {
        try
        {
            clienteRepositorio.save(cliente);
        }
        catch (Exception ex)
        {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, ex.getMessage());
        }

            return cliente;
    }

    public List<Cliente> listarClientes()
    {
        return (List<Cliente>)clienteRepositorio.findAll();
    }


}
