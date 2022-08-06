package com.app.spring.orm.SpringORMMyibatis;

import java.util.Date;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@SpringBootApplication
public class SpringOrmMyibatisApplication {

	public static void main(String[] args) {
		//SpringApplication.run(SpringOrmMyibatisApplication.class, args);
		ApplicationContext context = new ClassPathXmlApplicationContext("bean.xml");
		ServiceUser servicio = (ServiceUser) context.getBean("serviceUser");
		
		User user = new User();
		user.setId_user(1);
		user.setNombre_user("Hector");
		user.setRut_user("Zapata");
		user.setEmail_user("hezapata@falabella.cl");
		user.setFecha_registro(new Date());
		user.setFlag_habilitado(1);
		
		int res = servicio.insertUser(user);
		if(res == 1) {
			System.out.println("===>>> Inserto correctamente...");
		} else {
			System.out.println("===>>> Problemas al Insertar.");
		}
		
	}

}
