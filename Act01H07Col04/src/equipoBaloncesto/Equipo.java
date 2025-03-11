/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package equipoBaloncesto;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;
import java.util.function.Predicate;

/**
 *
 * @author dam117
 */
public class Equipo {

    /**/
    private SortedSet<Jugador> jugadores;

    /*CONSTRUCTOR*/
    public Equipo() {
        jugadores = new TreeSet<Jugador>();
    }

    /*GET*/
    public Set<Jugador> getListaJugadores() {
        return jugadores;
    }

    /*SET*/
    public void setListaJugadores(SortedSet<Jugador> jugadores) {
        this.jugadores = jugadores;
    }

    /*METODOS*/
    //insertarJugador():
    public void insertarJugador(Jugador j) {
        if (!jugadores.add(j)) {
            System.out.println("El jugador ya esta en la lista.");
        } else {
            jugadores.add(j);
            System.out.println("Jugador insertado con exito.");
        }
    }

    //borrarJugador():
    public void borrarJugador(String nombre, double estatura) {
        if (!jugadores.isEmpty()) {
            Jugador other = new Jugador(nombre, estatura);
            Predicate<Jugador> condicion = jugador -> jugador.equals(other);
            jugadores.removeIf(condicion);
            System.out.println("Jugador eliminado con exito.");
        } else {
            System.out.println("La lista esta vacia.");
        }

    }

    //mostrarJugadores():
    public void mostrarJugadores() {
        System.out.println("=========================================");
        for (Jugador j : jugadores) {
            System.out.println(j.toString());
        }
        System.out.println("=========================================");
    }

    //jugadorMasAlto():
    public Jugador jugadorMasAlto() {
        if (jugadores.isEmpty()) {
            System.out.println("La lista esta vacia.");
            return null;
        } else {
            return jugadores.last();
        }
    }

    //jugadorMasBajo():
    public Jugador jugadorMasBajo() {
        if (jugadores.isEmpty()) {
            System.out.println("La lista esta vacia.");
            return null;
        } else {
            return jugadores.first();
        }
    }
    
    //jugadoresMas2Metros():
    public SortedSet jugadoresMas2Metros(){
        if (jugadores.isEmpty()){
            System.out.println("La lista esta vacia.");
            return null;
        } else {
            return jugadores.tailSet(new Jugador("",200));
        }
    }
}
