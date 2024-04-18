package programmer.application;

import programmer.generic.MyData;

public class CoVariantApp {
    public static void main(String[] args) {
        MyData<String> stringData = new MyData<>("Dyaksa");
        process(stringData);

        MyData<?> names = stringData;
        System.out.println(names.getData());
    }

    public static void process(MyData<? extends Object> myData) {
        System.out.println(myData.getData());
    }
}
