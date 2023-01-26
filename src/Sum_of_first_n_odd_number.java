import java.util.Scanner;

public class Sum_of_first_n_odd_number {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int n =sc.nextInt();

        int sum = 0;
        for (int i =1;i<=n;i++){
            sum = sum+(2*i-1);
        }
        System.out.println("The sum of 1st n odd number is:"+sum);
    }
}
