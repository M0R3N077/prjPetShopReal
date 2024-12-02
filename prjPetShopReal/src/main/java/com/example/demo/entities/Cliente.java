package com.example.demo.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

@Entity
@Table
public class Cliente {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	@Size(min=8,message="minimo de 8 caracteres")
	private String nome;
	private String phone;
	private String email;
	
	
	public Long getId() {
		return id;
	}
	
	public void setId(Long id) {
		this.id=id;
	}
	
	
	public String getPhone() {
		return phone;
	}
	
	public void setPhone(String phone) {
		this.phone=phone;
	}
	
	
	public String getEmail() {
		return email;
	}
	
	public void setEmail(String email) {
		this.email=email;
	}
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome=nome;
	}
	


}
