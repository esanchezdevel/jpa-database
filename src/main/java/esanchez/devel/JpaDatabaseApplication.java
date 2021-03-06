package esanchez.devel;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@EnableAutoConfiguration
@SpringBootApplication
public class JpaDatabaseApplication {

	public static void main(String[] args) {
		SpringApplication.run(JpaDatabaseApplication.class, args);
	}

}
