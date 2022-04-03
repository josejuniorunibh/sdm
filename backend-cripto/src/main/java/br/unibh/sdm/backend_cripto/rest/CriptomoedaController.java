package br.unibh.sdm.backend_cripto.rest;

import java.util.List;

import javax.validation.constraints.NotNull;

import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.util.ObjectUtils;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import br.unibh.sdm.backend_cripto.entidades.Criptomoeda;
import br.unibh.sdm.backend_cripto.negocio.CriptomoedaService;

/**
 * Classe contendo as definições de serviços REST/JSON para Criptomoeda
 * @author jhcru
 *
 */
@RestController
@RequestMapping(produces = MediaType.APPLICATION_JSON_VALUE, path = "criptomoeda")
public class CriptomoedaController {
   
    private final CriptomoedaService criptomoedaService;

    public CriptomoedaController(CriptomoedaService criptomoedaService){
        this.criptomoedaService=criptomoedaService;
    }

    @GetMapping
    public List<Criptomoeda> getCriptomoedas(){
        return criptomoedaService.getCriptomoedas();
    }
    
    @GetMapping(value="{id}")
    public Criptomoeda getCriptomoedaById(@PathVariable String id) throws Exception{
        if(!ObjectUtils.isEmpty(id)){
           return criptomoedaService.getCriptomoedaByCodigo(id);
        }
        throw new Exception("Criptomoeda com codigo "+id+" nao encontrada");
    }

    @ResponseStatus(HttpStatus.CREATED)
    @PostMapping(value = "", consumes = MediaType.APPLICATION_JSON_VALUE)
    public Criptomoeda createCriptomoeda(@RequestBody @NotNull Criptomoeda criptomoeda) throws Exception {
         return criptomoedaService.saveCriptomoeda(criptomoeda);
    }
    
    @PutMapping(value = "{id}", consumes = MediaType.APPLICATION_JSON_VALUE)
    public Criptomoeda updateCriptomoeda(@PathVariable String id, 
    		@RequestBody @NotNull Criptomoeda criptomoeda) throws Exception {
    	if (!id.equals(criptomoeda.getCodigo())) {
    		throw new Exception("Codigo "+id+" nao está correto");
    	}
    	if (!criptomoedaService.isCriptomoedaExists(criptomoeda)) {
    		throw new Exception("Criptomoeda com codigo "+id+" não existe");
    	}
        return criptomoedaService.saveCriptomoeda(criptomoeda);
    }

    @ResponseStatus(HttpStatus.NO_CONTENT)
    @DeleteMapping(value = "{id}")
    public boolean updateCriptomoeda(@PathVariable String id) throws Exception {
    	if (!criptomoedaService.isCriptomoedaExists(id)) {
    		throw new Exception("Criptomoeda com codigo "+id+" não existe");
    	} 
    	criptomoedaService.deleteCriptomoeda(id);
        return true;
    }
    
}