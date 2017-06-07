package Models;

import java.util.List;

public class Post {
	
	String data;
	public String getData() {
		return data;
	}
	public void setData(String data) {
		this.data = data;
	}
	Caracteristicas caracteristica;
	List <Acao> acoes;
	
	public Caracteristicas getCaracteristica() {
		return caracteristica;
	}
	public void setCaracteristica(Caracteristicas caracteristica) {
		this.caracteristica = caracteristica;
	}
	public List<Acao> getAcoes() {
		return acoes;
	}
	public void setAcoes(List<Acao> acoes) {
		this.acoes = acoes;
	}
	
	

}
