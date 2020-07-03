package com.verizion.photoapp.accountmanager;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.ribbon.RibbonClient;

@SpringBootApplication
@RibbonClient
public class PhotoAppAccountmanagerApplication {

	public static void main(String[] args) {
		SpringApplication.run(PhotoAppAccountmanagerApplication.class, args);
	}

}
