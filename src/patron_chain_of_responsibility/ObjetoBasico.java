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
public abstract class ObjetoBasico {

    protected ObjetoBasico siguiente;

    private String descripcionPorDefecto() {

        return "descripcion por defecto";

    }

    protected abstract String getDescripcion();

    public String devuelveDescripcion() {

        String resultado;

        resultado = this.getDescripcion();

        if (resultado != null) {
              return resultado;
        }
      

        if (siguiente != null) {
            return siguiente.devuelveDescripcion();
        } else {

            return this.descripcionPorDefecto();
        }
    }

     public void setSiguiente(ObjetoBasico siguiente){

        this.siguiente = siguiente;
        
    }
}
