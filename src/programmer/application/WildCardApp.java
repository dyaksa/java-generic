package programmer.application;

import programmer.generic.MyData;

public class WildCardApp {
    public static void main(String[] args) {
        MyData<String> str = new MyData<>("Dyaksa");
        MyData<Integer> intNumber = new MyData<>(100);
        MyData<MultipleConstraintApp.Manager> manager = new MyData<>(new MultipleConstraintApp.Manager());

        print(str);
        print(intNumber);
        print(manager);
    }

    public static void print(MyData<?> data) {
        System.out.println(data.getData());
    }
}
