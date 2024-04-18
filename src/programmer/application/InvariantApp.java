package programmer.application;

import programmer.generic.MyData;

public class InvariantApp {
    public static void main(String[] args) {
        MyData<String> stringData = new MyData<>("Dyaksa");

//        doIt(stringData); ERROR INVARIANT TIDAK BISA DIUBAH
    }

    public static void doIt(MyData<Object> objectMyData) {

    }
}
