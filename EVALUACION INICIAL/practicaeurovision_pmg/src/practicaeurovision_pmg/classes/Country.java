package practicaeurovision_pmg.classes;

import java.util.Random;

public class Country implements Comparable<Country>
{
	// Constante para indicar el numero de paises que pueden votar
	public static final int COUNT_OF_VOTED_PARTICIPANTS = 10;
	// Variable para indicar el nombre del país
	public String name;
	// Variable para indicar los puntos del país
	public int score = 0;
	// Variable para indicar si es finalista
	public boolean isFinalist;
	// Array para saber a que paises votan
	public Country[] votedParticipants = new Country[COUNT_OF_VOTED_PARTICIPANTS];
	
	// Constructor parametrizado
	public Country(String name, boolean isFinalist) 
	{
		this.name = name;
		this.isFinalist = isFinalist;
	}

	
	// Obtener el nombre del pais
	public String getName() 
	{
		return name;
	}


	// Definir el nombre del pais
	public void setName(String name) 
	{
		this.name = name;
	}


	// Obtener el puntaje obtenido por el pais
	public int getScore() 
	{
		return score;
	}


	// Definir el puntuaje obtenido por el pais
	public void setScore(int score) 
	{
		this.score = score;
	}


	// Obtener el array de participantes votados
	public Country[] getVotedParticipants() 
	{
		return votedParticipants;
	}


	// Definir el array de participantes votados
	public void setVotedParticipants(Country[] votedParticipants) 
	{
		this.votedParticipants = votedParticipants;
	}


	// Metodo para indicar las votaciones de cada pais 
	public void makeVotations(Country[] finalists)
	{
		// Objeto random
		Random random = new Random();
		// Objeto auxiliar
		Country[] finalistsAux = new Country[finalists.length + 1];
		// Meter paises auxiliares
		for(int i = 0; i < finalists.length; i++)
		{
			finalistsAux[i] = finalists[i];
		}
		
		for(int i = 0; i < votedParticipants.length; i++) 
		{
			// Variable para definir un numero del 0 al 26
			 int randomNumber = random.nextInt(26);
			// En caso de que el pais random dado sea el mismo o esta nulo 
			 if((finalistsAux[randomNumber] == null) ||
				(this.name.equals(finalistsAux[randomNumber].getName())))  	 
			 {
				 // Volvemos a hacer la iteracion
				 i--;
			 }
			 else
			 {
				// Definir el pais votado
					this.votedParticipants[i] = finalistsAux[randomNumber];
				// Eliminamos el equipo votado para no ser votado
					finalistsAux[randomNumber] = null;
			 }
			
		}
	}
	
	// Comparable por nombre
	@Override
	public int compareTo(Country o) {
		return this.name.compareTo(o.name);
	}
	
	
}
