package application;

import records.Person;
import records.PersonRecord;

public class App {
    public static void main(String[] args) {
        Person person = new Person("Marlon", "Oliveira", 31);
        System.out.println(person);

        PersonRecord person1 = new PersonRecord("Adriano", "Junior", 28);
        System.out.println(person1);
        System.out.println(person1.age());

        PersonRecord person2 = new PersonRecord("Adriano", "Junior", 30);
        System.out.println(person2);
        System.out.println(person2.age());

        System.out.println(person1.equals(person2));

    }



}
