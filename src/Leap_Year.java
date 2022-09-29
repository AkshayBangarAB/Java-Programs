import java.util.Scanner;
public class Leap_Year {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Year:");
        int year = sc.nextInt();
        try {
            if (year <= 0) {
                throw new ArithmeticException("Enter year greater then 0");
            }
            if ((year % 400 == 0) || (year % 4 == 0 && year % 100 != 0)) {
                System.out.println(year + ":is Leap Year");
            } else {
                System.out.println(year + ":is not Leap Year");
            }
        }
        catch (Exception e){
            System.out.println(e);
        }
    }
    }

