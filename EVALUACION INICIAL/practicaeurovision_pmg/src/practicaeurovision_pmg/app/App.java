package practicaeurovision_pmg.app;

import practicaeurovision_pmg.classes.*;

public class App 
{

	public static void main(String[] args) 
	{
		// Creación objeto Eurovision 2024
		Eurovision eurovision = new Eurovision(2024);
		
		// Creacion objeto Final de Eurovision 2024
		Final f = new Final(eurovision);
		
		// Hacer votaciones y mostrar resultados
		f.makeAndShowVotationsFinalists(eurovision);

	}

}
