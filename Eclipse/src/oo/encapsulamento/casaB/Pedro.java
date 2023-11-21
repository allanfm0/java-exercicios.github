package oo.encapsulamento.casaB;

import oo.encapsulamento.casaA.Ana;

public class Pedro extends Ana{
	
	void testeAcesso() {
		Ana mae = new Ana();
		
		//System.out.println(esposa.segredo);
		//System.out.println(facoDentroDeCasa);
		System.out.println(formaDeFalar);
		System.out.println(mae.todosSabem);
		System.out.println(new Ana().todosSabem);
	}
}
