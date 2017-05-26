package questao4;

import java.util.List;

public class Cliente {
	
	String Nome;
	List <Compra> compras;
	Recompensas recompenas;
	
	public String getNome() {
		return Nome;
	}
	public void setNome(String nome) {
		Nome = nome;
	}
	public List<Compra> getCompras() {
		return compras;
	}
	public void setCompras(List<Compra> compras) {
		this.compras = compras;
	}
	public Recompensas getRecompenas() {
		return recompenas;
	}
	public void setRecompenas(Recompensas recompenas) {
		this.recompenas = recompenas;
	}

}
