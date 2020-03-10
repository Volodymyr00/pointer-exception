import java.util.Scanner;

public class Methods extends Exception {
    Scanner scanner = new Scanner(System.in);
    private int a;
    private int b;

    void calculate() throws Exception {
        System.out.println("Write command: +, - , * , / ");
        String comand = scanner.next();
        switch (comand) {
            case "+":
                addition();
                break;
            case "-":
                subtract();
                break;
            case "*":
                myltiplication();
            case "/":
                division();
                break;
            default:
                throw new IllegalStateException("Unexpected value: " + comand);
        }
    }

    public void addition() throws Exception {
        System.out.println("Write your first number");
        int a = scanner.nextInt();
        System.out.println("Write your second number");
        int b = scanner.nextInt();
        if (a < 0 && b < 0) throw new IllegalArgumentException("A and B are less 0");
        if (a == 0 && b != 0) throw new ArithmeticException("A=0");
        if (a != 0 && b == 0) throw new ArithmeticException("B = 0");
        if (a == 0 && b == 0) throw new IllegalArgumentException("A and B = 0 ");
        if (a > 0 && b > 0) throw new MyException("My Exception");
        a += b;
        System.out.println(a);
    }

    public void subtract() throws MyException {
        System.out.println("Write your first number A");
        int a = scanner.nextInt();
        System.out.println("Write your second number B");
        int b = scanner.nextInt();
        a -= b;
        System.out.println(a);
        if (a < 0 && b < 0) throw new IllegalArgumentException("A and B are less 0");
        if (a == 0 && b != 0) throw new ArithmeticException("A=0");
        if (a != 0 && b == 0) throw new ArithmeticException("B = 0");
        if (a == 0 && b == 0) throw new IllegalArgumentException("A and B = 0 ");
        if (a > 0 && b > 0) throw new MyException("My Exception");
    }

    public void myltiplication() throws MyException {
        System.out.println("Write your first number");
        int a = scanner.nextInt();
        System.out.println("Write your second number");
        int b = scanner.nextInt();
        a *= b;
        System.out.println(a);
        if (a < 0 && b < 0) throw new IllegalArgumentException("A and B are less 0");
        if (a == 0 && b != 0) throw new ArithmeticException("A=0");
        if (a != 0 && b == 0) throw new ArithmeticException("B = 0");
        if (a == 0 && b == 0) throw new IllegalArgumentException("A and B = 0 ");
        if (a > 0 && b > 0) throw new MyException("My Exception");

    }

    public void division() throws MyException {
        System.out.println("Write your first number");
        int a = scanner.nextInt();
        System.out.println("Write your second number");
        int b = scanner.nextInt();
        a /= b;
        System.out.println(a);
        if (a < 0 && b < 0) throw new IllegalArgumentException("A and B are less 0");
        if (a == 0 && b != 0) throw new ArithmeticException("A=0");
        if (a != 0 && b == 0) throw new ArithmeticException("B = 0");
        if (a == 0 && b == 0) throw new IllegalArgumentException("A and B = 0 ");
        if (a > 0 && b > 0) throw new MyException("My Exception");
    }

}

