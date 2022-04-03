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

import br.unibh.sdm.backend_cripto.entidades.Cotacao;
import br.unibh.sdm.backend_cripto.negocio.CotacaoService;

/**
 * Classe contendo as definições de serviços REST/JSON para Cotacao
 * @author jhcru
 *
 */
@RestController
@RequestMapping(produces = MediaType.APPLICATION_JSON_VALUE, path = "cotacao")
public class CotacaoController {
   
    private final CotacaoService cotacaoService;

    public CotacaoController(CotacaoService cotacaoService){
        this.cotacaoService=cotacaoService;
    }

    @GetMapping(value = "")
    public List<Cotacao> getCotacaos(){
        return cotacaoService.getCotacaos();
    }
    
    @GetMapping(value="{id}")
    public Cotacao getCotacaoById(@PathVariable String id) throws Exception{
        if(!ObjectUtils.isEmpty(id)){
           return cotacaoService.getCotacaoById(id);
        }
        throw new Exception("Cotacao com codigo "+id+" nao encontrada");
    }

    @ResponseStatus(HttpStatus.CREATED)
    @PostMapping(value = "", consumes = MediaType.APPLICATION_JSON_VALUE)
    public Cotacao createCotacao(@RequestBody @NotNull Cotacao cotacao) throws Exception {
         return cotacaoService.saveCotacao(cotacao);
    }
    
    @PutMapping(value = "{id}", consumes = MediaType.APPLICATION_JSON_VALUE)
    public Cotacao updateCotacao(@PathVariable String id, 
    		@RequestBody @NotNull Cotacao cotacao) throws Exception {
         return cotacaoService.saveCotacao(cotacao);
    }

    @ResponseStatus(HttpStatus.NO_CONTENT)
    @DeleteMapping(value = "{id}")
    public boolean updateCotacao(@PathVariable String id) throws Exception {
         cotacaoService.deleteCotacao(id);
         return true;
    }
    
}