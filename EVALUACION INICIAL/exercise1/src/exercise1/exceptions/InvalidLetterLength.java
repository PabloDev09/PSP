package exercise1.exceptions;

@SuppressWarnings("serial")
public class InvalidLetterLength extends Exception 
{
	public static final String MSG = "ERROR - La palabra introducida debe ser más pequeña";
	
	public InvalidLetterLength()
	{
		System.out.println(MSG);
	}
}

