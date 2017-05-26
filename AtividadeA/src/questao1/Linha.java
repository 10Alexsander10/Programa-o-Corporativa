package questao1;

import java.util.List;

public class Linha {
	
    int id;
    List<Onibus> listaOnibus;
    List<Ponto> pontos;



    public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

    public List<Onibus> getListaOnibus() {
        return listaOnibus;
    }

    public void setListaOnibus(List<Onibus> listaOnibus) {
        this.listaOnibus = listaOnibus;
    }

	public List<Ponto> getPontos() {
		return pontos;
	}

	public void setPontos(List<Ponto> pontos) {
		this.pontos = pontos;
	}

}
