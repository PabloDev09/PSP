package exercise1.app;

import java.io.File;
import java.io.IOException;

import exercise1.classes.AlphabetSoup;
import exercise1.classes.Coordinate;
import exercise1.exceptions.InvalidLetterLength;
import exercise1.exceptions.InvalidNLetrasException;

public class App {
	public static final String linea = "-".repeat(12);
	
	
	public static void main(String[] args) throws InvalidNLetrasException, InvalidLetterLength, IOException {
		AlphabetSoup tonto = new AlphabetSoup(12);
		File file = new File("partida.txt");
		
		System.out.println(linea);
		System.out.println(tonto.toString());
		System.out.println(linea);
		
		tonto.placeHorizontalWord("ToNtO", new Coordinate(3, 2), "InvErSO");
		
		System.out.println(linea);
		System.out.println(tonto.toString());
		System.out.println(linea);
		
		tonto.placeVerticalWord("PENEQUE", new Coordinate(3, 2), "InvErSO");
		
		System.out.println(linea);
		System.out.println(tonto.toString());
		System.out.println(linea);
		
		System.out.println("Lista de letras repetidas");
		tonto.printSummary();
		
		tonto.placeVerticalWord("kenivel", new Coordinate(1, 4), "natural");
		
		System.out.println(linea);
		System.out.println(tonto.toString());
		System.out.println(linea);
		
		tonto.reloadDataFromFile(file);
		
		System.out.println(linea);
		System.out.println(tonto.toString());
		System.out.println(linea);
	}

}
