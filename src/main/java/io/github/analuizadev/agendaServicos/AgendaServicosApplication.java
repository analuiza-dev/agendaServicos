package io.github.analuizadev.agendaServicos;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
/* Notação útil apenas para pacotes externos
@ComponentScan(basePackages = {"io.github.analuizadev.repository", 
							   "io.github.analuizadev.controllers"}
			  )
*/
public class AgendaServicosApplication {

	public static void main(String[] args) {
		SpringApplication.run(AgendaServicosApplication.class, args);
	}

}
