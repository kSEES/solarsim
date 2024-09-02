package com.solsorg.solarsim;

import com.solsorg.solarsim.model.Planet;
import com.solsorg.solarsim.repository.PlanetRepository;
import com.solsorg.solarsim.util.Logger;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.List;

@SpringBootApplication
public class SolarsimApplication {
	public static void main(String[] args) {
		try{
			Logger.setInstance(new Logger());
		} catch (Exception e){
			System.out.println("Unable to initialize logger.");
		}

		SpringApplication.run(SolarsimApplication.class, args);
	}

	@Bean
	CommandLineRunner init(PlanetRepository planetRepository) {
		return args -> {
			List<Planet> planets = List.of(
					new Planet(0, 0, 0, 3.3011E23, "Mercury", 2.4397E3, 5.067E6, 7.60052E6, 2.056E-1f, 3.4E-2f, 4.6001272E10, 6.98169E10),
					new Planet(0, 0, 0, 4.8675E24, "Venus", 6.0518E3, 2.099676E7, 1.94142E7, 6.8E-3f, 1.7736E2f, 1.07476259E11, 1.08942109E11),
					new Planet(0, 0, 0, 5.972E24, "Earth", 6.371E3, 8.64E4, 3.15576E7, 1.67E-2f, 2.35E1f, 1.4709829E11, 1.521E11),
					new Planet(0, 0, 0, 6.4171E23, "Mars", 3.3895E3, 8.864268E4, 5.93549E7, 9.34E-2f, 2.519E1f, 2.0662E11, 2.4923E11),
					new Planet(0, 0, 0, 1.8982E27, "Jupiter", 6.9911E4, 3.573E4, 3.743E8, 4.89E-2f, 3.13E0f, 7.40572E11, 8.1652E11),
					new Planet(0, 0, 0, 5.6834E26, "Saturn", 5.8232E4, 3.801568E4, 9.29E8, 5.65E-2f, 2.673E1f, 1.353572E12, 1.513327E12),
					new Planet(0, 0, 0, 8.681E25, "Uranus", 2.5362E4, 6.2063712E4, 2.65139E9, 4.57E-2f, 9.777E1f, 2.748939E12, 3.006248E12),
					new Planet(0, 0, 0, 1.02413E26, "Neptune", 2.4622E4, 5.7996736E4, 5.2E9, 8.6E-3f, 2.832E1f, 4.459631E12, 4.5373E12)
			);

            planetRepository.saveAll(planets);
		};
	}
}
