package programmer.application;

import programmer.generic.MyData;

public class ContraVariant {
    public static void main(String[] args) {
        MyData<Object> objectData = new MyData<>("Dyaksa");
        MyData<Object> intData = new MyData<>(100);

        process(intData);
        System.out.println(objectData.getData());
    }

    public static void process(MyData<? super String> myData) {
        Object value = myData.getData();
        System.out.println("Process parameter: " + value);
        myData.setData("Jauharuddin");
    }
}
