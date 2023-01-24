import java.util.Scanner;
public class Palindrome_no_or_not {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any number");
        int n = sc.nextInt();
        int temp=n;
        int rem,reverse=0;
        while (temp!=0){
            rem = temp%10;
            reverse = reverse*10+rem;
            temp = temp/10;
        }
        if (n==reverse){
            System.out.println(n+":is palindrome number");
        }
        else {
            System.out.println(n+":is not palindrome number");
        }
    }
}
