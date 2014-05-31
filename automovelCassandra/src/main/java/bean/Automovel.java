package bean;

public class Automovel {
	private long idCarro;
	private String nome;
	private String velocidadeMax;
	private String cor;
	
	public Automovel() {
		super();
	}
	
	public Automovel(long idCarro, String nome, String velocidadeMax, String cor) {
		super();
		this.idCarro = idCarro;
		this.nome = nome;
		this.velocidadeMax = velocidadeMax;
		this.cor = cor;
	}
	
	public long getIdCarro(){
		return idCarro;
	}
	public void setIdCarro(long idCarro){
		if(idCarro < 0){
			System.out.println("você não pode inserir "
					+ "um valor menor que zero");
		} else {
			this.idCarro = idCarro;
		}
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getVelocidadeMax() {
		return velocidadeMax;
	}
	public void setVelocidadeMax(String velocidadeMax) {
		this.velocidadeMax = velocidadeMax;
	}
	public String getCor() {
		return cor;
	}
	public void setCor(String cor) {
		this.cor = cor;
	}
	
	

}
