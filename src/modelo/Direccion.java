/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

/**
 *
 * @author Joaquin
 */
public class Direccion {
    
    private int cod_postal;
    private String calle;
    private int numero;
    private String ciudad;
    
    Direccion(){
        
    }
    
    Direccion(int cod_postal, String calle, int numero, String ciudad){
        this.cod_postal = cod_postal;
        this.calle = calle;
        this.numero = numero;
        this.ciudad = ciudad;
    }

    public int getCod_postal() {
        return cod_postal;
    }

    public void setCod_postal(int cod_postal) {
        this.cod_postal = cod_postal;
    }

    public String getCalle() {
        return calle;
    }

    public void setCalle(String calle) {
        this.calle = calle;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }
    
    
    
}
