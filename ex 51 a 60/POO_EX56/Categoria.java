package POO_EX56;

public class Categoria {
	
	private int idc;
	private String nomec;
	
	public int getIdc() {
		return idc;
	}
	public void setId(int id) {
		this.idc = id;
	}
	public String getNomec() {
		return nomec;
	}
	public void setNome(String nome) {
		this.nomec = nome;
	}
	
	Categoria(){
		
	}
	
	Categoria(int id, String nome){
		this.idc = id;
		this.nomec = nome;
	}
	
}
