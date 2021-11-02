package com.mycompany.paresynones;

import java.util.Random;
import java.util.Scanner;

public class BAleatorio {

    public static void main(String[] args) {
        //declaramos e inicializamos las variables y objetos necesarios
        Scanner entrada = new Scanner(System.in);  
        Random aleatorio = new Random();
        int ganador;
        int dedosJugador;
        int dedosCPU;
        int totalDedos;
        int seguir;
        int dedosCorrectos = 0; 
        
        do{//inicio del bucle qu econtrola si se repite le juego
            do{//bucle para que se seleccione solo 1 o 2 y se repita si no 
                System.out.println("");
                System.out.println("Jugador, elije: ");
                System.out.println("1='pares' o 2='nones'");
                ganador = entrada.nextInt();
                if(!(ganador == 1 || ganador == 2)){
                    System.out.println("dato erroneo");
                }
            } while(ganador != 1 ? ganador != 2 : 1==2);
                                    // el 1==2 es solo un booleano falso de relleno
        
            do{//bucle para que no se metan mas de 5 dedos
                System.out.println("");
                System.out.println("Introduce número de dedos para jugar: ");
                dedosJugador = entrada.nextInt();
                //if para que se siga el bucle si no esta el numero en el rango indicado
                // el 2 es un dato cualquiera para igualar la variable dedosCorrectos en 
                //el while y que asi se repita el codigo si es erroneo
                if(dedosJugador>=1 && dedosJugador<=5){
                    dedosCorrectos = 2;
                }
                //if para decir que el dato introducido es erroneo 
                if(!(dedosJugador>=1 && dedosJugador<=5)){
                    System.out.println("dato erroneo");
                }
            } while(!(dedosCorrectos == 2));
            
            //uso de Scanner para sacar dedos del 1 a 5 de forma aleatoria  
            dedosCPU = aleatorio.nextInt(5)+1;
            System.out.println("La cpu saca: "+dedosCPU);
            
            //operaciones para calcular el ganador 
            totalDedos = dedosJugador+dedosCPU;
            if(totalDedos%2 == 0){//si el total de dedos es par 
                if(ganador == 1){
                    System.out.println("Ganas");
                }else{
                    System.out.println("Pierdes");
                }
            }else{//si el total de dedos es inpar
                if(ganador == 1){
                    System.out.println("Pierdes");
                }else{
                    System.out.println("Ganas");
                }
            }
            do{//bucle para que se seleccione solo 1 o 2 y se repita si no
                System.out.println("");
                System.out.println("¿Quieres seguir jugando?");
                System.out.println("1='SI' o 2='NO'");
                seguir = entrada.nextInt(); 
                if(!(ganador == 1 || ganador == 2)){
                    System.out.println("dato erroneo");
                }
            } while(ganador != 1 ? ganador != 2 : 1==2);
                                    // el 1==2 es solo un booleano falso de relleno
                                    
        } while(seguir==1);//final del bucle para repetir todo el juego
        
    }
}
