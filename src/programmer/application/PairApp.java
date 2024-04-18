package programmer.application;

import programmer.generic.Pair;

public class PairApp {
    public static void main(String[] args) {
        Pair<String, Integer> pair = new Pair<>("Dyaksa", 20);

        String firstValue = pair.getFirst();
        Integer secondValue = pair.getSecond();

        System.out.println(firstValue);
        System.out.println(secondValue);
    }
}
