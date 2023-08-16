public class Function {
    public static void printFactorial(int n) {
        int factorial = 1;
        for (int i = n; i >= 1; i--) {
            factorial = factorial * i;
        }
           System.out.println(factorial);
    }

    public static void main(String[] args) {
        java.util.Scanner sc = new java.util.Scanner(System.in);
        System.out.println("Enter the number:");
        int n =sc.nextInt();
        printFactorial(n);
    }
}