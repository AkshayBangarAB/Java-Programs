import java.util.Scanner;

public class Star_pattern_reverse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number:");
        int n= sc.nextInt();
        try {
            if (n<=0){
                throw new ArithmeticException("Enter number Greater than 0");
            }
            for (int i=1;i<=n;i++){
                for (int j=n; j>=i;j--){
                    System.out.print("*");
                }
                System.out.println();
            }

        }
        catch (Exception e){
            System.out.println(e);
        }
    }
}
