package exercise2.classes;

import java.util.Objects;

public class SpecialTicket extends Ticket 
{
	// Variable final para indicar la reduccion del precio
	public final double reduction = 0.05;
	
	// Atributo para indicar el numero de pasajeros
	public int numberOfPassengers;

	// Contructor vacio
	//	SpecialTicket() 
	//	{
	//		
	//	}
	
	// Contructor parametrizado
	public SpecialTicket(double prizePerKm, int entryKm, int numberOfPassengers) 
	{
		this.prizePerKm = prizePerKm;
		this.entryKm = entryKm;
		this.numberOfPassengers = numberOfPassengers;
	}

	// Obtener el numero de pasajeros
	public int getNumberOfPassengers() 
	{
		return numberOfPassengers;
	}

	// Definir el numero de pasajeros
	public void setNumberOfPassengers(int numberOfPassengers) 
	{
		this.numberOfPassengers = numberOfPassengers;
	}

	// Metodo heredado del padre para calcular la tarifa
	@Override
	public void calculateTariff() 
	{
		if(this.exitKm - this.entryKm >= 100) 
		{
			this.prize = 
					// La tasa normal
					(((this.exitKm - this.entryKm) * this.prizePerKm) * this.numberOfPassengers) 
					- 
					// La reduccion
					(((this.exitKm - this.entryKm) * this.prizePerKm) * this.numberOfPassengers) * (this.reduction);
			
		}
		else 
		{
			// La tasa normal
			this.prize = ((this.exitKm - this.entryKm) * this.prizePerKm) * this.numberOfPassengers;	
		}
		
	}

	// Obtener el hashCode del objeto
	@Override
	public int hashCode() 
	{
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + Objects.hash(numberOfPassengers, reduction);
		return result;
	}

	// Obtener si el objeto es igual a otro
	@Override
	public boolean equals(Object obj) 
	{
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		SpecialTicket other = (SpecialTicket) obj;
		return numberOfPassengers == other.numberOfPassengers
				&& Double.doubleToLongBits(reduction) == Double.doubleToLongBits(other.reduction);
	}

	// Obtener la información del objeto
	@Override
	public String toString() 
	{
		return "Ticket Especial: Tarifa= " + this.getPrize() + "€, Precio por km= " + this.getPrizePerKm() + "€, Km de entrada= "
				+ this.getEntryKm() + ", Km de salida= " + this.getExitKm() + ", Número de pasajeros= " + this.getNumberOfPassengers();
	}
	
	
	
}
