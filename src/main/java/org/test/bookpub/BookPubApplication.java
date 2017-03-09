package org.test.bookpub;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
public class BookPubApplication {

	@Bean
	public StartupRunner scheduleRunner(){
		return new StartupRunner();
	}

	public static void main(String[] args) {
		SpringApplication.run(BookPubApplication.class, args);
	}
}
