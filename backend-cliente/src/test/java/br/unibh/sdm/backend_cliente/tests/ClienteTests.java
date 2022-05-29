package br.unibh.sdm.backend_cliente.tests;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.List;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.MethodSorters;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import br.unibh.sdm.backend_cliente.entidades.Cliente;
import br.unibh.sdm.backend_cliente.persistencia.ClienteRepository;

/**
 * Classe de testes para a entidade Cliente.
 *  <br>
 * Para rodar, antes sete a seguinte variavel de ambiente: -Dspring.config.location=C:/Users/jhcru/sdm/backend-cliente/
 *  <br>
 * Neste diretoio, criar um arquivo application.properties contendo as seguitnes variaveis:
 * <br>
 * # Connection parameters<br>
 * spring.datasource.url=jdbc:postgresql://HOST:5432/DBNAME<br>
 * spring.datasource.username=USER<br>
 * spring.datasource.password=PASSWORD<br>
 * <br>
 * spring.jpa.properties.hibernate.jdbc.lob.non_contextual_creation=true<br>
 * spring.jpa.properties.hibernate.dialect=org.hibernate.dialect.PostgreSQLDialect<br>
 * spring.jpa.properties.hibernate.show_sql=true<br>
 * spring.jpa.properties.hibernate.format_sql=false<br>
 * <br>
 * # Hibernate ddl auto (create, create-drop, validate, update)<br>
 * spring.jpa.hibernate.ddl-auto=create<br>
 * @author jhcru
 *
 */
@RunWith(SpringRunner.class)
@SpringBootTest
@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class ClienteTests {

    private static Logger LOGGER = LoggerFactory.getLogger(ClienteTests.class);
    private SimpleDateFormat df = new SimpleDateFormat("dd/mm/yyyy");
    
	@Autowired
	private ClienteRepository repository;

	@Test
	public void teste1Criacao() throws ParseException {
		LOGGER.info("Criando objetos...");
		Cliente c1 = new Cliente(null,"Joao Antunes","00000000000","joao@gmail.com","31988887777",df.parse("01/01/2000"),"joao","1234");
		repository.save(c1);

		Cliente c2 = new Cliente(null,"Maria Silva","00000000001","maria@gmail.com","31988887778",df.parse("02/02/1995"),"maria","1234");
		repository.save(c2);

		Cliente c3 = new Cliente(null,"Tiago Santos","00000000002","tiago@gmail.com","31988887779",df.parse("03/03/1980"),"tiago","1234");
		repository.save(c3);
		
		LOGGER.info("Pesquisado todos");
		Iterable<Cliente> lista = repository.findAll();
		assertNotNull(lista.iterator());
		for (Cliente cliente : lista) {
			LOGGER.info(cliente.toString());
		}
		LOGGER.info("Pesquisado um objeto");
		List<Cliente> result = repository.findByNome("Tiago Santos");
		assertEquals(result.size(), 1);
		assertEquals(result.get(0).getEmail(), "tiago@gmail.com");
		LOGGER.info("Encontrado: {}", result.get(0));
	}
	
	
	@Test
	public void teste2Exclusao() throws ParseException {
		LOGGER.info("Excluindo objetos...");
		List<Cliente> result = repository.findByCpf("00000000000");
		for (Cliente cliente : result) {
			LOGGER.info("Excluindo Cliente id = "+cliente.getId());
			repository.delete(cliente);
		}
		result = repository.findByCpf("00000000001");
		for (Cliente cliente : result) {
			LOGGER.info("Excluindo Cliente id = "+cliente.getId());
			repository.delete(cliente);
		}
		result = repository.findByCpf("00000000002");
		for (Cliente cliente : result) {
			LOGGER.info("Excluindo Cliente id = "+cliente.getId());
			repository.delete(cliente);
		}
		result = repository.findByNome("Tiago Santos");
		assertEquals(result.size(), 0);
		LOGGER.info("Exclus�o feita com sucesso");
	}
	
	
}
