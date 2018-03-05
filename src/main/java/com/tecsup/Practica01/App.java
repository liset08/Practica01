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
		    + "\n"  + "[1]Caballero "
		        		+ "\n"  + "[2]Damas" + "\n" + "[3]niños" + "\n" + "[4]bebes");
        int opcion;
        Scanner reader=new Scanner(System.in);
        opcion = reader.nextInt();
        if (opcion==1) {
        	SeccionCaballero sc= new SeccionCaballero();
        	sc.Caballero();
		} else  if (opcion==2){
			SeccionMujeres sm= new SeccionMujeres();
			sm.Muejeres();
			
		}else  if (opcion==3){
			SeccionNiños sn= new SeccionNiños();
			sn.Niño();
			
		}else  if (opcion==4){
			SeccionBebes sb= new SeccionBebes();
			sb.name();
		}

     
        
    }
    
   
}
