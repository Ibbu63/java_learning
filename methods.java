public class methods {
    public static void main(String[] args) {
        display();
        System.out.println(add(2, 3));
    }

    static void display() {
        System.out.println("Hello");
    }

    static int add(int a, int b) {
        return a + b;
    }
}