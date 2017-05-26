package questao3;

import java.util.List;

public class Aeroporto {
	
	String Nome;
	List <Empresa> empresas;
	List <Rota> Rotas;
	List <Voo> Voos;
	
	public String getNome() {
		return Nome;
	}
	public void setNome(String nome) {
		Nome = nome;
	}
	public List<Empresa> getEmpresas() {
		return empresas;
	}
	public void setEmpresas(List<Empresa> empresas) {
		this.empresas = empresas;
	}
	public List<Rota> getRotas() {
		return Rotas;
	}
	public void setRotas(List<Rota> rotas) {
		Rotas = rotas;
	}
	public List<Voo> getVoos() {
		return Voos;
	}
	public void setVoos(List<Voo> voos) {
		Voos = voos;
	}

}
