package com.example.webservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.ws.config.annotation.WsConfigurerAdapter;


import java.util.List;

@SpringBootApplication
public class WebserviceApplication extends WsConfigurerAdapter {
	public static void main(String[] args) {
		SpringApplication.run(WebserviceApplication.class, args);
	}
}
