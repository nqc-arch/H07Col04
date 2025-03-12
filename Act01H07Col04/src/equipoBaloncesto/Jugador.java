/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package equipoBaloncesto;

import java.util.Objects;

/**
 *
 * @author dam117
 */
public class Jugador implements Comparable<Jugador> {

    /*ATRIBUTOS*/
    private String nombre;
    private double estatura; //en cm

    /*CONSTRUCTOR*/
    //la estaura debe estar en cm.
    public Jugador(String nombre, double estatura) {
        this.nombre = nombre;
        this.estatura = estatura;
    }

    /*compareTo*/
    @Override
    public int compareTo(Jugador j) {
        double comparacion = this.estatura - j.estatura;
        if (comparacion == 0) {
            return this.nombre.compareToIgnoreCase(j.nombre);
        } else {
            return (int) comparacion;
        }
    }

    /*GET*/
    public String getNombre() {
        return nombre;
    }

    public double getEstatura() {
        return estatura;
    }

    /*SET*/
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setEstatura(double estatura) {
        this.estatura = estatura;
    }

    /*EQUALS AND HASH*/
    @Override
    public int hashCode() {
        int hash = 5;
        hash = 89 * hash + Objects.hashCode(this.nombre);
        hash = 89 * hash + (int) (Double.doubleToLongBits(this.estatura) ^ (Double.doubleToLongBits(this.estatura) >>> 32));
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
        final Jugador other = (Jugador) obj;
        if (Double.doubleToLongBits(this.estatura) != Double.doubleToLongBits(other.estatura)) {
            return false;
        }
        return Objects.equals(this.nombre, other.nombre);
    }

    /*toString*/
    @Override
    public String toString() {
        return this.nombre + "{estatura=" + estatura + "cm}\n";
    }

}
