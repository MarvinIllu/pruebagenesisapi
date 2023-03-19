package com.pruebagenesisapi;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.net.http.HttpResponse.BodyHandlers;

public class GetToken {

	public static void main(String[] args) throws IOException, InterruptedException {
		// TODO Auto-generated method stub
		System.out.println("Inicia la llama a la API");
		
		String url = "https://api.postman.com/collections/1812533-7bac2f00-48d4-4738-80f1-f66e5e130830?access_key=PMAT-01GV1FDZEJ6KJHK6396MS7GKW3";
		
		HttpClient client = HttpClient.newHttpClient();
		
		HttpRequest request = HttpRequest.newBuilder()
				.uri(URI.create(url))
				.GET()
				.build();
		
		HttpResponse<String> response = client.send(request, BodyHandlers.ofString());
		
		String result = response.body();
		
		//JSONArray json = result.getChars(0, 0, null, 0);
		
		//var count = Object.keys(result).lenght;
		
		//for(int i =0; )
		
		System.out.println(result);
		
		System.out.println("Finaliza la llama a la API");
		
		/*
		try {
			HttpResponse<String> response = client.send(request, BodyHandler);
			System.out.println(response.body());			
		}catch(IOException | IterrruptedException e) {
			e.printStackTrace();
			
		}*/	
		
	}

}
