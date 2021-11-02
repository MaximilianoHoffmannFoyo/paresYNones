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
        
        do{
        System.out.println("Jugador, elije: ");
        System.out.println("1='pares' o 2='nones'");
        ganador = entrada.nextInt();
        
        System.out.println("Introduce número de dedos para jugar: ");
        dedosJugador = entrada.nextInt();
        
        
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
            System.out.println("¿Quieres seguir jugando?");
            System.out.println("1='SI' o 2='NO'");
            seguir = entrada.nextInt(); 
        } while(seguir==1);
        
    }
}
