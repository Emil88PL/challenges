package com.example.challenges;

import java.util.ArrayList;
import java.util.List;

public class PersonList {
    private List<Person> people;

    public PersonList(){
        this.people = new ArrayList<>();
    }

    public void addPerson(Person person) {
        people.add(person);
    }

    public Person findPersonByName(String name) {
        for (Person person : people) {
            if (person.getName().equals(name)) {
                return person;
            }
        }
        return null;
    }
    
    public void printPeople() {
        people.forEach(System.out::println);
    }
}