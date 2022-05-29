package br.unibh.sdm.backend_cliente;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.WebApplicationType;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

/**
 * Classe executavel que inicia a aplicacao Spring Boot de Cliente
 * @author jhcru
 *
 */
@SpringBootApplication
@EnableJpaRepositories(basePackages = "br.unibh.sdm.backend_cliente.persistencia")
public class Application {

	private static final Logger log = LoggerFactory.getLogger(Application.class);

	
	public static void main(String[] args) {
		log.info("Inicializando...");
	    System.setProperty("server.servlet.context-path", "/cripto-cliente");
	    System.setProperty("server.port", "8080");
		new SpringApplicationBuilder(Application.class).web(WebApplicationType.SERVLET).run(args);
	}
	
}
