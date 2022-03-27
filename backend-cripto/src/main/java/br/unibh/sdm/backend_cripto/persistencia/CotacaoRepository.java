package br.unibh.sdm.backend_cripto.persistencia;

import java.util.List;
import java.util.UUID;

import org.socialsignin.spring.data.dynamodb.repository.EnableScan;
import org.springframework.data.repository.CrudRepository;

import br.unibh.sdm.backend_cripto.entidades.Cotacao;

/**
 * Esta classe estende o padrão CrudRepository 
 * @author jhcru
 *
 */
@EnableScan()
public interface CotacaoRepository extends CrudRepository<Cotacao, UUID> {
	
	List<Cotacao> findByCodigo(String codigo);
	
}
