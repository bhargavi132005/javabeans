import java.util.Scanner;

public class Problem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Enter the first number (a): ");
            int a = scanner.nextInt();

            System.out.print("Enter the second number (b): ");
            int b = scanner.nextInt();

            System.out.print("Enter the third number (c): ");
            int c = scanner.nextInt();

            int sum = a + b + c;

            if (a >= 40 && b >= 40 && c >= 40) {
                if (sum < 125) {
                    System.out.println("The numbers satisfy the conditions.");
                } else {
                    System.out.println("The sum is greater than or equal to 125.");
                }
            } else {
                System.out.println("One or more numbers are less than 40.");
            }
        } catch (Exception e) {
            System.out.println("Invalid input. Please enter integers only.");
        } finally {
            scanner.close();
        }
    }
}

