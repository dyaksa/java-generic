package programmer.application;

public class MultipleConstraintApp {
    public static void main(String[] args) {
        Data<VicePresident> vPresident = new Data<>(new VicePresident());
        Data<Manager> manager = new Data<>(new Manager());
    }

    public interface CanSayHello {
        void sayHello(String name);
    }

    public static abstract class Employee {

    }

    public static class Manager extends Employee {

    }

    public static class VicePresident extends Manager implements CanSayHello {
        @Override
        public void sayHello(String name) {
            System.out.println("Hello " + name);
        }
    }

    public static class Data<T extends Employee> {
        private T data;

        public Data(T data) {
            this.data = data;
        }

        public T getData() {
            return data;
        }

        public void setData(T data) {
            this.data = data;
        }
    }
}
