package br.com.netflix.conteudo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.cloud.stream.messaging.Sink;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

import br.com.netflix.conteudo.model.Conteudo;

@EnableBinding(Sink.class) 
@SpringBootApplication
@EnableCircuitBreaker
@EnableEurekaClient
public class ConteudoApplication {
	
	@LoadBalanced
	@Bean
	public RestTemplate restTemplate() {
		return new RestTemplate();
	}

	@StreamListener(Sink.INPUT) 
	public void loggerSink(Conteudo dadoConteudo) { 
		 
	}		
	public static void main(String[] args) {
		SpringApplication.run(ConteudoApplication.class, args);
	}

}
