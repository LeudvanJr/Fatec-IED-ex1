package view;

import controller.NaturaisController;

public class Principal {

	public static void main(String[] args) {
		
		NaturaisController nController = new NaturaisController();
		int numeroTeste = -1;
		int resultado = nController.somar(numeroTeste);
				
		System.out.println(resultado);

	}

}
