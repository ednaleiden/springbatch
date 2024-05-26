package com.springbatch.batch.model;

public class Persona {

    private String primer_nombre;
    private String segundo_nombre;
    private String telefono;

    public Persona() {
        super();
    }

    public Persona(String primer_nombre, String segundo_nombre, String telefono) {
        this.primer_nombre = primer_nombre;
        this.segundo_nombre = segundo_nombre;
        this.telefono = telefono;
    }

    public String getPrimer_nombre() {
        return primer_nombre;
    }

    public void setPrimer_nombre(String primer_nombre) {
        this.primer_nombre = primer_nombre;
    }

    public String getSegundo_nombre() {
        return segundo_nombre;
    }

    public void setSegundo_nombre(String segundo_nombre) {
        this.segundo_nombre = segundo_nombre;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String  telefono) {
        this.telefono = telefono;
    }

    @Override
    public String toString() {
        return "Persona{" +
                "primer_nombre='" + primer_nombre + '\'' +
                ", segundo_nombre='" + segundo_nombre + '\'' +
                ", telefono='" + telefono + '\'' +
                '}';
    }
}
