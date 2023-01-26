import java.util.Scanner;

public class Sum_of_first_n_even_number {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int n = sc.nextInt();

        int sum = 0;
        for (int i=1;i<=n;i++){
            sum = sum+(2*i);
        }
        System.out.println("The sum of 1st n natural number is:"+sum);
    }
}
