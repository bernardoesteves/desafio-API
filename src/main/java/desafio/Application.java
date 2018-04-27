package desafio;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import desafio.worker.Worker;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		Worker worker = new Worker();
		worker.start();
		SpringApplication.run(Application.class, args);
	}

}
