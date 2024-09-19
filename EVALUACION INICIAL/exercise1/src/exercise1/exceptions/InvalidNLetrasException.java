package exercise1.exceptions;

@SuppressWarnings("serial")
public class InvalidNLetrasException extends Exception 
{
	public static final String MSG = "ERROR - El número de letras introducido no es correcto, debe ser mayor a 0";
	
	public InvalidNLetrasException()
	{
		System.out.println(MSG);
	}
}
