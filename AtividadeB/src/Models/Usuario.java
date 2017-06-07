package Models;

import java.util.List;

public class Usuario {
	
	List <Post> posts;
	List <Solicitacao> solicitacoes;
	List <Amigo> amigos;
	List <Grupo> grupos;
	Dados dadosUsuario;
	Feed feed;
	
	public List<Post> getPosts() {
		return posts;
	}
	public void setPosts(List<Post> posts) {
		this.posts = posts;
	}
	public List<Solicitacao> getSolicitacoes() {
		return solicitacoes;
	}
	public void setSolicitacoes(List<Solicitacao> solicitacoes) {
		this.solicitacoes = solicitacoes;
	}
	public List<Amigo> getAmigos() {
		return amigos;
	}
	public void setAmigos(List<Amigo> amigos) {
		this.amigos = amigos;
	}
	public List<Grupo> getGrupos() {
		return grupos;
	}
	public void setGrupos(List<Grupo> grupos) {
		this.grupos = grupos;
	}
	public Dados getDadosUsuario() {
		return dadosUsuario;
	}
	public void setDadosUsuario(Dados dadosUsuario) {
		this.dadosUsuario = dadosUsuario;
	}
	public Feed getFeed() {
		return feed;
	}
	public void setFeed(Feed feed) {
		this.feed = feed;
	}

}
