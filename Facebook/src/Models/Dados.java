package Models;

public class Dados {
	
	String Nome;
	int dataNascimento;
	String Status;
	String email;
	String Senha;
	
	public String getNome() {
		return Nome;
	}
	public void setNome(String nome) {
		Nome = nome;
	}
	public int getDataNascimento() {
		return dataNascimento;
	}
	public void setDataNascimento(int dataNascimento) {
		this.dataNascimento = dataNascimento;
	}

	public String getStatus() {
		return Status;
	}
	public void setStatus(String status) {
		Status = status;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getSenha() {
		return Senha;
	}
	public void setSenha(String senha) {
		Senha = senha;
	}
	
	
	

}
