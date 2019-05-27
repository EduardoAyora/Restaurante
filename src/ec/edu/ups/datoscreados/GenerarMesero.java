/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.datoscreados;

import ec.edu.ups.controlador.ControladorMesero;
import ec.edu.ups.modelo.Mesero;

/**
 *
 * @author Karen
 */
public class GenerarMesero {
    
    private ControladorMesero controladorMesero;
    
    public GenerarMesero(ControladorMesero controladorMesero){
        this.controladorMesero = controladorMesero;
        crearMeseros();
    }
    
    public void crearMeseros(){
        
        Mesero mesero1 = new Mesero();
        mesero1.setNombre("Carlos");
        controladorMesero.create(mesero1);
        Mesero mesero2 = new Mesero();
        mesero2.setNombre("Pedro");
        controladorMesero.create(mesero2);
        Mesero mesero3 = new Mesero();
        mesero3.setNombre("Alex");
        controladorMesero.create(mesero3);
        
    }
    
}
