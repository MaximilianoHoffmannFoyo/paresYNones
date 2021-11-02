package com.mycompany.paresynones;

import java.util.Scanner;

public class AManual {
    
    public static void main(String[] args) {
        //declaramos e inicializamos las variables y objetos necesarios
        Scanner entrada = new Scanner(System.in);               
        
        System.out.println("Que el jugador 1 elija: ");
        System.out.println("1='pares' o 2='nones'");
        int ganador = entrada.nextInt();
        
        System.out.println("Jugador 1");
        System.out.println("Introduce número de dedos");
        int dedosJ1 = entrada.nextInt();
        
        System.out.println("Jugador 2");
        System.out.println("Introduce número de dedos");
        int dedosJ2 = entrada.nextInt();
        
        int totalDedos = dedosJ1+dedosJ2;
        if(totalDedos%2 == 0){
            if(ganador == 1){
                System.out.println("Gana el jugador 1");
            }else{
                System.out.println("Gana el jugador 2");
            }
        }else{
            if(ganador == 1){
                System.out.println("Gana el jugador 2");
            }else{
                System.out.println("Gana el jugador 1");
            }
        }
    }
}
