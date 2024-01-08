package com.techfront.springmasterclass;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@SpringBootApplication
public class SpringMasterClassApplication {

	public static void main(String[] args) {
		//SpringApplication.run(SpringMasterClassApplication.class, args);

		//ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");

		ApplicationContext context = new AnnotationConfigApplicationContext(BeanConfig.class);
		Doctor doctor = context.getBean(Doctor.class);
		doctor.assist();
		doctor.setQualification("MBBS");
		System.out.println(doctor);

		Doctor doctor1 = context.getBean(Doctor.class);
		System.out.println(doctor1);
	}

}
