package com.backend.backend;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.reactive.function.client.WebClient;
import reactor.core.publisher.Mono;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

@SpringBootApplication
public class BackendApplication {

	public static void main(String[] args) throws IOException, InterruptedException {
		SpringApplication.run(BackendApplication.class, args);

//		System.out.println("Consulta com HttpClient... aguardando!");
//			HttpClient client = HttpClient.newHttpClient();
//			HttpRequest request = HttpRequest.newBuilder()
//					.uri(URI.create("https://nominatim.openstreetmap.org/reverse?format=json&lat=-23.6913107&lon=-46.4757978"))
//					.build();
//
//			HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());
//			System.out.println(response.body());
//		System.out.println("Consulta com HttpClient... FINALIZADO!!!");
//
//		System.out.println("Inicianto com o WebClient! REATIVO (não trava a thread!! assíncrona");
//		WebClient webClient = WebClient.create("https://nominatim.openstreetmap.org");
//		Mono<String> response2 = webClient.get()
//				.uri("/reverse?format=json&lat=-23.6913107&lon=-46.4757978")
//				.retrieve()
//				.bodyToMono(String.class);
//
//		response2.subscribe(
//				body -> System.out.println("Resposta da API Assíncrona: " + body),
//				error -> System.out.println("Erro: " + error.getMessage())
//		);
//
//		System.out.println("Inicianto com o WebClient! BLOQUEATE (trava a thread!! - SÍNCRONO");
//
//		String response3 = webClient.get()
//				.uri("/reverse?format=json&lat=-23.6913107&lon=-46.4757978")
//				.retrieve()
//				.bodyToMono(String.class)
//				.block(); // Bloqueia até a resposta chegar!
//
//		System.out.println("Reposta : " + response3);


	}

}
