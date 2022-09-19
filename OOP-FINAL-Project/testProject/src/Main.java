import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("input num : ");
        int num = scanner.nextInt();
        checkNum(num);

        System.out.print("input year : ");
        int year = scanner.nextInt();
        checkYear(year);

        System.out.print("input num : ");
        int oddEven = scanner.nextInt();
        checkOddEven(oddEven);

        System.out.print("input num1 : ");
        int num1 = scanner.nextInt();
        System.out.print("input num2 : ");
        int num2 = scanner.nextInt();
        System.out.print("input num3 : ");
        int num3 = scanner.nextInt();
        sortNums(num1, num2, num3);
        avgNums(num1, num2, num3);
    }

    private static void avgNums(int num1, int num2, int num3) {
        System.out.println((num1 + num2 + num3) / 3);
    }

    private static void sortNums(int num1, int num2, int num3) {
        int max = num3;
        if (num1 > max || num2 > max) {
            if (num1 > num2) {
                max = num1;
            } else {
                max = num2;
            }
        }
        int min = num3;
        if (num1 < min || num2 < min) {
            if (num1 < num2) {
                min = num1;
            } else {
                min = num2;
            }
        }

        int mid = num1 + num2 + num3 - max - min;

        System.out.println("In order" + " " + min + " " + mid + " " + max);
    }

    private static void checkNum(int num1) {
        if (num1 > 0) {
            System.out.println("input num is positive. ");
        } else if (num1 < 0) {
            System.out.println("input num is negattive. ");
        } else {
            System.out.println("input num is zero. ");
        }
    }

    private static void checkYear(int year) {
        if( year % 4 == 0){
            if(year % 100 ==0 && year % 400 !=0){
                System.out.println("this is not leap year.");
            }else {
                System.out.println("this is  leap yaer.");
            }
        }else{
            System.out.println("thi is not leap year. ");
        }
    }
    private static void checkOddEven(int num3) {
        if(num3 %2 ==0){
            System.out.println("Num is even. ");
        }else {
            System.out.println("Num is odd. ");
        }
    }

}