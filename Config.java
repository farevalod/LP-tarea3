package cl.utfsm.lp.juego;
import java.io.*;
import java.util.*;
public class Config
{
	public Config
	{
		BufferedReader is = new BufferedReader(new FileReader("entrada.txt"));
		String line;
		int i;
		line = is.readLine();
		line = is.readLine();
		for (i=0;i<Integer.parseInt(line);i++) 
			listaCarnivoros.add(new Carnivoro("a",1,1));
		line = is.readLine();
		line = is.readLine();
		for (i=0;i<Integer.parseInt(line);i++) 
			listaHerbivoros.add(new Herbivoro("a",1,1,1));
		line = is.readLine();
		line = is.readLine();
		for (i=0;i<Integer.parseInt(line);i++)
			listaPlantas.add(new Planta("a"));
		line = is.readLine();
		static int lim = Integer.parseInt(is.readLine());
	}
}
