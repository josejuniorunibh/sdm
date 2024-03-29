package br.unibh.sdm.backend_cripto;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

/**
 * Contém as configurações para funcionar a documentação de serviços REST com Swagger<br>
 * Endereço: http://servidor:porta/cripto-api/swagger-ui.html 
 * @author jhcru
 *
 */
@Configuration
@EnableSwagger2
public class SwaggerConfiguration {

    @Bean
    public Docket api() {
        return new Docket(DocumentationType.SWAGGER_2).apiInfo(apiInfo())
                .select()
                .apis(RequestHandlerSelectors.any())        
                .paths(PathSelectors.any())
                .build();
    }
    
    private ApiInfo apiInfo() {
        return new ApiInfoBuilder().title("Criptomoeda API")
                .description("API de referência para Criptomoeda e Cotação")
                .license("Licença Apache 2.0")
                .version("Versão 1.0.0").build();
    }
    
    

}