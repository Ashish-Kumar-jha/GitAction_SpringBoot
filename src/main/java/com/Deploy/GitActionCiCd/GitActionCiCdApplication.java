package com.Deploy.GitActionCiCd;

import com.Deploy.GitActionCiCd.Entity.Student;
import com.Deploy.GitActionCiCd.Service.StudentInter;
import com.Deploy.GitActionCiCd.Service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication

@RestController
public class GitActionCiCdApplication {

	@Value("${spring.data.username}")
	String projName;
	@Value("${server.port}")
	String portNo;
	@Autowired
	StudentInter studentInter;
	@GetMapping("/pipeline-info")
	public String welcome(){
		return "GIT-CI/CD PIPELINE USING -GIT ACTIONS- TRIGGRED \r\n Name: "+projName + " \r\n Port: "+ portNo;
	}
	@PostMapping("/student-data")
	public Student saveStudentData(@RequestBody Student student){
		return this.studentInter.savedata(student);
	}

	public static void main(String[] args) {
		SpringApplication.run(GitActionCiCdApplication.class, args);
	}

}
