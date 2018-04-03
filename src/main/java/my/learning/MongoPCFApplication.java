package my.learning;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan
public class MongoPCFApplication {

	public static void main(String[] args) {
		SpringApplication.run(MongoPCFApplication.class, args);
	}
}
