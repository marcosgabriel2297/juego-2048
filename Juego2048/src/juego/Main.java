package juego;

public class Main {

	public static void main(String[] args) 
	{
		Juego2048 juego= new Juego2048();
		juego.iniciar();
		juego.mostrar();
		juego.mover('a');
		System.out.println();
		juego.mostrar();
	}

}
