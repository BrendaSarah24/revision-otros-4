package org.generation; //Se creo un proyecto JAVA para crear paquete para dar lugar a la clase y a los objetos :D
import java.util.Scanner; //Faltaba import de Scanner

/*
 * El siguiente programa consiste en simular el juego de piedra, papel o tijera.
 * La clase Scanner nos permite leer entradas de varios origenes, en este caso  la entrada
 * estandar es el teclado.
 * 
 * Con new creamos un objeto de entrada, para que el usuario de una respuesta de las opciones que 
 * se imprimen en consola y pueda ser leida por la funcion. Dependiendo de las respuestas
 * de los jugadores, estan seran procesadas por medio de la condicion if else y switch para 
 * determinar quien es el ganador
 * 
 */

public class ClaseScanner { //Cambie el nombre de la clase

	public static void main(String[] args) {//Faltaba el void main, sintaxis de java para la ejecución entry point
		
	
				Scanner sc;
				sc= new Scanner(System.in); //Faltaba el tipo de entrada para scanner y se corrige la s solita
		    
				System.out.print("Turno del jugador 1 (introduzca piedra, papel o tijeras): ");
				String jugadorUno = sc.nextLine();
		        //Para mas comprension, se cambio el nombre de las variables
				System.out.print("Turno del jugador 2 (introduzca piedra, papel o tijeras): ");
				String jugadorDos = sc.nextLine();
		    
				if (jugadorUno.toLowerCase().equals(jugadorDos.toLowerCase())) { //.equals se utiliza para comparar el contenido de dos strings
					//.equals es case sensitive y se homogeinizan las entradas para evitar errores
					System.out.println("Empate");
						} else {
								int ganador = 2; // se cambia el nombre de la variable 2 para ser mas claros
								
								switch(jugadorUno) {
								case "piedra":
									if (jugadorDos.equals("tijeras")) {
										ganador = 1;
									}else if(jugadorDos.equals("papel")) {
										ganador = 2;
									}break;

								case "papel":
									if (jugadorDos.equals("piedra") ) {
										ganador = 1;
									}else if (jugadorDos.equals("tijeras")){
										ganador = 2;
									}break;
		          
								case "tijera":
										if (jugadorDos.equals("papel")) { //.equals en todo, aqui descubri este metodo
											ganador = 1;
									}else if(jugadorDos.equals("piedra")) {
											ganador = 2;
									}break;
									default:
									}
									System.out.println("Gana el jugador " + ganador);
								}
								
							sc.close(); //Faltaba el sc.close para liberar los recursos
						
						}
		  
	}//Faltaba una llave