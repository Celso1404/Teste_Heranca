package Animal;

public class peixe extends animal {

	private String caracteristica;
	

public void Atributos() {
	this.setNome(getNome());
	this.setComprimento(getComprimento());
	this.setCor(getCor());
	this.setVeloMedia(getVeloMedia());
	this.caracteristica = caracteristica;
	
}
public void DadosPeixe() {
	System.out.println("Os dados do peixe são: \nNome: " + getNome() + "\nCor: "
			+ getCor() + "\nComprimento: " + getComprimento() + "\nVelocidade média: "
			+ getVeloMedia() + "\nCaracterística: " + caracteristica);
}

public String getCaracteristica() {
	return caracteristica;
}
public void setCaracteristica(String caracteristica) {
	this.caracteristica = caracteristica;
}




}
