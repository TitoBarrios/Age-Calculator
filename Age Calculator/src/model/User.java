package model;

import java.time.LocalDate;
import java.time.Period;

public class User {

    private String name;
    private LocalDate birthday;
    private Period age;

    public User(String name, LocalDate birthday){
        this.name = name;
        this.birthday = birthday;
    }

    public void setAge(Period age) {
    	this.age = age;
    }
    
    public String getName() {
    	return name;
    }
    
    public LocalDate getBirthday() {
    	return birthday;
    }
    
    public Period getAge() {
    	return age;
    }
}