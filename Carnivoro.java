package cl.utfsm.lp.entidades;
public Carnivoro extends Animal implements Atacante, ComeCosas
{
	int ataque;
	void ataca(Entidad e);
	void come(Entidad e);
}
