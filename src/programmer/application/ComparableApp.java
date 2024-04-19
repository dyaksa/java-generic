package programmer.application;

import programmer.generic.Person;

import java.util.Arrays;

public class ComparableApp {
    public static void main(String[] args) {
        Person[] people = {
                new Person("Jauhar", "Programmer"),
                new Person("Dyaksa", "Designer"),
                new Person("Ucup", "Manager")
        };

        Arrays.sort(people);

        System.out.println(Arrays.toString(people));
    }
}
