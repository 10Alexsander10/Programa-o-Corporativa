package Models;

public class Acao {
	
	Curtidas curtida;
	String comentario;
	Compartilhamentos compartilhamento;
	
	public Curtidas getCurtida() {
		return curtida;
	}
	public void setCurtida(Curtidas curtida) {
		this.curtida = curtida;
	}
	public String getComentario() {
		return comentario;
	}
	public void setComentario(String comentario) {
		this.comentario = comentario;
	}
	public Compartilhamentos getCompartilhamento() {
		return compartilhamento;
	}
	public void setCompartilhamento(Compartilhamentos compartilhamento) {
		this.compartilhamento = compartilhamento;
	}
	
	

}
