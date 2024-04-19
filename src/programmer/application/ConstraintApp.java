package programmer.application;

public class ConstraintApp {
    public static void main(String[] args) {
        Numbers<Integer> integerNumber = new Numbers<>(1000);
        System.out.println(integerNumber.getNumber());
        System.out.println(integerNumber.floatValue());

    }

    public static class Numbers<T extends Number> {
        private T number;

        public Numbers(T number) {
            this.number = number;
        }

        public T getNumber() {
            return number;
        }

        public void setNumber(T number) {
            this.number = number;
        }

        public void display(Number number) {
            System.out.println("The number is " + number);
        }

        public float floatValue() {
            return this.number.floatValue();
        }
    }
}
