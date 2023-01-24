import java.util.Scanner;

public class Leap_Year {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Year: ");
        int year = sc.nextInt();
        try {
            if (year<=0){
                throw new ArithmeticException("Enter year greater than zero");
            }
            if ((year % 400 == 0)||(year % 4 ==0 && year % 100 !=0)){
                System.out.println(year+":is leap year");
            }
            else {
                System.out.println(year+":is not leap year");
            }
        }catch (Exception e){
            System.out.println(e);
        }
    }
}
