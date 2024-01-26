package com.vrx.spring.orm;

import com.vrx.spring.orm.entity.User;
import com.vrx.spring.orm.mapping.ManyToManyMapping;
import com.vrx.spring.orm.mapping.OneToManyMapping;
import com.vrx.spring.orm.mapping.OneToOneMapping;
import com.vrx.spring.orm.service.UserService;
import com.vrx.spring.orm.service.impl.UserServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@SpringBootApplication
public class SpringOrmApplication implements CommandLineRunner {

	@Autowired
	public UserService  userService;

	@Autowired
	public OneToOneMapping oneToOneMapping;

	@Autowired
	private OneToManyMapping oneToManyMapping;

	@Autowired
	private ManyToManyMapping manyToManyMapping;

	public static void main(String[] args) {
		SpringApplication.run(SpringOrmApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
//		User user = new User();
//		user.setAge(38);
//		user.setCity("Goa");
//		user.setName("Ram");
//		userService.saveUser(user);
//		userService.getUser(2);
//		userService.getAllUsers();
//		userService.updateUser(user,2);
//		userService.deleteUser(2);

		oneToOneMapping.saveStudent();
//		oneToManyMapping.saveStudentAndAddress();
//		manyToManyMapping.saveProduct();
	}
}
