package com.company;

public class Person {
    private  final int id;
    private final String firstName;
    private final String lastName;
    private final int age;

    public int getId() {
        return id;
    }
    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getAge() {
        return age;
    }

    private Person(Builder builder) {
        this.id = builder.id;
        this.firstName = builder.firstName;
        this.lastName = builder.lastName;
        this.age = builder.age;
    }
    public static class Builder{
        private int id;
        private String firstName;
        private String lastName;
        private int age;

        public Builder id(int id) {
            this.id = id;
            return this;
        }
        public Builder firstName(String firstName){
            this.firstName = firstName;
            return this;
        }

        public Builder lastName(String lastName) {
            this.lastName = lastName;
            return this;
        }
        public Builder age(int age) {
            this.age = age;
            return this;
        }
        public Person build(){
            return new Person(this);
        }
    }
}
