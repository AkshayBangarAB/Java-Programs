import java.util.Scanner;
public class Armstrong_number_or_not {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int n = sc.nextInt();

        int temp = n;
        int length = 0;
        while (temp != 0){
            length = length + 1;
            temp = temp / 10;
        }

        int temp1 = n;
        int arm = 0;
        while (temp1 != 0){
            int rem,mul = 1;
            rem = temp1 % 10;
            for (int i=1;i<=length;i++) {
                mul = mul * rem;
            }
            arm =arm+ mul;
            temp1 = temp1 / 10;
        }
        if (arm == n){
            System.out.println(n+":is Armstrong number");
        }
        else {
            System.out.println(n+":is not Armstrong number");
        }
    }
}
