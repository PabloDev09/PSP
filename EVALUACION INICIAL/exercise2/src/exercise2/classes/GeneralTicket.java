package exercise2.classes;

import java.util.Objects;

public class GeneralTicket extends Ticket 
{
	// Variable final para indicar la reduccion del precio
	public final double reduction = 0.10;

	// Contructor vacio
	//	GeneralTicket() 
	//	{
	//		
	//	}
	
	// Contructor parametrizado
	public GeneralTicket(double prizePerKm, int entryKm) 
	{
		this.prizePerKm = prizePerKm;
		this.entryKm = entryKm;	
	}
	
	// Metodo heredado del padre para calcular la tarifa
	@Override
	public void calculateTariff() 
	{
		if((this.exitKm - this.entryKm) >= 500)
		{
			this.prize = 
					((this.exitKm - this.entryKm) * this.prizePerKm)
					-
					((this.exitKm - this.entryKm) * this.prizePerKm) * (this.reduction);
					;
		}
		else
		{
			// La tasa normal
			this.prize = (this.exitKm - this.entryKm) * this.prizePerKm;
		}
		
	
	}
	// Obtener el hashCode del objeto
	@Override
	public int hashCode() 
	{
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + Objects.hash(reduction);
		return result;
	}

	// Obtener si el objeto es igual a otro
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		GeneralTicket other = (GeneralTicket) obj;
		return Double.doubleToLongBits(reduction) == Double.doubleToLongBits(other.reduction);
	}

	// Obtener la información del objeto
	@Override
	public String toString() {
		return "Ticket General: Tarifa= " + getPrize() + "€, Precio por km= "
				+ getPrizePerKm() + "€, Km de entrada= " + getEntryKm() + ", Km de salida= " + getExitKm();
	}
	
	
	
	
}
