package pl.clickandgoApp;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import pl.clickandgoApp.clickandgo.tour.TourEntity;
import pl.clickandgoApp.clickandgo.tour.TourRepository;

import java.time.LocalDate;

@SpringBootApplication
public class ClickAndGoApplication {

	public static void main(String[] args) {
		SpringApplication.run(ClickAndGoApplication.class, args);
	}

	@Bean
	public CommandLineRunner loadData(TourRepository repository) {
		return (args) -> {
			//repository.save(new TourEntity("Warsaw", "Barcelona",, 2022-12-14,1550.00, 1250.00, 2, 3));
		};

	}
}
