package Teste.com.teste.Model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name = "usuario")
public class Usuario {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column(name = "nome", length = 45, nullable = false)
	private String nome;
	
	@Column(name = "email", length = 45, nullable = false)
	private String email;
	
	@Column(name = "senha", length = 32, nullable = false)
	private String senha;
	
	@Column(name = "token", length = 32, nullable = false)
	private String token;

	@JsonIgnore
	@OneToMany(mappedBy = "usuario")
	private List<Imovel> imoveis = new ArrayList <>();
	
	public Usuario() {		
	}

	public Usuario(Long id, String nome, String email, String senha, String token) {
		this.id = id;
		this.nome = nome;
		this.email = email;
		this.senha = senha;
		this.token = token;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

	public String getToken() {
		return token;
	}

	public void setToken(String token) {
		this.token = token;
	}

	public List<Imovel> getImoveis() {
		return imoveis;
	}
}
