/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.modelo;

import java.util.AbstractList;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Eduardo Ayora
 */
public class Mesero extends Persona{
    
    private String contraseña;
    private List<Mesa> mesas;
    
    public Mesero(){
        mesas = new ArrayList<>();
        contraseña = "1234";
    }

    public void abrirMesa(Mesa mesa){
        mesas.add(mesa);
    }
    
    public void cerrarMesa(Mesa mesa){
        mesas.remove(mesa);
    }
    
    public String getContraseña() {
        return contraseña;
    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }

    public List<Mesa> getMesas() {
        return mesas;
    }
    
}
