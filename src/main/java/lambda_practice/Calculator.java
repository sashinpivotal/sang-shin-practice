package lambda_practice;

@FunctionalInterface
public interface Calculator {
    int calculate(int x, int y);
}

class Main5 {
    public static void main(String[] args) {
        Calculator multiply = new Calculator() {
            @Override
            public int calculate(int x, int y) {
                System.out.println("hello");
                System.out.println("hello");
                return x * y;
            }
        };

        Calculator multiply2
                = (x, y) -> {
            System.out.println("hello world");
            System.out.println("hello");
            return x * y;
        };
        int result1 = multiply2.calculate(10, 20);
        System.out.println(result1);

    }
}
