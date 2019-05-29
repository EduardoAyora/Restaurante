/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.controlador;

import ec.edu.ups.modelo.Mesa;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Eduardo Ayora
 */
public class ControladorMesa {

    private List<Mesa> lista;
    private int contador;

    public ControladorMesa() {
        lista = new ArrayList<>();
        contador = 1;
    }

    public int getContador() {
        return contador;
    }

    public List<Mesa> getLista() {
        return lista;
    }

    public void create(Mesa mesa) {
        mesa.setNumeroMesa(contador);
        contador++;
        lista.add(mesa);
    }

    public Mesa read(int codigo) {
        for (Mesa mesa : lista) {
            if (mesa.getNumeroMesa() == codigo) {
                return mesa;
            }
        }
        return null;
    }

    public void update(Mesa mesa) {
        for (int i = 0; i < lista.size(); i++) {
            Mesa elemento = lista.get(i);
            if (elemento.getNumeroMesa() == mesa.getNumeroMesa()) {
                lista.set(i, mesa);
                break;
            }
        }
    }

    public void delete(int codigo) {
        for (int i = 0; i < lista.size(); i++) {
            Mesa elemento = lista.get(i);
            if (elemento.getNumeroMesa() == codigo) {
                lista.remove(i);
                break;
            }
        }
    }

}
