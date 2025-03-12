/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package agenda;

import java.util.Objects;

/**
 *
 * @author Soliloquy
 */
public class Persona implements Comparable<Persona> {

    /*ATRIBUTOS*/
    private String nombre;
    private String apellidos;
    private String dni;

    /*CONSTRUCTOR*/
    public Persona(String nombre, String apellidos, String dni) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.dni = dni;
    }

    /*GET*/
    public String getNombre() {
        return nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public String getDni() {
        return dni;
    }

    /*SET*/
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    /*COMPARETO*/
    @Override
    public int compareTo(Persona o) {
        int comparacion = this.nombre.compareToIgnoreCase(o.nombre);
        if (comparacion == 0) {
            return this.apellidos.compareToIgnoreCase(o.apellidos);
        }
        return comparacion;
    }

    /*EQUALS && HASHCODE*/
    @Override
    public int hashCode() {
        int hash = 5;
        hash = 41 * hash + Objects.hashCode(this.dni);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Persona other = (Persona) obj;
        return Objects.equals(this.dni, other.dni);
    }

    /*TOSTRING*/
    @Override
    public String toString() {
        return this.nombre + " " + this.apellidos + "{" + this.dni + "}";
    }

}
