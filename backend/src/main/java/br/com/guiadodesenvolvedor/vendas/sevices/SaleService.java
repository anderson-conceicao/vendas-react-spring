package br.com.guiadodesenvolvedor.vendas.sevices;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import br.com.guiadodesenvolvedor.vendas.dto.SaleDTO;
import br.com.guiadodesenvolvedor.vendas.dto.SaleSuccessDTO;
import br.com.guiadodesenvolvedor.vendas.dto.SaleSumDTO;
import br.com.guiadodesenvolvedor.vendas.entities.Sale;
import br.com.guiadodesenvolvedor.vendas.repositories.SaleRepository;
import br.com.guiadodesenvolvedor.vendas.repositories.SellerRepository;

@Service
public class SaleService {
	
	@Autowired
	private SaleRepository repository;
	
	@Autowired
	private SellerRepository sellerRepository;
	
	
	@Transactional(readOnly = true)
	public Page<SaleDTO> findAll(Pageable pageable){
		sellerRepository.findAll();
		Page<Sale> result=repository.findAll(pageable);
		return result.map(x -> new SaleDTO(x));
	}
	
	@Transactional(readOnly = true)
	public List<SaleSumDTO> amoutGroupedBySeller(){
		return repository.amoutGroupedBySeller();
	}
	

	
	

	@Transactional(readOnly = true)
	public List<SaleSuccessDTO> successGroupedBySeller(){
		return repository.successGroupedBySeller();
	}
}
	
