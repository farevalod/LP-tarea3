package cl.utfsm.lp.juego;
import cl.utfsm.lp.entidades;
import java.util.*;

public class Juego
{
    static List<Carnivoro> listaCarnivoros = new LinkedList<Carnivoro>();
    static List<Herbivoro> listaHerbivoros = new LinkedList<Herbivoro>();
    static List<Planta> listaPlantas = new LinkedList<Planta>();

    public static void main(String[] args) throws IOException
    {
		Tablero tablero = new Tablero();
		tablero.draw();
		tablero.Iterate();
		return;
	}
}
