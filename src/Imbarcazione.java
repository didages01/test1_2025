// ver 0

public class Imbarcazione {
	private String nome;
	private float lunghezza;
	private float peso;

	public Imbarcazione(String nome, float lunghezza, float peso) {
		this.nome = nome;
		this.lunghezza = lunghezza;
		this.peso = peso;
	}

	public String getNomeBarca() {
		return nome;
	}

	public void setNomeBarca(String nome) {
		this.nome = nome;
	}

	public float getPeso() {
		return peso;
	}

	public void setPeso(float peso) {
		this.peso = peso;
	}

	public float getLunghezza() {
		return lunghezza;
	}

	@Override
	public String toString() {
		return "Imbarcazione [nome=" + nome + ", lunghezza=" + lunghezza + ", peso=" + peso + "]";
	}
	
	// test di classe
	public static void main(String[] args) {
		Imbarcazione i1=new Imbarcazione("pinta", 30, 40);
		Imbarcazione i2=new Imbarcazione("nina", 20, 27);
		Imbarcazione i3=new Imbarcazione("santa maria", 34, 44);
		System.out.println(i1);
		System.out.println(i2);
		System.out.println(i3);
		// test getPeso
		System.out.println("peso oggetto i3 "+i3.getPeso());
		i3.setPeso(67);
		System.out.println("peso oggetto i3 "+i3.getPeso());
		
	}
}