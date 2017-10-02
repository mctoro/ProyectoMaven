
package com.cice.proyectomaven2.dto;

import java.util.List;


public class ContactoDTO {

    private List<String> nombre;
    private List<String> primerApellido;
    private List<String> segundoApellido;
    private List<String> telefono;

    public ContactoDTO() {
    }

    public ContactoDTO(List<String> nombre, List<String> primerApellido, List<String> segundoApellido, List<String> telefono) {
        this.nombre = nombre;
        this.primerApellido = primerApellido;
        this.segundoApellido = segundoApellido;
        this.telefono = telefono;
    }

    public List<String> getNombre() {
        return nombre;
    }

    public void setNombre(List<String> nombre) {
        this.nombre = nombre;
    }

    public List<String> getPrimerApellido() {
        return primerApellido;
    }

    public void setPrimerApellido(List<String> primerApellido) {
        this.primerApellido = primerApellido;
    }

    public List<String> getSegundoApellido() {
        return segundoApellido;
    }

    public void setSegundoApellido(List<String> segundoApellido) {
        this.segundoApellido = segundoApellido;
    }

    public List<String> getTelefono() {
        return telefono;
    }

    public void setTelefono(List<String> telefono) {
        this.telefono = telefono;
    }
    
    

}
