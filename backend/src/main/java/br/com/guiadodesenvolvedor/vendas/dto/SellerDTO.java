package br.com.guiadodesenvolvedor.vendas.dto;

import java.io.Serializable;

import br.com.guiadodesenvolvedor.vendas.entities.Seller;

public class SellerDTO implements Serializable {
	private static final long serialVersionUID = 1L;

	private Long id;
	private String name;

	public SellerDTO() {

	}

	public SellerDTO(Seller entity) {

		id = entity.getId();
		name = entity.getName();
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
