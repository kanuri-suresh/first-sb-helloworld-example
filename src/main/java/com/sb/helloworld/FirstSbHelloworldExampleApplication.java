package com.sb.helloworld;

import ch.qos.logback.core.net.SyslogOutputStream;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class FirstSbHelloworldExampleApplication {

	public static void main(String[] args) {
		SpringApplication.run(FirstSbHelloworldExampleApplication.class, args);

		System.out.println("This is the first springboot application");
		System.out.println("Github first commit test");
		System.out.println("Github first commit test1");

	}

}
