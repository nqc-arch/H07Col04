/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package equipoBaloncesto;

import java.util.Scanner;

/**
 *
 * @author Soliloquy
 */
public class Main {

    public static void main(String[] args) {

        int option = 0;
        Scanner sc = new Scanner(System.in);
        Equipo equipo = new Equipo();

        do {
            System.out.println("Opciones disponibles:");
            System.out.println("1 --> Insertar un jugador.");
            System.out.println("2 --> Borrar un jugador.");
            System.out.println("3 --> Mostrar todos los jugadores.");
            System.out.println("4 --> Mostrar el jugador mas alto.");
            System.out.println("5 --> Mostrar el jugador mas bajo.");
            System.out.println("6 --> Mostrar los jugadores con altura mayor a 2 metros.");
            System.out.println("7 --> Salir.");
            System.out.println("Elije una optcion:");
            option = sc.nextInt();
            sc.nextLine();
            switch (option) {
                case 1:
                    try {
                        System.out.println("Nombre del jugador:");
                        String jNombre = sc.nextLine();
                        System.out.println("Estatura del jugador(cm):");
                        double jEstatura = sc.nextDouble();
                        sc.nextLine();
                        equipo.insertarJugador(new Jugador(jNombre, jEstatura));
                    } catch (Exception e) {
                        System.out.println("Datos introducidos erroneos.");
                    }
                    break;
                case 2:
                    try {
                        System.out.println("Nombre del jugador a eliminar:");
                        String jNombre = sc.nextLine();
                        System.out.println("Estatura del jugador a eliminar(cm):");
                        Double jEstatura = sc.nextDouble();
                        sc.nextLine();
                        equipo.borrarJugador(jNombre, jEstatura);
                    } catch (Exception e) {
                        System.out.println("Datos introducidos erroneos.");
                    }
                    break;
                case 3:
                    System.out.println("Lista de jugadores:");
                    equipo.mostrarJugadores();
                    break;
                case 4:
                    System.out.println("El jugador mas alto es:");
                    System.out.println(equipo.jugadorMasAlto());
                    break;
                case 5:
                    System.out.println("El jugador mas bajo es:");
                    System.out.println(equipo.jugadorMasBajo());
                    break;
                case 6:
                    System.out.println("Jugadores con estatura superior a 2 metros.");
                    System.out.println(equipo.jugadoresMas2Metros());
                    break;
                case 7:
                    option = 7;
                    System.out.println("Programa terminado");
                    break;
                default:
                    System.out.println("Opcion no valida. Introduzca un valor "
                            + "valido.");
                    break;
            }

        } while (option != 7);

    }
}
