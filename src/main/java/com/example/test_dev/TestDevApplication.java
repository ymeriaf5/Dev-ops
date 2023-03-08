package com.example.test_dev;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class TestDevApplication {

	public String welcome(){
		return"Welcome";
	}
	public static void main(String[] args) {
		SpringApplication.run(TestDevApplication.class, args);
	}
//	echo "# Dev-ops" >> README.md
//	git init
//	git add README.md
//	git commit -m "first commit"
//	git branch -M main
//	git remote add origin https://github.com/ymeriaf5/Dev-ops.git
//	git push -u origin main
}
