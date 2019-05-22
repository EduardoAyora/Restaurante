/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.controlador;

import ec.edu.ups.modelo.Detalle;
import java.util.SortedSet;
import java.util.TreeSet;

/**
 *
 * @author Eduardo Ayora
 */
public class ControladorDetalle {
    
    private int contador;
    private SortedSet<Detalle> lista;

    public ControladorDetalle() {
        contador = 1;
        lista = new TreeSet<>();
    }
    
    
    public void createFacturaDetalle(Detalle detalle){
        detalle.setCodigo(contador);
        contador++;
        lista.add(detalle);
    }
    
    public Detalle readFacturaDetalle(int codigo){
        for (Detalle detalle : lista) {
            if(detalle.getCodigo() == codigo){
                return detalle;
            }
        }
        return null;
    }
    
    public void updateDetalle(Detalle detalle){
        if(lista.contains(detalle)){
            lista.remove(detalle);
            lista.add(detalle);
        }
    }
    
    public void deleteFacturaDetalle(int codigo){
        for(Detalle detalle : lista){
            if(detalle.getCodigo() == codigo){
                lista.remove(detalle);
                break;
            }
        }
    }
    
}