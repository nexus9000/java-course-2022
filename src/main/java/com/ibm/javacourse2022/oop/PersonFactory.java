package com.ibm.javacourse2022.oop;

//factory design pattern--creational design pattern
public class PersonFactory {
    public Person getPerson(String personType) {
        //switch
//        if(personType == null) return null;
//        if(personType.equalsIgnoreCase("STUDENT")){
//            return new Student();
//        }else if(personType.equalsIgnoreCase("TEACHER")){
//            return new Teacher();
//        }else if (personType.startsWith("ADMIN")){
//            return new Administrators();
//        }
        switch (personType) {
            case "STUDENT": {
                return new Student();

            }
            case "Teacher": {
                return new Teacher();
            }
            case "admin" :{
                return new Administrators();
            }
            default: {
                return null;
            }
        }
    }
}
