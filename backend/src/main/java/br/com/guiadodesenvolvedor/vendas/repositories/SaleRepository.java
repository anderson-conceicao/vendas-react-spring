package br.com.guiadodesenvolvedor.vendas.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.guiadodesenvolvedor.vendas.entities.Sale;

public interface SaleRepository extends JpaRepository<Sale, Long> {

}
