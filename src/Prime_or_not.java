import java.util.Scanner;

public class Prime_or_not {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int temp=0;
        for (int i=2;i<n-1;i++){
            if (n%i==0){
                temp++;
                break;
            }
        }
        if (temp==1){
                System.out.println("Not Prime number");
            }
            else {
                System.out.println("Prime number");
            }
        }
    }
