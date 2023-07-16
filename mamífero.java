package Animal;

public class mamífero extends animal {

	private static String alimento;
	
private void Atributos() {
	this.getNome();
	this.getAmbiente();
	this.getNumdepatas();
	this.getVeloMedia();
	this.alimento = alimento;
}
static void dadosmamifero() {
	System.out.println("Esses são os dados do mamífero escolhido: " + "\nNome: " 
			+ getNome() + "\nAmbiente: " + getAmbiente() + "\nNúmero de patas: " 
			+ getNumdepatas() + "\nVelocidade média: " + getVeloMedia() 
			+ "\nAlimento do animal: " + alimento);
}

public String getAlimento() {
	return alimento;
}

public void setAlimento(String alimento) {
	this.alimento = alimento;
}



	
	
	
}
