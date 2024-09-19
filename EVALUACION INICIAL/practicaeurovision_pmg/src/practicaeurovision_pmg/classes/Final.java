package practicaeurovision_pmg.classes;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class Final 
{
	// Constante para indicar el limite de paises en la final
	public static final int COUNT_OF_FINALISTS = 26;
	
	// Array para almacenar los finalistas
	public Country[] finalists = new Country[COUNT_OF_FINALISTS];
	// Array para el puntuaje disponible
	public int[] scoreToSend = new int[] {1, 2, 3, 4, 5, 6, 7, 8, 10, 12};
	// Variable para identificar el pais ganador
	public Country winner;
	// Variable para identificar el pais con menos puntuaje
	public Country losser;
	
// 	Constructor vacio
//	public Final()
//	{
//		
//	}
	
	// Constructor parametrizado
	public Final(Eurovision eurovision)
	{
		// Añadimos todos los paises que sean finalistas
		addFinalists(eurovision);
	}

	// Metodo para añadir los finalistas al array de finalistas
	private void addFinalists(Eurovision eurovision) {
		// Variable para indicar el indice del array de finalistas
		int countIndex = 0;
		for(int i = 0; i < eurovision.getParticipants().length; i++) 
		{
			// En caso de que el pais sea finalista
			if(eurovision.getParticipants()[i].isFinalist) 
			{
				// Añadir finalista al array
				this.finalists[countIndex] = eurovision.getParticipants()[i];
				// Sumar indice
				countIndex++;
			}
		}
	}

	// Obtener array de finalistas
	public Country[] getFinalists() 
	{
		return finalists;
	}

	// Obtener el ganador
	public Country getWinner() 
	{
		return winner;
	}

	// Definir el ganador
	public void setWinner(Country winner) 
	{
		this.winner = winner;
	}

	// Obtener el pais con menos puntos
	public Country getLosser() 
	{
		return losser;
	}

	// Definir el pais con menos puntos
	public void setLosser(Country losser) 
	{
		this.losser = losser;
	}

	// Obtener array de puntuaje  
	public int[] getScoreToSend() 
	{
		return scoreToSend;
	}

	// Metodo para realizar las votaciones
	public void makeAndShowVotationsFinalists(Eurovision eu)
	{
		for(int i = 0; i < eu.getParticipants().length; i++) 
		{
			// Pais realiza la votacion
			eu.getParticipants()[i].makeVotations(this.finalists);
			
			// Se suma los puntos
			for(int j = 0; j < eu.getParticipants()[i].votedParticipants.length; j++)
			{
				// Se busca el pais que corresponda
				for(int x = 0; x < finalists.length; x++)
				{
					// En caso de que sea igual
					if(eu.getParticipants()[i].votedParticipants[j] != null && this.finalists[x] != null && eu.getParticipants()[i].votedParticipants[j].name.equals(this.finalists[x].getName()))
					{
					// Se suma los puntos que le corresponden
					this.finalists[x].setScore(this.finalists[x].getScore() + this.scoreToSend[j]);
					}
				}
				 
			}
		}
		// Llamar al metodo para mostrar la informacion por orden alfabetico
		showInformations();
		
		// Llamar al metodo para mostrar la informacion de los paises con mas y menos puntuacion
		bestAndWorseScore();
	}

	// Mostrar la información de los paises por orden alfabetico
	private void showInformations() {
		
		Arrays.sort(this.finalists);
		
		for(int i = 0; i < this.finalists.length; i++) 
		{
		System.out.println("--------------------------");
		System.out.println("           Pais " + (i+1));
		System.out.println("--------------------------");
		System.out.println("Nombre del país: " + this.finalists[i].getName());
		System.out.println("Puntos del país: " + this.finalists[i].getScore());
		System.out.println("--------------------------");
		}
	}
	
	// Mostrar la información de los paises con mas y menos puntuacion
	private void bestAndWorseScore() {
		
		// Mapa vacio
		Map<String, Integer> finalistsMap = new HashMap<>();
		
		// Variables para usar maximos y minimos
		int maxScore = Integer.MIN_VALUE;
		int minScore = Integer.MAX_VALUE;
		String maxScoreCountry = "";
		String minScoreCountry = "";
			
		// Añadir paises al mapa
		for(int i = 0; i < this.finalists.length; i++) 
		{
			finalistsMap.put(finalists[i].getName(), finalists[i].getScore());
		}
		
		// Determinar los paises mejor y peor
		for(Map.Entry<String, Integer>entry : finalistsMap.entrySet())
		{
			String nameCountry = entry.getKey();
			Integer scoreCountry = entry.getValue();
			
			if(scoreCountry > maxScore)
			{
				maxScore = scoreCountry;
				maxScoreCountry = nameCountry;
			}
			
			if(scoreCountry < minScore)
			{
				minScore = scoreCountry;
				minScoreCountry = nameCountry;
			}
			
		}
		
		
		System.out.println("--------------------------");
		System.out.println("        Primer Puesto");
		System.out.println("--------------------------");
		System.out.println("País: " + maxScoreCountry);
		System.out.println("Puntuacion: " + maxScore);
		System.out.println("--------------------------");
		System.out.println("        Ultimo Puesto");
		System.out.println("--------------------------");
		System.out.println("País: " + minScoreCountry);
		System.out.println("Puntuacion: " + minScore);
		System.out.println("--------------------------");
		
	}
		
}
	

