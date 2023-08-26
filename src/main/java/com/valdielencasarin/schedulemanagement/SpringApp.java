package com.valdielencasarin.schedulemanagement;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;

import java.util.Arrays;

@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class })
public class SpringApp {


	public static void main(String[] args) {
		SpringApplication.run(SpringApp.class, args);
		System.out.println("rodando");
	}
}
