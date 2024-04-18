package programmer.application;

import programmer.generic.MyData;

public class GenericClassesApp {
    public static void main(String[] args) {
        MyData<String> stringData = new MyData<String>("Dyaksa");
        MyData<Integer> integerData = new MyData<Integer>(100);

        String stringValue = stringData.getData();
        Integer integerValue = integerData.getData();

        System.out.println(stringValue);
        System.out.println(integerValue);
    }
}
