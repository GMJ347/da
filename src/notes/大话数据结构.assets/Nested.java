public class Nested {
    private int a = 1;
    private class Inner {
        private int get() {
            return a;
        }
    }
    private void fun() {
        int i = new Inner().get();
    }
    public static void main(String[] args) {
        Nested nested = new Nested();
        nested.fun();
    }
}