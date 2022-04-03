package br.unibh.sdm.backend_cripto.persistencia;

import java.util.List;

import org.socialsignin.spring.data.dynamodb.repository.EnableScan;
import org.springframework.data.repository.CrudRepository;

import br.unibh.sdm.backend_cripto.entidades.Criptomoeda;

/**
 * Esta classe estende o padrão CrudRepository 
 * @author jhcru
 *
 */
@EnableScan()
public interface CriptomoedaRepository extends CrudRepository<Criptomoeda, String> {
	
	List<Criptomoeda> findByNome(String nome);
	
}
