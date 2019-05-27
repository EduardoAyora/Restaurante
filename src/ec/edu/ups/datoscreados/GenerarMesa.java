/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.datoscreados;

import ec.edu.ups.controlador.ControladorMesa;
import ec.edu.ups.modelo.Mesa;

/**
 *
 * @author Karen
 */
public class GenerarMesa {

    private ControladorMesa controladorMesa;

    public GenerarMesa(ControladorMesa controladorMesa) {
        this.controladorMesa = controladorMesa;
        crearMesas();
    }

    public void crearMesas() {
        Mesa mesa = new Mesa();

        controladorMesa.create(mesa);
        Mesa mesa2 = new Mesa();

        controladorMesa.create(mesa2);
        Mesa mesa3 = new Mesa();

        controladorMesa.create(mesa3);
        Mesa mesa4 = new Mesa();

        controladorMesa.create(mesa4);
        Mesa mesa5 = new Mesa();

        controladorMesa.create(mesa5);
        Mesa mesa6 = new Mesa();

        controladorMesa.create(mesa6);
        Mesa mesa7 = new Mesa();

        controladorMesa.create(mesa7);
        Mesa mesa8 = new Mesa();

        controladorMesa.create(mesa8);
        controladorMesa.delete(3);
    }

}
