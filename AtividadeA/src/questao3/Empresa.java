package questao3;

import java.util.List;

public class Empresa {
	
	String nome;
	List <Aeronave> aeronaves;
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public List<Aeronave> getAeronaves() {
		return aeronaves;
	}
	public void setAeronaves(List<Aeronave> aeronaves) {
		this.aeronaves = aeronaves;
	}

}
