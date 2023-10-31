import java.util.Scanner;

public class java_practice {
    public static void main(String[] args) {
        getUserName();
        int a, b;
        System.out.println("Enter two number: ");
        Scanner sc = new Scanner(System.in);
        a = sc.nextInt();
        b = sc.nextInt();
        try {
            double res = divide(a, b);
            System.out.println("Division result: " + res);

            int[] arr = { 1, 2, 3, 4, 5 };
            System.out.println("Enter index to get element from: ");
            int ind = sc.nextInt();
            if (ind < 0) {
                throw new Exception("Array Underflow");
            } else if (ind >= arr.length) {
                throw new Exception("Array Overflow");

            }
            System.out.println("The element is: " + arr[ind]);
        } catch (ArithmeticException e) {
            // e.getStackTrace();
            System.out.println("Arithmetic error:" + e.getMessage());
        } catch (Exception e) {
            System.out.println("General Exception:" + e.getMessage());
            // e.getStackTrace();
        }
    }

    public static void getUserName() {
        Scanner sc = new Scanner(System.in);
        String name;
        System.out.println("Please enter your name:");
        name = sc.nextLine();
        System.out.println("Your name is: " + name);
        // sc.close();
    }

    public static double divide(int a, int b) {
        if (b == 0)
            throw new ArithmeticException("divided by 0");
        return a / b;
    }

}
