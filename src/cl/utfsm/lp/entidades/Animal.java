package cl.utfsm.lp.entidades;
public abstract class Animal extends Entidad
{
	String nombre;
	int nroComidas;
	int vida;

	public abstract void getIcono();
	public abstract void mostrarDatos();
	public abstract void mover();
}
