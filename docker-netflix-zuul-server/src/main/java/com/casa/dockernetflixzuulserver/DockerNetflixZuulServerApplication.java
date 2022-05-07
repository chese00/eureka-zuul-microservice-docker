package com.casa.dockernetflixzuulserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

@SpringBootApplication
@EnableZuulProxy
public class DockerNetflixZuulServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(DockerNetflixZuulServerApplication.class, args);
	}

}
