/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package equipoBaloncesto;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;
import java.util.function.Predicate;

/**
 *
 * @author dam117
 */
public class Equipo {

    /**/
    private Set<Jugador> jugadores;

    /*CONSTRUCTOR*/
    public Equipo() {
        jugadores = new TreeSet<Jugador>();
    }

    /*GET*/
    public Set<Jugador> getListaJugadores() {
        return jugadores;
    }

    /*SET*/
    public void setListaJugadores(Set<Jugador> jugadores) {
        this.jugadores = jugadores;
    }

    /*METODOS*/
    public void insertarJugador(Jugador j) {
        if (!jugadores.add(j)) {
            System.out.println("El jugador ya esta en la lista.");
        } else {
            jugadores.add(j);
            System.out.println("Jugador insertado con exito.");
        }
    }
    
    public void borrarJugador(String nombre , double estatura){
        Jugador other = new Jugador(nombre,estatura);
        Predicate<Jugador> condicion;
        
    }
}
