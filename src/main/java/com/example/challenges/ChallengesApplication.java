package com.example.challenges;

import java.util.Scanner;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ChallengesApplication {

	public static void main(String[] args) {
		SpringApplication.run(ChallengesApplication.class, args);

		PersonList list = new PersonList();
		list.addPerson(new Person("Alice", 30, "Software Engineer"));
		list.addPerson(new Person("Bob", 35, "Manager"));
		list.addPerson(new Person("Charlie", 40, "CEO"));

		Scanner scan = new Scanner(System.in);
		String search = scan.next();

	Person person = list.findPersonByName(search);
		if (person != null) {
			System.out.println(person);
		} else {
			System.out.println("Person not found");
		}
	}
}
