package controller;

public class NaturaisController {
	
	public NaturaisController() {
		super();
	}
	
	//funcao para somar os naturais de n ate 1
	public int somar(int n) {
		if(n<0) {
			System.out.println("Apenas numeros Naturais");
			return 0;
		}
		
		//o primeiro termo da sequencia de somas é 0 
		if(n<=0)
			return 0;
		
		//O objetivo é somar o numero atual com a sequencia de somas do numero anterior
		return n + somar(n-1);
	}
}
