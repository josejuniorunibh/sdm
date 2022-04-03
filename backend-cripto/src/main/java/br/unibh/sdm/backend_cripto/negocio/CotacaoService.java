package br.unibh.sdm.backend_cripto.negocio;

import java.lang.invoke.MethodHandles;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.apache.commons.collections4.IteratorUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import br.unibh.sdm.backend_cripto.entidades.Cotacao;
import br.unibh.sdm.backend_cripto.persistencia.CotacaoRepository;

/**
 * Classe contendo a lógica de negócio para Cotação
 * @author jhcru
 *
 */
@Service
public class CotacaoService {

    private static final Logger logger= LoggerFactory.getLogger(MethodHandles.lookup().lookupClass());
    
    private final CotacaoRepository cotacaoRepo;

    public CotacaoService(CotacaoRepository cotacaoRepository){
        this.cotacaoRepo=cotacaoRepository;
    }
    
    public List<Cotacao> getCotacaos(){
        if(logger.isInfoEnabled()){
            logger.info("Buscando todos os objetos");
        }
        Iterable<Cotacao> lista = this.cotacaoRepo.findAll();
        if (lista == null) {
        	return new ArrayList<Cotacao>();
        }
        return IteratorUtils.toList(lista.iterator());
    }    

    public Cotacao getCotacaoById(String id){
        if(logger.isInfoEnabled()){
            logger.info("Buscando Cotacao com o codigo {}",id);
        }
        Optional<Cotacao> retorno = this.cotacaoRepo.findById(id);
        if(!retorno.isPresent()){
            throw new RuntimeException("Cotacao com o id "+id+" nao encontrada");
        }
        return retorno.get();
    }
    
    public List<Cotacao> getCotacaoByCodigo(String codigo){
    	if(logger.isInfoEnabled()){
            logger.info("Buscando todos os objetos");
        }
        Iterable<Cotacao> lista = this.cotacaoRepo.findByCodigo(codigo);
        if (lista == null) {
        	return new ArrayList<Cotacao>();
        }
        return IteratorUtils.toList(lista.iterator());
    }
    
    public Cotacao saveCotacao(Cotacao cotacao){
        if(logger.isInfoEnabled()){
            logger.info("Salvando Cotacao com os detalhes {}",cotacao.toString());
        }
        return this.cotacaoRepo.save(cotacao);
    }
    
    public void deleteCotacao(String id){
        if(logger.isInfoEnabled()){
            logger.info("Excluindo Cotacao com id {}",id);
        }
        this.cotacaoRepo.deleteById(id);
    }

    public boolean isCotacaoExists(Cotacao cotacao){
    	Optional<Cotacao> retorno = this.cotacaoRepo.findById(cotacao.getCodigo());
        return retorno.isPresent() ? true:  false;
    }

}