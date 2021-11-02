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
            } while(ganador != 1 ? ganador != 2 : 1==2) ;
        
            do{
                System.out.println("");
                System.out.println("Introduce número de dedos para jugar: ");
                dedosJugador = entrada.nextInt();
                if(dedosJugador>=1 && dedosJugador<=5){
                    dedosCorrectos = 2;
                } 
            } while(!(dedosCorrectos == 2));
            
            dedosCPU = aleatorio.nextInt(5)+1;
            System.out.println("La cpu saca: "+dedosCPU);
        
            totalDedos = dedosJugador+dedosCPU;
            if(totalDedos%2 == 0){
                if(ganador == 1){
                    System.out.println("Ganas");
                }else{
                    System.out.println("Pierdes");
                }
            }else{
                if(ganador == 1){
                    System.out.println("Pierdes");
                }else{
                    System.out.println("Ganas");
                }
            }
            System.out.println("");
            System.out.println("¿Quieres seguir jugando?");
            System.out.println("1='SI' o 2='NO'");
            seguir = entrada.nextInt(); 
        } while(seguir==1);
        
    }
}
