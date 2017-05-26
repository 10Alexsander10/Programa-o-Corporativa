package questao1;

import java.util.List;

public class Empresa {
	
	public List<String> Funcionarios;
	public List<Linha> Linhas;
	public List<Onibus> Onibus;
	
	
	public List<String> getFuncionarios() {
		return Funcionarios;
	}
	public void setFuncionarios(List<String> funcionarios) {
		Funcionarios = funcionarios;
	}
	public List<Linha> getLinhas() {
		return Linhas;
	}
	public void setLinhas(List<Linha> linhas) {
		Linhas = linhas;
	}
	public List<Onibus> getOnibus() {
		return Onibus;
	}
	public void setOnibus(List<Onibus> onibus) {
		Onibus = onibus;
	}

}
