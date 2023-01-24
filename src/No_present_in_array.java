import java.util.Scanner;

public class No_present_in_array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int n = sc.nextInt();
        int arr []={23,44,33,22,111,44,55,66,53};
        boolean isInArray =false;

        for (int element:arr){
            if (element==n){
                isInArray =true;
                break;
            }
        }
        if (isInArray){
            System.out.println(n+": is present in array");
        }else {
            System.out.println(n+": is not present in array");
        }
    }
}
