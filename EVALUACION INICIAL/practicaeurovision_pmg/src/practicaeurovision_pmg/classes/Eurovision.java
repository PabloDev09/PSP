package practicaeurovision_pmg.classes;

public class Eurovision 
{	
	// Variable que almacenara la final
	public Final lastfinal ;
	// Array que almacenara los paises participantes
	public Country[] participants = new Country[] {
		    new Country("España", true),
		    new Country("Francia", true),
		    new Country("Alemania", true),
		    new Country("Italia", true),
		    new Country("Reino Unido", true),
		    new Country("Portugal", true),
		    new Country("Serbia", true),
		    new Country("Moldavia", true),
		    new Country("Hungría", true),
		    new Country("Ucrania", true),
		    new Country("Suecia", true),
		    new Country("Australia", true),
		    new Country("Noruega", true),
		    new Country("Dinamarca", true),
		    new Country("Eslovenia", true),
		    new Country("Holanda", true),
		    new Country("Albania", true),
		    new Country("República Checa", true),
		    new Country("Lituania", true),
		    new Country("Israel", true),
		    new Country("Estonia", true),
		    new Country("Bulgaria", true),
		    new Country("Austria", true),
		    new Country("Finlandia", true),
		    new Country("Irlanda", true),
		    new Country("Chipre", true),
		    new Country("Grecia", false),
		    new Country("Croacia", false),
		    new Country("Polonia", false),
		    new Country("Letonia", false),
		    new Country("Georgia", false),
		    new Country("Suiza", false),
		    new Country("Rumania", false),
		    new Country("Bélgica", false),
		    new Country("Malta", false),
		    new Country("Islandia", false),
		    new Country("Montenegro", false),
		    new Country("Luxemburgo", false),
		    new Country("Mónaco", false),
		    new Country("San Marino", false),
		    new Country("Andorra", false),
		    new Country("Bosnia y Herzegovina", false),
		    new Country("Macedonia del Norte", false)
	};
	
	// Variable para almacenar el año
	public int year;
	
// 	Constructor vacio
// 	public Eurovision()
//	{
//		
//	}
	
	// Constructor parametrizado
	public Eurovision(int year) 
	{
		this.year = year;
	}

	// Obtener la final
	public Final getLastfinal() 
	{
		return lastfinal;
	}
	
	// Definir la final
	public void setLastfinal(Final lastfinal) 
	{
		this.lastfinal = lastfinal;
	}

	// Obtener el array de participantes
	public Country[] getParticipants() 
	{
		return participants;
	}

	// Obtener año 
	public int getYear() 
	{
		return year;
	}
	
	
	
}
