package exercise2.app;

import exercise2.classes.*;
import java.util.Scanner;

public class App {
	public static Scanner sc = new Scanner(System.in);
	
	public static final String guion = "-".repeat(20); 
	
	public static void main(String[] args) 
	{
		// Objeto del ticket
		Ticket ticket = null;
		
		// Variable de opcion del menu
		int option = 0;
		
		System.out.println(guion);
		System.out.println("Menu");
		System.out.println(guion);
		System.out.println("0. El vehiculo no es un autobus (Ticket General)");
		System.out.println("1. El vehiculo es un autobus (Ticket Especifico)");
		System.out.println("2. Salir del menu");
		System.out.println(guion);
		System.out.println("Introduzca la opción:");
		option = sc.nextInt();
		
		switch(option) 
		{
			case 0:
				ticket = addGeneralTicket();
				break;
			case 1:
				ticket = addSpecialTicket();
				break;
			case 2:
				System.out.println("Saliendo del menú");
				break;
			default:
				System.out.println("ERROR - El número introducido no es correcto - Opcion entre 0 y 2");
				break;
		}
		
		System.out.println(guion);
		System.out.println("Menu");
		System.out.println(guion);
		System.out.println("0. Definir el km de salida y calcular la tarifa)");
		System.out.println("1. Salir del menu");
		System.out.println(guion);
		System.out.println("Introduzca la opción:");
		option = sc.nextInt();
		
		switch(option)
		{
			case 0:
				calculateAndShowPrize(ticket);
				break;
			case 1:
				System.out.println("Saliendo del menú");
				break;
			default:
				System.out.println("ERROR - El número introducido no es correcto - Opcion entre 0 y 2");
		}
		
		}
	
	// Metodo para calcular y mostrar el tarifa final
	private static void calculateAndShowPrize(Ticket ticket) 
	{
		// Obtener el precio por km de la via
		System.out.println("¿Cual es el km de salida?");
		ticket.setExitKm(sc.nextInt());
		
		// Calcular la tarifa final
		ticket.calculateTariff();
		
		// Mostrar la tarifa final
		System.out.println(guion);
		System.out.println("La tarifa es de: " + ticket.getPrize() + " €");
		System.out.println(guion);
		
		// Mostrar la información completa del ticket
		System.out.println(guion);
		System.out.println(ticket.toString());
		System.out.println(guion);		
	}

	// Metodo para obtener el ticket especial
	private static SpecialTicket addSpecialTicket() 
	{
		// Obtener el precio por km de la via
		System.out.println("¿Cual es el precio por km de la via?");
		double prizePerKm = sc.nextDouble();
		
		// Obtener el km de entrada
		System.out.println("¿Cual es el km de entrada?");
		int entryKm = sc.nextInt();
		
		// Obtener el numero de pasajeros
		System.out.println("¿Cual es el número de pasajeros?");
		int numberOfPassengers = sc.nextInt();
		
		// Retornar el objeto creado
		return new SpecialTicket(prizePerKm, entryKm, numberOfPassengers);
		
	}

	// Metodo para obtener el ticket general
	private static GeneralTicket addGeneralTicket() 
	{
		// Obtener el precio por km de la via
		System.out.println("¿Cual es el precio por km de la via?");
		double prizePerKm = sc.nextDouble();
		
		// Obtener el km de entrada
		System.out.println("¿Cual es el km de entrada?");
		int entryKm = sc.nextInt();	
		
		// Retornar el objeto creado
		return new GeneralTicket(prizePerKm, entryKm);
	}

}
