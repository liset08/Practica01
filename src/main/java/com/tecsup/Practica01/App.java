package com.tecsup.Practica01;

import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Bienvenido a Sheyla's, Por favor eliga la seccion que desea ver"
    + "\n"  + "[1]Caballero"
        		+ "\n"  + "[2]Damas" + "\n" + "[3]niños" + "\n" + "[4]bebes");
        Scanner reader = new Scanner(System.in);
        int opcion;
        opcion = reader.nextInt();
        
        if (opcion==1) {
        	SeccionCaballero sc= new SeccionCaballero();
        	
		} else  if (opcion==2){
			SeccionMujeres sm= new SeccionMujeres();
			
		}else  if (opcion==3){
			SeccionNiños sn= new SeccionNiños();
			
		}else  if (opcion==4){
			SeccionBebes sb= new SeccionBebes();
			
		}

        
        
        
    }
}
