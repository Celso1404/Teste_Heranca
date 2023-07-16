package Animal;

public class animal {

	private static String nome;
	private static String cor;
	private static String ambiente;
	private static String comprimento;
	private static double veloMedia;
	private static int numdepatas;
	
public void RecebeAtributos() {
	this.nome = nome;
	this.cor = cor;
	this.ambiente = ambiente;
	this.comprimento = comprimento;
	this.veloMedia = veloMedia;
	this.numdepatas = numdepatas;
}

static boolean Dados(){
	
	System.out.println("Os dados registrados sobre o animal são: \nNome:" +
	nome + "\nCor: " + cor + "\nAmbiente: " + ambiente + "\nComprimento: " + comprimento
	+ "\nVelocidade Média: " + veloMedia + "m/s" + "\nNúmero de patas: " + numdepatas);
		return true;
}

public static String getNome() {
	return nome;
}

public void setNome(String nome) {
	this.nome = nome;
}

public String getCor() {
	return cor;
}

public void setCor(String cor) {
	this.cor = cor;
}

public static String getAmbiente() {
	return ambiente;
}

public void setAmbiente(String ambiente) {
	this.ambiente = ambiente;
}

public String getComprimento() {
	return comprimento;
}

public void setComprimento(String comprimento) {
	this.comprimento = comprimento;
}

public static double getVeloMedia() {
	return veloMedia;
}

public void setVeloMedia(double d) {
	this.veloMedia = d;
}

public static int getNumdepatas() {
	return numdepatas;
}

public void setNumdepatas(int numdepatas) {
	this.numdepatas = numdepatas;
}
	

	
}
