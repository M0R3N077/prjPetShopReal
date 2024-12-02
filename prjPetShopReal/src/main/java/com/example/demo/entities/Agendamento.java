package com.example.demo.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

@Entity
@Table
public class Agendamento {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	@NotNull
	@Size(min=3,message="minimo de 3 caracteres")
	private String dataHora;
	@Size(min=4,message="minimo de 4 caracteres")
	private String status;
	
	@ManyToOne
	@JoinColumn(name = "cliente_id")
	private Cliente cliente;
	
	
	
	//metodos getts e setts
	
	public String getDataHora() {
		return dataHora;
	}
	public void setDataHora(String dataHora) {
		this.dataHora = dataHora;
	}
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}	
	
	
	public Cliente getCliente() {
		return cliente;
	}
	
	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}
	


}
