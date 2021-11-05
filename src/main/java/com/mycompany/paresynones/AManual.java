package com.mycompany.paresynones;

import java.util.InputMismatchException;
import java.util.Scanner;

//enlace al repositorio de GitHub:
//https://github.com/MaximilianoHoffmannFoyo/paresYNones.git
public class AManual {

    public static void main(String[] args) {
        //declaramos e inicializamos las variables y objetos necesarios
        Scanner entrada = new Scanner(System.in);
        int ganador = 0;
        int dedosJ1 = 0;
        int dedosJ2 = 0;
        int totalDedos;
        int seguir = 0;//variable para el bucle que repite todo el codigo
        int dedosCorrectosJ1 = 0;
        int dedosCorrectosJ2 = 0;
        //booleano para controlar los bucles que controlan que no se metan letras
        // cuando se piden números a los jugadores
        boolean controladorNoletras = true;

        do {//inicio del bucle qu econtrola si se repite le juego
            do {//bucle para que se seleccione solo 1 o 2 y se repita si no 
                do {//bucle para controlar errores al introducir texto
                    try {
                        System.out.println("");
                        System.out.println("Que el jugador 1 elija: ");
                        System.out.println("1='pares' o 2='nones'");
                        ganador = entrada.nextInt();
                        if (!(ganador == 1 || ganador == 2)) {
                            System.out.println("\n\nDato erroneo, introduce solo 1 o 2");
                        }
                        controladorNoletras = false;
                    } catch (InputMismatchException ime) {
                        System.out.println("\n\nDato erroneo, introduce solo 1 o 2");
                        String limpiar = entrada.nextLine();//variable solo usada para limpiar
                    }
                } while (controladorNoletras);
                controladorNoletras = true;//vuelve a ser verdadera para ser reutilizada
            } while (ganador != 1 ? ganador != 2 : 1 == 2);
            // el 1==2 es solo un booleano falso de relleno

            do {//bucle para que no se metan mas de 5 dedos
                do {//bucle para controlar errores al introducir texto
                    try {
                        System.out.println("");
                        System.out.println("Jugador 1");
                        System.out.println("Introduce número de dedos");
                        dedosJ1 = entrada.nextInt();
                        //if para que se siga el bucle si no esta el numero en el rango indicado
                        // el 2 es un dato cualquiera para igualar la variable dedosCorrectos en 
                        //el while y que asi se repita el codigo si es erroneo
                        if (dedosJ1 >= 1 && dedosJ1 <= 5) {
                            dedosCorrectosJ1 = 2;
                        }
                        //if para decir que el dato introducido es erroneo 
                        if (!(dedosJ1 >= 1 && dedosJ1 <= 5)) {
                            System.out.println("\n\nDato erroneo, introduce solo números entre 1 y 5");
                        }
                        controladorNoletras = false;
                    } catch (InputMismatchException ime) {
                        System.out.println("\n\nDato erroneo, introduce solo números entre 1 y 5");
                        String limpiar = entrada.nextLine();//variable solo usada para limpiar
                    }
                } while (controladorNoletras);
                controladorNoletras = true;//vuelve a ser verdadera para ser reutilizada
            } while (!(dedosCorrectosJ1 == 2));
            dedosCorrectosJ1 = 0;

            do {//bucle para que no se metan mas de 5 dedos
                do {//bucle para controlar errores al introducir texto
                    try {
                        System.out.println("");
                        System.out.println("Jugador 2");
                        System.out.println("Introduce número de dedos");
                        dedosJ2 = entrada.nextInt();
                        //if para que se siga el bucle si no esta el numero en el rango indicado
                        // el 2 es un dato cualquiera para igualar la variable dedosCorrectos en 
                        //el while y que asi se repita el codigo si es erroneo
                        if (dedosJ2 >= 1 && dedosJ2 <= 5) {
                            dedosCorrectosJ2 = 2;
                        }
                        //if para decir que el dato introducido es erroneo 
                        if (!(dedosJ2 >= 1 && dedosJ2 <= 5)) {
                            System.out.println("\n\nDato erroneo, introduce solo números entre 1 y 5");
                        }
                        controladorNoletras = false;
                    } catch (InputMismatchException ime) {
                        System.out.println("\n\nDato erroneo, introduce solo números entre 1 y 5");
                        String limpiar = entrada.nextLine();//variable solo usada para limpiar
                    }
                } while (controladorNoletras);
                controladorNoletras = true;//vuelve a ser verdadera para ser reutilizada
            } while (!(dedosCorrectosJ2 == 2));
            dedosCorrectosJ2 = 0;

            //operaciones para calcular el ganador
            totalDedos = dedosJ1 + dedosJ2;
            if (totalDedos % 2 == 0) {
                if (ganador == 1) {
                    System.out.println("Gana el jugador 1");
                } else {
                    System.out.println("Gana el jugador 2");
                }
            } else {
                if (ganador == 1) {
                    System.out.println("Gana el jugador 2");
                } else {
                    System.out.println("Gana el jugador 1");
                }
            }
            do {//bucle para que se seleccione solo 1 o 2 y se repita si no
                do {//bucle para controlar errores al introducir texto
                    try {
                        System.out.println("");
                        System.out.println("¿Quieres seguir jugando?");
                        System.out.println("1='SI' o 2='NO'");
                        seguir = entrada.nextInt();
                        if (!(seguir == 1 || seguir == 2)) {
                            System.out.println("\n\nDato erroneo, introduce solo 1 o 2");
                        }
                        controladorNoletras = false;
                    } catch (InputMismatchException ime) {
                        System.out.println("\n\nDato erroneo, introduce solo 1 o 2");
                        String limpiar = entrada.nextLine();//variable solo usada para limpiar
                    }
                } while (controladorNoletras);
                controladorNoletras = true;//vuelve a ser verdadera para ser reutilizada
            } while (seguir != 1 ? seguir != 2 : 1 == 2);
            // el 1==2 es solo un booleano falso de relleno

        } while (seguir == 1);//final del bucle para repetir todo el juego    
    }
}
