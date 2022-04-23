package com.Deploy.GitActionCiCd;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication

@RestController
public class GitActionCiCdApplication {

	@Value("${spring.datasource.username}")
	String projName;

	@Value("${server.port}")
	String portNo;
	@GetMapping("/pipeline-info")
	public String welcome(){
		return "GIT-CI/CD PIPELINE USING GIT ACTIONS TRIGGRED \r\n Name: "+projName + " \r\n Port: "+ portNo;

	}
	public static void main(String[] args) {
		SpringApplication.run(GitActionCiCdApplication.class, args);
	}

}
