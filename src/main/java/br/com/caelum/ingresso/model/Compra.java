package br.com.caelum.ingresso.model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;

public class Compra {

	@Id
	@GeneratedValue
	private Long id;
	
	@OneToMany(cascade = CascadeType.PERSIST)
	List<Ingresso> ingressos = new ArrayList<>();
	
	public Compra(){}
	
	public Compra(List<Ingresso> ingressos){
		this.ingressos = ingressos;
	}
	public Long getId() {
		return id;
	}
	public List<Ingresso> getIngressos() {
		return ingressos;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public void setIngressos(List<Ingresso> ingressos) {
		this.ingressos = ingressos;
	}
}
