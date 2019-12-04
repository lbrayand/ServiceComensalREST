package com.elcomensal.serviciorest.entidades;

import com.fasterxml.jackson.annotation.JsonFormat;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name="Reserva")
public class Reserva {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idReserva;
    private String idLocal;
    //private int idMesa;
    private String fechaReserva;
    private String horaReserva;
    private String idMotivo;
    private String estadoReserva;
    private String numPersonas;

    public int getIdReserva() {
        return idReserva;
    }

    public void setIdReserva(int idReserva) {
        this.idReserva = idReserva;
    }

    public String getIdLocal() {
        return idLocal;
    }

    public void setIdLocal(String idLocal) {
        this.idLocal = idLocal;
    }

    public String getFechaReserva() {
        return fechaReserva;
    }

    public void setFechaReserva(String fechaReserva) {
        this.fechaReserva = fechaReserva;
    }

    public String getHoraReserva() {
        return horaReserva;
    }

    public void setHoraReserva(String horaReserva) {
        this.horaReserva = horaReserva;
    }

    public String getIdMotivo() {
        return idMotivo;
    }

    public void setIdMotivo(String idMotivo) {
        this.idMotivo = idMotivo;
    }

    public String getEstadoReserva() {
        return estadoReserva;
    }

    public void setEstadoReserva(String estadoReserva) {
        this.estadoReserva = estadoReserva;
    }

    public String getNumPersonas() {
        return numPersonas;
    }

    public void setNumPersonas(String numPersonas) {
        this.numPersonas = numPersonas;
    }
}
