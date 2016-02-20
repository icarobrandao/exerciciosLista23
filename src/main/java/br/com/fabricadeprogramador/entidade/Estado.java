package br.com.fabricadeprogramador.entidade;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;



@Entity
@Table(name="Estado")
public class Estado {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Integer id;
	@Column(nullable=false, name="nome",length=100)
	private String nome;
	@Column(nullable=false, name="rg",length=50)
	private String rg;
	@Column(nullable=false, name="cpf", length=50)
	private String cpf;
	
	public Estado() {
		// TODO Auto-generated constructor stub
	}
	public Estado(String nome, String rg, String cpf) {
		super();
		this.nome = nome;
		this.rg = rg;
		this.cpf = cpf;
	}
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getRg() {
		return rg;
	}
	public void setRg(String rg) {
		this.rg = rg;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	
	
}
