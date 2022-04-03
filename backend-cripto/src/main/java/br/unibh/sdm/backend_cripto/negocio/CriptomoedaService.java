package br.unibh.sdm.backend_cripto.negocio;

import java.lang.invoke.MethodHandles;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.apache.commons.collections4.IteratorUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import br.unibh.sdm.backend_cripto.entidades.Criptomoeda;
import br.unibh.sdm.backend_cripto.persistencia.CriptomoedaRepository;

/**
 * Classe contendo a lógica de negócio para Criptomoeda
 * @author jhcru
 *
 */
@Service
public class CriptomoedaService {

    private static final Logger logger= LoggerFactory.getLogger(MethodHandles.lookup().lookupClass());
    
    private final CriptomoedaRepository criptomoedaRepo;

    public CriptomoedaService(CriptomoedaRepository criptomoedaRepository){
        this.criptomoedaRepo=criptomoedaRepository;
    }
    
    public List<Criptomoeda> getCriptomoedas(){
        if(logger.isInfoEnabled()){
            logger.info("Buscando todos os objetos");
        }
        Iterable<Criptomoeda> lista = this.criptomoedaRepo.findAll();
        if (lista == null) {
        	return new ArrayList<Criptomoeda>();
        }
        return IteratorUtils.toList(lista.iterator());
    }

    public Criptomoeda getCriptomoedaByCodigo(String codigo){
        if(logger.isInfoEnabled()){
            logger.info("Buscando Criptomoeda com o codigo {}",codigo);
        }
        Optional<Criptomoeda> retorno = this.criptomoedaRepo.findById(codigo);
        if(!retorno.isPresent()){
            throw new RuntimeException("Criptomoeda com o codigo "+codigo+" nao encontrada");
        }
        return retorno.get();
    }
    
    public Criptomoeda getCriptomoedaByNome(String nome){
        if(logger.isInfoEnabled()){
            logger.info("Buscando Criptomoeda com o nome {}",nome);
        }
        List<Criptomoeda> lista = this.criptomoedaRepo.findByNome(nome);
        if(lista == null || lista.isEmpty()){
            throw new RuntimeException("Criptomoeda com o nome "+nome+" nao encontrada");
        }
        return lista.get(0);
    }

    public Criptomoeda saveCriptomoeda(Criptomoeda criptomoeda){
        if(logger.isInfoEnabled()){
            logger.info("Salvando Criptomoeda com os detalhes {}",criptomoeda.toString());
        }
        return this.criptomoedaRepo.save(criptomoeda);
    }
    
    public void deleteCriptomoeda(String codigo){
        if(logger.isInfoEnabled()){
            logger.info("Excluindo Criptomoeda com id {}",codigo);
        }
        this.criptomoedaRepo.deleteById(codigo);
    }

    public boolean isCriptomoedaExists(Criptomoeda criptomoeda){
    	Optional<Criptomoeda> retorno = this.criptomoedaRepo.findById(criptomoeda.getCodigo());
        return retorno.isPresent() ? true:  false;
    }

    public boolean isCriptomoedaExists(String codigo){
    	Optional<Criptomoeda> retorno = this.criptomoedaRepo.findById(codigo);
        return retorno.isPresent() ? true:  false;
    }
}