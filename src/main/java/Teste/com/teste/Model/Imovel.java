package Teste.com.teste.Model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name = "imovel")
public class Imovel {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column(name = "descricao", nullable = false)
	private String descricao;

	@Column(name = "num_quartos", nullable = false)
	private int num_quartos;

	@Column(name = "bairro", length = 45, nullable = false)
	private String bairro;

	@Column(name = "cidade", length = 45, nullable = false)
	private String cidade;

	@Column(name = "status_imovel", length = 45, nullable = false)
	private String status_imovel;
	
	@JsonIgnore
	@OneToMany(mappedBy = "imovel")
	private List<Foto> fotos = new ArrayList <>();
	
	@ManyToOne
	@JoinColumn(name = "id_user")
	private Usuario usuario;
	
	public Imovel() {		
	}

	public Imovel(Long id, String descricao, int num_quartos, String bairro, String cidade, String status_imovel,
			Usuario usuario) {
		this.id = id;
		this.descricao = descricao;
		this.num_quartos = num_quartos;
		this.bairro = bairro;
		this.cidade = cidade;
		this.status_imovel = status_imovel;
		this.usuario = usuario;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public int getNum_quartos() {
		return num_quartos;
	}

	public void setNum_quartos(int num_quartos) {
		this.num_quartos = num_quartos;
	}

	public String getBairro() {
		return bairro;
	}

	public void setBairro(String bairro) {
		this.bairro = bairro;
	}

	public String getCidade() {
		return cidade;
	}

	public void setCidade(String cidade) {
		this.cidade = cidade;
	}

	public String getStatus_imovel() {
		return status_imovel;
	}

	public void setStatus_imovel(String status_imovel) {
		this.status_imovel = status_imovel;
	}

	public Usuario getUsuario() {
		return usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}

	public List<Foto> getFotos() {
		return fotos;
	}
}
