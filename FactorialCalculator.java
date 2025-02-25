import java.util.Scanner;

public class FactorialCalculator {
    public static int getNonNegativeInteger() {
        Scanner input = new Scanner(System.in); 
        System.out.print("Enter a non-negative integer: "); 
        int integer = input.nextInt(); 
        return integer; 
    }

    public static long calculateFactorial(int n) {
        if (n == 0) {
            return 1; 
        }

        long factorial = 1; 
        for (int i = 1; i <= n; i++) {
            factorial *= i; 
        }
        
        return factorial;
    }

    public static void main(String[] args) {
        int integer = getNonNegativeInteger();
        System.out.println("The factorial of " + integer + " is: "  +  calculateFactorial(integer));
    }
}