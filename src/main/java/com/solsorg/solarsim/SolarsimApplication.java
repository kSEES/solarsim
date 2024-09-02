package com.solsorg.solarsim;

import com.solsorg.solarsim.util.Logger;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SolarsimApplication {
	public static void main(String[] args) {
		Logger.setInstance(new Logger());
		SpringApplication.run(SolarsimApplication.class, args);
	}
}
