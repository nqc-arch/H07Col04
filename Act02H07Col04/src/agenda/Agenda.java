/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package agenda;

import java.util.Scanner;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;
import java.util.function.Consumer;

/**
 *
 * @author dam117
 */
public class Agenda {

    /*ATRIBUTOS*/
    private Set<Persona> agenda;

    /*CONSTRUCTOR*/
    public Agenda() {
        agenda = new TreeSet<Persona>();
    }

    /*GET*/
    public Set<Persona> getAgenda() {
        return agenda;
    }

    /*SET*/
    public void setAgenda(SortedSet<Persona> agenda) {
        this.agenda = agenda;
    }

    /*METODOS*/
    //insertarPersona(Persona p):
    public void insertarPersona(Persona p) {
        if (!agenda.add(p)) {
            System.out.println("La persona ya existen en la lista.");
        } else {
            agenda.add(p);
            System.out.println("Persona insertada en la agenda con exito.");
        }
    }

    //borrarPersona(String dni):
    public void borrarPersona(String dni) {
        if (agenda.isEmpty()) {
            System.out.println("La agenda esta vacia.");
        } else {
            agenda.removeIf(p -> p.getDni().equalsIgnoreCase(dni));
            System.out.println("Objeto removido con exito.");
        }
    }

    //mostrarContactos();
    public void mostrarContactos() {
        if (agenda.isEmpty()) {
            System.out.println("La agenda esta vacia.");
        } else {
            agenda.forEach(p -> System.out.println(p));
        }
    }

    //buscarContacto(String dni):
    public void buscarContacto(String dni) {
        if (agenda.isEmpty()) {
            System.out.println("La agenda esta vacia.");
        } else if (!agenda.contains(new Persona("", "", dni))) {
            System.out.println("La agenda no contiene a ese contacto.");
        } else {
            agenda.forEach(new Consumer<Persona>() {
                @Override
                public void accept(Persona t) {
                    if (t.getDni().equalsIgnoreCase(dni)) {
                        System.out.println(t);
                    }
                }
            });
        }
    }

    //modificarContacto(String dni):
    public void modificarContacto(String dni) {
        if (agenda.isEmpty() || !agenda.contains(new Persona("", "", dni))) {
            System.out.println("El contacto no se encuentra en la agenda.");
        } else {
            Scanner sc = new Scanner(System.in);
            System.out.println("Elige el dato que quieres modificar:");
            agenda.forEach(new Consumer<Persona>() {
                @Override
                public void accept(Persona t) {
                    if (t.getDni().equalsIgnoreCase(dni)) {
                        int opt = 0;
                        do {
                            System.out.println("=====================================");
                            System.out.println("1 --> Nombre.");
                            System.out.println("2 --> Apellidos.");
                            System.out.println("3 --> DNI.");
                            System.out.println("4 --> Regresar al menu principal.");
                            System.out.println("Opcion:");
                            opt = sc.nextInt();
                            sc.nextLine();
                            switch (opt) {
                                case 1:
                                    System.out.println("Nuevo nombre:");
                                    String newName = sc.nextLine();
                                    t.setNombre(newName);
                                    System.out.println("Cambio realizado con exito.");
                                    break;
                                case 2:
                                    System.out.println("Nuevos apellidos:");
                                    String newApellidos = sc.nextLine();
                                    t.setApellidos(newApellidos);
                                    System.out.println("Cambio realizado con exito.");
                                    break;
                                case 3:
                                    System.out.println("Nuevo DNI:");
                                    String newDni = sc.nextLine();
                                    System.out.println("Cambio realizado con exito.");
                                    break;
                                case 4:
                                    System.out.println("Operacion cancelada.");
                                    break;
                                default:
                                    System.out.println("Opcion no disponible.Elegir opcion disponible");
                                    break;
                            }
                        } while (opt != 4);
                    }
                }

            });

        }
    }
}
