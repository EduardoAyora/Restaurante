/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.modelo;

import ec.edu.ups.controlador.ControladorDetalle;
import javax.swing.ImageIcon;

/**
 *
 * @author Eduardo Ayora
 */
public class Mesa {
    
    private int numeroMesa;
    private int numeroPersonas;
    private int capacidad;
    private boolean mesaAbierta;
    private Mesero mesero;
    private ControladorDetalle controladorDetalle;

    public Mesa() {
        mesaAbierta = true;
        controladorDetalle = new ControladorDetalle();
    }
    
    public int getNumeroMesa() {
        return numeroMesa;
    }

    public void setNumeroMesa(int numeroMesa) {
        this.numeroMesa = numeroMesa;
    }

    public int getNumeroPersonas() {
        return numeroPersonas;
    }

    public void setNumeroPersonas(int numeroPersonas) {
        this.numeroPersonas = numeroPersonas;
    }

    public int getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(int capacidad) {
        this.capacidad = capacidad;
    }

    public boolean isMesaAbierta() {
        return mesaAbierta;
    }

    public void setMesaAbierta(boolean mesaAbierta) {
        this.mesaAbierta = mesaAbierta;
    }

    public Mesero getMesero() {
        return mesero;
    }

    public void setMesero(Mesero mesero) {
        this.mesero = mesero;
    }
    
    public ControladorDetalle getControladorDetalle() {
        return controladorDetalle;
    }

    public void setControladorDetalle(ControladorDetalle controladorDetalle) {
        this.controladorDetalle = controladorDetalle;
    }
}
