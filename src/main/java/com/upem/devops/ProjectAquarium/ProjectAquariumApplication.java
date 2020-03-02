package com.upem.devops.ProjectAquarium;

import java.util.Collections;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication
public class ProjectAquariumApplication {

	public static void main(String[] args) {
		SpringApplication.run(ProjectAquariumApplication.class, args);
		/*SpringApplication app = new SpringApplication(ProjectAquariumApplication.class);
        app.setDefaultProperties(Collections
          .singletonMap("server.port", "8083"));
        app.run(args);*/
	}

}
