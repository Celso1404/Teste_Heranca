package Animal;

import java.util.Scanner;

public class TestarAnimais extends animal {

	public static void main(String[] args) {

		mamífero Camelo = new mamífero();
		Scanner auxiliar = new Scanner(System.in);
		
		System.out.print("Olá, hoje vou ajudar a registrar seu animal!\n");
			Camelo.setNome("Camelo");
			Camelo.setAmbiente("Terrestre");
			Camelo.setCor("Amarelo");
			Camelo.setComprimento("2m");
			Camelo.setNumdepatas(4);
			Camelo.setVeloMedia(2.0);
			Camelo.setAlimento("Planta");
			
		Camelo.dadosmamifero();	
				
//---------------------------------------
		
		peixe Tubarao = new peixe();
		
		Tubarao.setNome("Tubarão");
		Tubarao.setAmbiente("Aquático");
		Tubarao.setCaracteristica("Barbatanas e cauda");
		Tubarao.setCor("Cinza");
		Tubarao.setVeloMedia(1.5);
		Tubarao.setComprimento("300 cm");
		
		System.out.print("\n");
		Tubarao.DadosPeixe();	
		
//----------------------------------------
		
		mamífero Urso = new mamífero();
		
		Urso.setNome("Urso do Canadá");
		Urso.setAmbiente("Floresta");
		Urso.setCor("Marrrom");
		Urso.setNumdepatas(4);
		Urso.setVeloMedia(0.5);
		Urso.setComprimento("180 cm");
		
		System.out.print("\n");
	    Urso.dadosmamifero();
	}

}
