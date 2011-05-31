package cl.utfsm.lp.entidades;
import java.util.*;
public class Zoologico
{
	public Entidad crearEntidad()
	{
		return new Carnivoro();
	};
	public LinkedList<Carnivoro> crearEcosistema()
	{
		return new LinkedList<Carnivoro>();
	};
}
