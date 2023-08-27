package ru.eshop.website;

import lombok.RequiredArgsConstructor;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import ru.eshop.website.entity.Laptop;
import ru.eshop.website.repository.LaptopRepository;
import ru.eshop.website.service.LaptopService;

@SpringBootApplication
@RequiredArgsConstructor
public class WebsiteApplication  {

	private final LaptopRepository laptopRepository;

	public static void main(String[] args) {
		SpringApplication.run(WebsiteApplication.class, args);
	}


}
