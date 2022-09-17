package com.ibm.javacourse2022.oop;

//factory design pattern--creational design pattern
public class PersonFactory {
    public Person getPerson(String personType) {
        //switch

        switch (personType) {
            case "STUDENT": {
                return new Student<Student>();

            }
            case "Teacher": {
                return new Teacher<Teacher>();
            }
            case "admin" :{
                return new Administrators<Administrators>();
            }
            default: {
                return null;
            }
        }
    }
}
