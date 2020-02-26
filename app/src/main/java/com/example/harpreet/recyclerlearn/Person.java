package com.example.harpreet.recyclerlearn;

public class Person {
    private  String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getPreference() {
        return preference;
    }

    public void setPreference(String preference) {
        this.preference = preference;
    }

    private  String surname;
    private  String preference;
    public Person(String name, String surname, String preference) {
        this.name = name;
        this.surname = surname;
        this.preference = preference;
    }


}
