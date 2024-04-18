package programmer.application;

import programmer.utils.ArrayUtils;

public class GenericMethodApp {
    public static void main(String[] args) {
        String[] names = {"Dyaksa", "Bagus", "Wicaksono"};
        Integer[] values = {1, 2, 3, 4, 5};

        System.out.println(ArrayUtils.count(names));
        System.out.println(ArrayUtils.count(values));
    }
}
