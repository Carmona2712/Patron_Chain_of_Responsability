/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package patron_chain_of_responsibility;

/**
 *
 * @author Ricardo Carmona
 */
public class Vehiculo extends ObjetoBasico {

    protected String descripcion;

    public Vehiculo(String descripcion) {
        this.descripcion = descripcion;
    }

    @Override
    protected String getDescripcion() {
        return descripcion;
    }
}
