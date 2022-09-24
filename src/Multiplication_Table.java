import java.util.Scanner;
public class Multiplication_Table {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number:");
        int n = sc.nextInt();
        try {
            if (n<=0){
                throw new ArithmeticException("Enter a number greater than 0");
            }
            for (int i = 1; i<=10; i++){
                int result = n * i;
                System.out.printf("%d x %d = %d\n", n, i, result);
            }
        }
        catch (Exception e) {
        System.out.println(e);
        }
    }
}

