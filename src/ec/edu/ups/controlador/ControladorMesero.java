package ec.edu.ups.controlador;

import ec.edu.ups.modelo.Mesero;
import java.util.HashSet;
import java.util.Set;

/**
 *
 * @author DELL
 */
public class ControladorMesero {

    private Set<Mesero> listaMesero;
    private int cod;

    public ControladorMesero() {
        listaMesero = new HashSet<>();
        cod = 1;
    }

    public int getCod() {
        return cod;
    }

    public void create(Mesero mesero) {
        mesero.setCodigo(cod);
        cod++;
        listaMesero.add(mesero);
    }

    public Mesero read(int codigo) {
        for (Mesero mesero : listaMesero) {
            if (mesero.getCodigo() == codigo) {
                return mesero;
            }
        }
        return null;
    }

    /**
     * Método que actualiza el objeto de la lista
     *
     * @param objeto objeto del mesero
     */
    public void update(Mesero mesero) {
        if (listaMesero.contains(mesero)) {
            listaMesero.remove(mesero);
            listaMesero.add(mesero);
        }
    }

    /**
     * Método que borra el objeto de la lista basándose en el código ingresado
     *
     * @param codigo código del objeto a eliminar
     */
    public void delete(int codigo) {
        for (Mesero mesero : listaMesero) {
            if (mesero.getCodigo() == codigo) {
                listaMesero.remove(mesero);
                break;
            }
        }
    }

    public Set<Mesero> getLista() {
        return listaMesero;
    }
}
