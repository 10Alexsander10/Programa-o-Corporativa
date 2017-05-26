package questao3;

public class Voo {
	
	int id;
	Rota rota;
	double Hora_saida;
	double Hora_chegada;
	Empresa empresa;
	Aeronave aviao;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public Rota getRota() {
		return rota;
	}
	public void setRota(Rota rota) {
		this.rota = rota;
	}
	public double getHora_saida() {
		return Hora_saida;
	}
	public void setHora_saida(double hora_saida) {
		Hora_saida = hora_saida;
	}
	public double getHora_chegada() {
		return Hora_chegada;
	}
	public void setHora_chegada(double hora_chegada) {
		Hora_chegada = hora_chegada;
	}
	public Empresa getEmpresa() {
		return empresa;
	}
	public void setEmpresa(Empresa empresa) {
		this.empresa = empresa;
	}
	public Aeronave getAviao() {
		return aviao;
	}
	public void setAviao(Aeronave aviao) {
		this.aviao = aviao;
	}

}
