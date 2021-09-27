package aero.api_rest;

import aero.api_rest.utils.PreLoadDataBase;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

//@EnableAutoConfiguration(exclude = {DataSourceAutoConfiguration.class})
@SpringBootApplication
@EnableConfigurationProperties
public class ApiRestApplication implements CommandLineRunner {

	@Autowired
	private PreLoadDataBase preLoadDataBase;

	public static void main(String[] args) {
		SpringApplication.run(ApiRestApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		preLoadDataBase.loadDataBase();
	}

}
