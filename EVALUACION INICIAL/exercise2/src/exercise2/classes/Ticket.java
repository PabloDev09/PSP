package exercise2.classes;

import java.util.Objects;

import exercise2.interfaces.*;

public abstract class Ticket implements ITicket
{
	// Atributo para indicar el precio
	public double prize;
	// Atributo para indicar el precio por km
	public double prizePerKm;
	// Atributo para indicar el km de entrada
	public int entryKm;
	// Atributo para indicar el km de salida
	public int exitKm;
	
	// Metodo implementado por la interfaz ITicket
	@Override
	public abstract void calculateTariff();

	// Obtener la tarifa
	public double getPrize() 
	{
		return prize;
	}

	// Definir la tarifa
	public void setPrize(double prize) 
	{
		this.prize = prize;
	}
	
	// Obtener el precio por km
	public double getPrizePerKm() 
	{
		return prizePerKm;
	}

	// Definir el precio por km
	public void setPrizePerKm(double prizePerKm) 
	{
		this.prizePerKm = prizePerKm;
	}

	// Obtener el km de entrada
	public int getEntryKm() 
	{
		return entryKm;
	}

	// Definir el km de entrada
	public void setEntryKm(int entryKm) 
	{
		this.entryKm = entryKm;
	}

	// Obtener el km de salida
	public int getExitKm() 
	{
		return exitKm;
	}

	// Definir el km de salida
	public void setExitKm(int exitKm) 
	{
		this.exitKm = exitKm;
	}

	// Obtener el hashCode 
	@Override
	public int hashCode() 
	{
		return Objects.hash(entryKm, exitKm, prizePerKm);
	}

	// Obtener si el objeto es igual a otro
	@Override
	public boolean equals(Object obj) 
	{
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Ticket other = (Ticket) obj;
		return entryKm == other.entryKm && exitKm == other.exitKm
				&& Double.doubleToLongBits(prizePerKm) == Double.doubleToLongBits(other.prizePerKm);
	}

	// Obtener la información del objeto
	@Override
	public String toString() {
		return "Ticket: Precio= " + this.getPrize() + ", Precio por km= " + this.getPrizePerKm() + ", Km de entrada= " + entryKm + ", Km de salida= " + exitKm
				+ "";
	}
	
	
}
