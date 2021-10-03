package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Person person = new Person.Builder()
                        .firstName("Tek")
                        .lastName("Acharya")
                        .age(35)
                        .build();
        System.out.println(person.getFirstName());
    }
}
