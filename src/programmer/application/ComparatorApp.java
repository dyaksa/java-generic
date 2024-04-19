package programmer.application;

import programmer.generic.MethodOtherPeople;

import java.util.Arrays;
import java.util.Comparator;

public class ComparatorApp {
    public static void main(String[] args) {

        MethodOtherPeople[] people = {
                new MethodOtherPeople("Jauhar", "Programmer"),
                new MethodOtherPeople("Dyaksa", "Designer"),
                new MethodOtherPeople("Ucup", "Manager")
        };
        Comparator<MethodOtherPeople> methodOtherPeopleComparator = new Comparator<MethodOtherPeople>() {
            @Override
            public int compare(MethodOtherPeople o1, MethodOtherPeople o2) {
                return o1.getName().compareTo(o2.getName());
            }
        };

        Arrays.sort(people, methodOtherPeopleComparator);

        System.out.println(Arrays.toString(people));
    }
}
