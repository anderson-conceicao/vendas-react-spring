package br.com.guiadodesenvolvedor.vendas.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import br.com.guiadodesenvolvedor.vendas.dto.SaleSuccessDTO;
import br.com.guiadodesenvolvedor.vendas.dto.SaleSumDTO;
import br.com.guiadodesenvolvedor.vendas.entities.Sale;

public interface SaleRepository extends JpaRepository<Sale, Long> {

	
	@Query("SELECT new br.com.guiadodesenvolvedor.vendas.dto.SaleSumDTO(obj.seller,SUM(obj.amount))"
			+ " FROM Sale AS obj GROUP BY obj.seller ")
	List<SaleSumDTO> amoutGroupedBySeller();


	@Query("SELECT new br.com.guiadodesenvolvedor.vendas.dto.SaleSuccessDTO(obj.seller,SUM(obj.visited),SUM(obj.deals))"
			+ " FROM Sale AS obj GROUP BY obj.seller ")
	List<SaleSuccessDTO> successGroupedBySeller();





}
