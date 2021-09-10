package br.com.guiadodesenvolvedor.vendas.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.guiadodesenvolvedor.vendas.entities.Seller;

public interface SellerRepository extends JpaRepository<Seller, Long> {

}
