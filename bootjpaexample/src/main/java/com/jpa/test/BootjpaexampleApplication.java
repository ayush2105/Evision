package com.jpa.test;

import com.jpa.test.dao.UserRepository;
import com.jpa.test.entities.User;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import java.util.Iterator;
import java.util.List;
import java.util.Optional;

@SpringBootApplication
public class BootjpaexampleApplication {

	public static void main(String[] args) {
		ApplicationContext context=SpringApplication.run(BootjpaexampleApplication.class, args);
		UserRepository userRepository=context.getBean(UserRepository.class);
//		User user=new User();
//		user.setName("Ayush");
//		user.setCity("Indore");
//		user.setStatus("Im a Programmer");
//		User user1=userRepository.save(user);
//		System.out.println(user1);
//
//		User user2=new User();
//		user2.setName("Shivani");
//		user2.setCity("Udaipur");
//		user2.setStatus("Real Programmer");
//		//saving single user
//		User user3=userRepository.save(user2);
//		System.out.println(user3);
//		List<User> users=List.of(user,user2);
//		//saving multiple user
//		Iterator<User> u1= userRepository.saveAll(users).iterator();
//		u1.forEachRemaining(user4 -> {
//			System.out.println(user4);
//		});

		//update the user
		Optional<User> u1=userRepository.findById(102);
		User user=u1.get();
		user.setName("Aakash");
		userRepository.save(user);
		System.out.println(user);

//		System.out.println(u1);

//		how to get the data
		Optional<User> u2=userRepository.findById(103);
		System.out.println(u2);
		userRepository.findAll().forEach(System.out::println);

//		how to delete th element
		userRepository.deleteById(3);
		System.out.println("Deleted");

//		custom method
		List<User>u3=userRepository.findByName("Shivani");
		u3.forEach(System.out::println);
		System.out.println("-------------");

		List<User> u4=userRepository.getAllUser();
		u4.forEach(System.out::println);
		System.out.println("!!!!!!!!!!!!!!!!!!!!!!!");

		List<User> u5=userRepository.getUserByName("Ayush");
		u5.forEach(System.out::println);
		System.out.println("^^^^^^^^^^^");

		List<User> u6=userRepository.getUser();
		u6.forEach(System.out::println);








	}

}
