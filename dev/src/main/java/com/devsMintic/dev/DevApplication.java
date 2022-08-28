package com.devsMintic.dev;
import org.springframework.boot.autoconfigure.jdbc.*;
import org.springframework.boot.autoconfigure.orm.jpa.*;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class })
public class DevApplication {

	public static void main(String[] args) {
		SpringApplication.run(DevApplication.class, args);
	}

}
