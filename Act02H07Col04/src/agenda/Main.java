/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package agenda;

import java.util.Scanner;

/**
 *
 * @author dam117
 */
public class Main {

    public static void main(String[] args) {
        Agenda agenda = new Agenda();
        int opcion = 0;
        Scanner sc = new Scanner(System.in);

        do {
            System.out.println("=====================================");
            System.out.println("Opciones disponibles.");
            System.out.println("1 --> Insertar un contacto en la agenda.");
            System.out.println("2 --> Borrar un contacto. ");
            System.out.println("3 --> Mostrar todos los contactos.");
            System.out.println("4 --> Ver contacto especifico.");
            System.out.println("5 --> Modificar un contacto.");
            System.out.println("6 --> Salir.");
            System.out.println("=====================================");
            System.out.println("Opcion elegida:");
            try {
                opcion = sc.nextInt();
                sc.nextLine();
            } catch (Exception e) {
                System.out.println("=====================================");
                System.out.println("Opcion insertada no valida. Inserte un valor valido.");
            }
            switch (opcion) {
                case 1:
                    System.out.println("=====================================");
                    try {
                        System.out.println("Nombre:");
                        String nombre = sc.nextLine();
                        System.out.println("Apellidos:");
                        String apellidos = sc.nextLine();
                        System.out.println("DNI:");
                        String dni = sc.nextLine();
                        agenda.insertarPersona(new Persona(nombre, apellidos, dni));
                    } catch (Exception e) {
                        System.out.println("=====================================");
                        System.out.println("Dato erroneos. Ingresa datos validos.");
                    }
                    break;
                case 2:
                    System.out.println("=====================================");
                    System.out.println("DNI del contacto a eliminar:");
                    try {
                        agenda.borrarPersona(sc.nextLine());
                    } catch (Exception e) {
                        System.out.println("=====================================");
                        System.out.println("Error.");
                    }
                    break;
                case 3:
                    System.out.println("=====================================");
                    agenda.mostrarContactos();
                    break;
                case 4:
                    System.out.println("=====================================");
                    System.out.println("DNI del contacto a mostrar:");
                    try {
                        agenda.buscarContacto(sc.nextLine());
                    } catch (Exception e) {
                        System.out.println("=====================================");
                        System.out.println("Error.");
                    }
                    break;
                case 5:
                    System.out.println("=====================================");
                    System.out.println("DNI del contacto a modificar:");
                    try {
                        agenda.modificarContacto(sc.nextLine());
                    } catch (Exception e){
                        System.out.println("=====================================");
                        System.out.println("Error.");
                    }
                    break;
                case 6:
                    System.out.println("Programa terminado.");
                    break;
                default:
                    System.out.println("Error. Elegir opcion valida.");

            }
        } while (opcion != 6);
    }
}
