import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char choice;
        
        do {
            System.out.println("What operation do you want to perform?");
            System.out.println("1. Addition");
            System.out.println("2. Subtraction");
            System.out.println("3. Multiplication");
            System.out.println("4. Division");
            System.out.println("5. Remainder");
            
            System.out.print("Enter your choice: ");
            int operation = sc.nextInt();
            
            System.out.print("Enter the first number: ");
            int num1 = sc.nextInt();
            
            System.out.print("Enter the second number: ");
            int num2 = sc.nextInt();
            
            switch (operation) {
                case 1:
                    int add = num1 + num2;
                    System.out.println("Sum: " + add);
                    break;
                case 2:
                    int sub = num1 - num2;
                    System.out.println("Difference: " + sub);
                    break;
                case 3:
                    double mult = num1 * num2;
                    System.out.println("Product: " + mult);
                    break;
                case 4:
                    if (num2 != 0) {
                        int div = num1 / num2;
                        System.out.println("Quotient: " + div);
                    } else {
                        System.out.println("Error !!!");
                        System.out.println("Can't Divide By Zero");
                    }
                case 5:
                    if (num2 != 0) {
                        int rem = num1 % num2;
                        System.out.println("Remainder: " + rem);
                    } else {
                        System.out.println("Error !!!");
                        System.out.println("Can't Divide By Zero");
                    }
                    break;
                default:
                    System.out.println("Invalid Input !!!");
                    System.out.println("Enter Proper Number Of The Operation");
                    break;
            }
            
            System.out.print("Do you want to perform operation again? (y/n): ");
            choice = sc.next().charAt(0);
        } while (choice == 'y' || choice == 'Y');
        
    }
}
